package com.wxl.boot.service;

import com.wxl.boot.pojo.Region;

public interface IAccesesCheckService {
    public boolean checkAccess(String userId, String country, String province, String city) ;

    public boolean matchesRegion(Region region, String country, String province, String city);
}
