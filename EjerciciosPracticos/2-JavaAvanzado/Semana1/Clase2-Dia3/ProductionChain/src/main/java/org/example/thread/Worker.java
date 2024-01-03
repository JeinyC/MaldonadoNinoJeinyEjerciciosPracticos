package org.example.thread;

import org.example.model.Tasks;

public class Worker  implements Runnable {

    private final Tasks task;
    private final String name;

    public Worker(Tasks task, String name) {
        this.task = task;
        this.name = name;
    }
    @Override
    public void run() {
        System.out.println(name + " - " + "You must assemble products = " + task.isAssembleProducts() + " - " +
                " You must perform quality checks = " + task.isPerformQualityChecks() + " - " + " You must pack products = " + task.isPackProducts() + " - ");
    }
}