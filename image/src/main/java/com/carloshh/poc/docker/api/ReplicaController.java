package com.carloshh.poc.docker.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
public class ReplicaController {

    private final String replicaId;

    public ReplicaController() {
        this.replicaId = UUID.randomUUID().toString();
    }

    @GetMapping("/replica")
    public String replica() {
        return "ReplicaId=" + replicaId;
    }

}
