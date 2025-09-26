package com.backend.etree.controller;

import com.backend.etree.dto.AskRequest;
import com.backend.etree.dto.AskResponse;
import com.backend.etree.service.AgentService;
import com.backend.etree.service.HelloWorldService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "api/v1/agent")
public class AgentController {

    private final AgentService agentService;

    @Value("${openai.agentId:}")
    private String agentId;

    @Value("${openai.model:gpt-4.1}")
    private String model;

    public AgentController(AgentService agentService) {
        this.agentService = agentService;
    }

    @PostMapping("/strategyAndBusinessModel")
    public ResponseEntity<AskResponse> strategyAndBusinessModel(@Validated @RequestBody AskRequest req) {
        String answer = String.valueOf(agentService.strategyAndBusinessModel(req.getQuestion()));
        return ResponseEntity.ok(new AskResponse(answer, agentId, model));
    }

    @PostMapping("/riskAndOpportunities")
    public ResponseEntity<AskResponse> riskAndOpportunities(@Validated @RequestBody AskRequest req) {
        String answer = String.valueOf(agentService.riskAndOpportunities(req.getQuestion()));
        return ResponseEntity.ok(new AskResponse(answer, agentId, model));
    }

    @PostMapping("/dafo")
    public ResponseEntity<AskResponse> dafo(@Validated @RequestBody AskRequest req) {
        String answer = String.valueOf(agentService.dafo(req.getQuestion()));
        return ResponseEntity.ok(new AskResponse(answer, agentId, model));
    }

    @PostMapping("/valueChain")
    public ResponseEntity<AskResponse> valueChain(@Validated @RequestBody AskRequest req) {
        String answer = String.valueOf(agentService.valueChain(req.getQuestion()));
        return ResponseEntity.ok(new AskResponse(answer, agentId, model));
    }

}
