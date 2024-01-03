package org.example;

public class Agent extends Thread {
    private Call call;
    private String agentName;

    public Agent(Call call, String agentName) {
        this.call = call;
        this.agentName = agentName;
    }

    @Override
    public void run() {
        System.out.println(agentName + " - " + call.toString());
    }
}
