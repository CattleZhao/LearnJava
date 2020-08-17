package com.scorpion.multithread.future;

import java.io.IOException;
import java.util.concurrent.CompletableFuture;

public class AliProblemCompletableFuture {
    public static void main(String[] args) throws IOException {
        Task task1 = new Task("task1", 100, true);
        Task task2 = new Task("task2", 50, true);
        Task task3 = new Task("task3", 1, false);
        CompletableFuture f1 = CompletableFuture.supplyAsync(() -> task1.call()).thenAccept(result -> callback(result));
        CompletableFuture f2 = CompletableFuture.supplyAsync(() -> task2.call()).thenAccept(result -> callback(result));
        CompletableFuture f3 = CompletableFuture.supplyAsync(() -> task3.call()).thenAccept(result -> callback(result));
        System.in.read();
    }

    private static void callback(boolean res) {
        if (res == false)
            System.exit(0);
    }

    private static class Task {
        private String taskName;
        private int sleepSeconds;
        private boolean res;

        public Task(String taskName, int sleepSeconds, boolean res) {
            this.taskName = taskName;
            this.sleepSeconds = sleepSeconds;
            this.res = res;
        }

        public boolean call() {
            try {
                Thread.sleep(sleepSeconds);
            } catch (Exception e) {
                e.printStackTrace();
            }
            System.out.println("Task " + taskName + " callback");
            return res;
        }
    }
}
