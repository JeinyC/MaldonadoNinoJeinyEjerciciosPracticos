package org.example;

import org.example.model.Call;
import org.example.thread.Agent;

public class Main {
    public static void main(String[] args) {
        Call call1 = new Call("Frank", "PC", "Not info");
        Call call2 = new Call("Gerard", "TV", "succes");
        Call call3 = new Call("Ray", "PC", "Next call 2 Feb");

        Agent agent1 = new Agent(call1, "Jeiny");
        Agent agent2 = new Agent(call2, "Bonnie");
        Agent agent3 = new Agent(call3, "Jule");

        agent1.start();
        agent2.start();
        agent3.start();
    }
}