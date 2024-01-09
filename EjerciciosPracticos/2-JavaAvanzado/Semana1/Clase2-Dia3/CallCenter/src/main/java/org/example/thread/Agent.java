package org.example.thread;
import org.example.model.Call;
import java.util.concurrent.BlockingQueue;


public class Agent extends Thread {
    private String name;
    private BlockingQueue<Call> callQueue;

    public Agent(String name, BlockingQueue<Call> callQueue) {
        this.name = name;
        this.callQueue = callQueue;
    }



    public void run(){
        Call call = null;
        while (true){
            try {
                call = callQueue.take();
                attendCall(call);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            if(callQueue.isEmpty()){
                break;
            }
        }
    }

    private void attendCall(Call call) {
        System.out.println("Agent " + name + " attend call by " + call.getClientName() +
                " - Query: " + call.getClientQuery() + " - Info: " + call.getClientInfo());

        System.out.println("Agent " + name + " x " + call.getClientName());
    }

}

