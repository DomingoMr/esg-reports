package com.backend.etree.dto;

import javax.validation.constraints.NotBlank;

public class AskRequest {

    @NotBlank
    private String question;

    private String sessionId; // útil para mantener contexto si luego lo gestionas

    // getters/setters
    public String getQuestion() { return question; }
    public void setQuestion(String question) { this.question = question; }
    public String getSessionId() { return sessionId; }
    public void setSessionId(String sessionId) { this.sessionId = sessionId; }
}
