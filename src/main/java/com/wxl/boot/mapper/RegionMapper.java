package com.wxl.boot.mapper;

import com.wxl.boot.pojo.Region;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

// RegionMapper.java
@Mapper
public interface RegionMapper {
//    @Select("SELECT * FROM t_region WHERE id IN " +
//            "(SELECT region_id FROM t_user_allowed_region WHERE user_id = #{userId})")
    List<Region> findAllowedRegionsByUserId(String userId);
}