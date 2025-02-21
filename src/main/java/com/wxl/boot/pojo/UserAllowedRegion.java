package com.wxl.boot.pojo;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("t_user_allowed_region")
public class UserAllowedRegion {
    @TableId
    private String userId;
    private Integer regionId;
}