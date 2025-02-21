package com.wxl.boot.controller;

import com.wxl.boot.pojo.AccessRequest;
import com.wxl.boot.pojo.Result;
import com.wxl.boot.service.IAccesesCheckService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

// AccessController.java
@RestController
@RequiredArgsConstructor
public class AccessController {
    @Autowired
    private IAccesesCheckService  accessCheckService;

    @PostMapping("/check-access")
    public Result<String> checkAccess(@Validated @RequestBody AccessRequest request) {// todo 添加参数合法化例如 @Valid @NotBlank
//        todo统一异常处理,其实这里不加也可以，因为参数合法化已经在AccessRequest中添加了@NotBlank注解
//        if (request.getUserId() == null|| request.getUserId().isEmpty()) {
//            return ResponseEntity.badRequest().body(Map.of("error", "UserId is required"));
//        }
//        if (request.getCountry() == null || request.getCountry().isEmpty() )
//            return ResponseEntity.badRequest().body(Map.of("error", "country is required"));




        boolean allowed = accessCheckService.checkAccess(
            request.getUserId(),
            request.getCountry(),
            request.getProvince(),
            request.getCity()
        );

        return Result.success("allowed:"+allowed);//
    }
}