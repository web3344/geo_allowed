package com.wxl.boot.controller;

import com.wxl.boot.pojo.AccessRequest;
import com.wxl.boot.service.serviceImpl.AccessCheckService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

// AccessController.java
@RestController
@RequiredArgsConstructor
public class AccessController {
    private final AccessCheckService accessCheckService;

    @PostMapping("/check-access")
    public ResponseEntity<?> checkAccess(@RequestBody AccessRequest request) {
        if (request.getUserId() == null || request.getCountry() == null) {
            return ResponseEntity.badRequest().body(Map.of("error", "userId and country are required"));
        }
        boolean allowed = accessCheckService.checkAccess(
            request.getUserId(),
            request.getCountry(),
            request.getProvince(),
            request.getCity()
        );
        return ResponseEntity.ok(Map.of("allowed", allowed));
    }
}