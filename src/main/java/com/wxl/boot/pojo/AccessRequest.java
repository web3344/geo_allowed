package com.wxl.boot.pojo;

import lombok.Data;

import javax.validation.constraints.NotBlank;

// AccessRequest.java
@Data
public class AccessRequest {
    @NotBlank
    private String userId;
    @NotBlank
    private String country;
    private String province;
    private String city;
}