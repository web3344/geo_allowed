package com.wxl.boot.pojo;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

// AccessRequest.java
@Data
public class AccessRequest {
    @NotBlank( message = "userId不能为空") // 添加注解，表示字段不能为空
//    @NotNull(message = "userId不能为空")
    private String userId;
    @NotBlank( message = "country不能为空")
    private String country;
    private String province;
    private String city;
}