package com.backend.etree.dto;

public class AskResponse {

    private String answer;
    private String agentId;       // eco opcional
    private String model;         // eco opcional

    public AskResponse(String answer, String agentId, String model) {
        this.answer = answer;
        this.agentId = agentId;
        this.model = model;
    }

    public String getAnswer() { return answer; }
    public String getAgentId() { return agentId; }
    public String getModel() { return model; }
}
