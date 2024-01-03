package org.example;

import org.example.model.Tasks;
import org.example.thread.Worker;

public class Main {
    public static void main(String[] args) {
        Tasks tareas1 = new Tasks(false, true, true);
        Tasks tareas2 = new Tasks(false, false, false);
        Tasks tareas3 = new Tasks(true, true, false);

        Runnable workerRunnable1 = new Worker(tareas1, "Jeiny");
        Runnable workerRunnable2 = new Worker(tareas2, "Bonnie");
        Runnable workerRunnable3 = new Worker(tareas3, "Jule");

        Thread worker1 = new Thread(workerRunnable1);
        Thread worker2 = new Thread(workerRunnable2);
        Thread worker3 = new Thread(workerRunnable3);

        worker1.start();
        worker2.start();
        worker3.start();
    }
}