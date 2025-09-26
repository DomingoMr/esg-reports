package com.backend.etree.config;

import com.openai.client.OpenAIClient;
import com.openai.client.okhttp.OpenAIOkHttpClient;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenAIConfig {

    @Value("${openai.apiKey:}")
    private String apiKey;

    @Value("${openai.org-id:}")
    private String orgId;

    @Value("${openai.project-id:}")
    private String projectId;


    @Bean
    public OpenAIClient openAIClient() {
        if (apiKey == null || apiKey.isBlank()) {
            throw new IllegalStateException(
                    "Falta openai.apiKey. Define la env var OPENAI_API_KEY o pon openai.apiKey en application.yml");
        }
        OpenAIOkHttpClient.Builder b = OpenAIOkHttpClient.builder().apiKey(apiKey);
        if (orgId != null && !orgId.isBlank()) b.organization(orgId);
        if (projectId != null && !projectId.isBlank()) b.project(projectId);
        return b.build();
    }
}
