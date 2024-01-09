package org.example;

import org.example.model.Call;
import org.example.thread.Agent;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class Main {
    public static void main(String[] args) {
        Call call1 = new Call("Frank", "PC", "Not info");
        Call call2 = new Call("Gerard", "TV", "succes");
        Call call3 = new Call("Ray", "PC", "Next call 2 Feb");
        BlockingQueue<Call> callBlockingQueue = new LinkedBlockingQueue<>();


        Agent agent1 = new Agent("Jeiny", callBlockingQueue);
        Agent agent2 = new Agent("Bonnie", callBlockingQueue);

        agent1.start();
        agent2.start();

        callBlockingQueue.add(call1);
        callBlockingQueue.add(call2);
        callBlockingQueue.add(call3);

        try {
            agent1.join();
            agent2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}