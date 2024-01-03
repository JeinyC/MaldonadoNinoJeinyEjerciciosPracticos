package org.example;

public class Call {
    private String clientName;
    private String clientQuery;
    private String clientInfo;

    public Call(String clientName, String clientQuery, String clientInfo) {
        this.clientName = clientName;
        this.clientQuery = clientQuery;
        this.clientInfo = clientInfo;
    }

    public Call() {

    }

    @Override
    public String toString() {
        return "Call{" +
                "clientName='" + clientName + '\'' +
                ", clientQuery='" + clientQuery + '\'' +
                ", clientInfo='" + clientInfo + '\'' +
                '}';
    }
}
