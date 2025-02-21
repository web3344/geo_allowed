package com.wxl.boot.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("t_region")
public class Region {
    @TableId(type = IdType.AUTO)
    private Integer id;
    private String countryCode;
    private String province;
    private String city;
}