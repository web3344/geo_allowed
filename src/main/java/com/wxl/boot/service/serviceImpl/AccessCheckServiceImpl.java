package com.wxl.boot.service.serviceImpl;

import com.wxl.boot.mapper.RegionMapper;
import com.wxl.boot.pojo.Region;
import com.wxl.boot.service.IAccesesCheckService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

// AccessCheckServiceImpl.java

@Service
@RequiredArgsConstructor
public class AccessCheckServiceImpl  implements IAccesesCheckService {
    private final RegionMapper regionMapper;

    public boolean checkAccess(String userId, String country, String province, String city) {
        List<Region> allowedRegions = regionMapper.findAllowedRegionsByUserId(userId);
        System.out.println("allowedRegions:"+allowedRegions);
        return allowedRegions.stream().anyMatch(region -> 
            matchesRegion(region, country, province, city));
    }

    public boolean matchesRegion(Region region, String country, String province, String city) {
        return region.getCountryCode().equals(country) &&
                (region.getProvince() == null || region.getProvince().equals(province)) &&
                (region.getCity() == null || region.getCity().equals(city));
    }
}