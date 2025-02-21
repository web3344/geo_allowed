package com.wxl.boot.service;

public interface IAccesesCheckService {
     boolean checkAccess(String userId, String country, String province, String city) ;

//    public boolean matchesRegion(Region region, String country, String province, String city);
}
