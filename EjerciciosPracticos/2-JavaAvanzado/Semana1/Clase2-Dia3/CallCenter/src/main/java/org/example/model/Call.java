package org.example.model;

public class Call {
    private final String clientName;
    private final String clientQuery;
    private final String clientInfo;

    public Call(String clientName, String clientQuery, String clientInfo) {
        this.clientName = clientName;
        this.clientQuery = clientQuery;
        this.clientInfo = clientInfo;
    }

    public String getClientName() {
        return clientName;
    }

    public String getClientQuery() {
        return clientQuery;
    }

    public String getClientInfo() {
        return clientInfo;
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
