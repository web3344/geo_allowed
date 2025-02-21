运行测试用例
用户id和国家不能为空
1.输入：user1
  报错
2.输入：“” CN
  报错
3.输入：user1，CN
  输出：false
其余看测试用例
   @Test
    void User1_Guangdonger() {
        // User1，广东人，只要在广东，则允许访问，现在在广州，应该允许访问
        boolean result = accessCheckService.checkAccess("user1", "CN", "Guangdong", "Guangzhou");
        assertTrue(result);
    }
    @Test
    void User2_Guangdonger() {
        // User2，广东人，只要在广东，则允许访问， 现在在深圳，应该允许访问
        boolean result = accessCheckService.checkAccess("user2", "CN", "Guangdong", "Shenzhen");
        assertTrue(result);
    }
    @Test
    void User3_Hangzhouer() {
        //  User3，杭州人，只有在浙江杭州允许访问， 现在在浙江杭州，应该允许访问
        boolean result = accessCheckService.checkAccess("user3", "CN", "Zhejiang", "Hangzhou");
        assertTrue(result);
    }
    @Test
    void User4_Ningboer() {
        //  User4，宁波人，只有在浙江杭州允许访问， 现在在浙江宁波，应该不允许访问

        boolean result = accessCheckService.checkAccess("user4", "CN", "Zhejiang", "Ningbo");
        assertTrue(result);
    }
