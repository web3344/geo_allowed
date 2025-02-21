```markdown
# 区域访问权限检查系统

## 简介
基于 Spring Boot 的轻量级 API，通过用户地理位置动态校验功能访问权限。

## 技术栈
- 框架：Spring Boot 3.x
- 数据库：MySQL 8.x
- ORM：MyBatis
- 构建工具：Maven

## 快速启动

### 1. 数据库配置
```sql
CREATE DATABASE geo_db;
-- 执行 src/data.sql 初始化数据
```

### 2. 修改配置
```yaml
# application.yml
spring.datasource:
  url: jdbc:mysql://localhost:3306/access_db
  username: [your_username]
  password: [your_password]
```

### 3. 运行服务
```bash
mvn spring-boot:run
```

## API 接口
```bash
POST /check-access
Content-Type: application/json

{
  "userId": "user1",
  "country": "CN",
  "province": "Zhejiang",
  "city": "Hangzhou"
}

# 响应示例
{ "allowed": true }
```

## 测试验证
```bash
# 单元测试
mvn test

# 接口测试
curl -X POST http://localhost:8080/check-access -d @request.json
```


