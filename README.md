# DDD学习

## 一、MVC架构

（1）MVC分层架构

![img](https://bugstack.cn/images/roadmap/tutorial/road-map-230623-02.png?raw=true)

（2）MVC调用关系

![img](https://bugstack.cn/images/roadmap/tutorial/road-map-230623-03.png?raw=true)


（3）构建经典的MVC架构代码

- Application.java 是启动程序的 SpringBoot 应用
- common 是额外添加的一个层，用于定义通用的类（比如枚举之类的）
- controller 控制层，提供接口实现。
- dao 数据库操作层
- domain 对象定义层 
  - req：请求
  - res：响应
  - po：数据库对象
  - vo：给前端的展示对象
- service 服务实现层


├── docs
│   └── mvc.drawio - 架构文档
├── pom.xml
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com
│   │   │       └── yang
│   │   │              ├── Application.java
│   │   │              ├── common
│   │   │              │   ├── Constants.java
│   │   │              │   └── Result.java
│   │   │              ├── controller
│   │   │              │   └── UserController.java
│   │   │              ├── dao
│   │   │              │   └── IUserDao.java
│   │   │              ├── domain
│   │   │              │   ├── po
│   │   │              │   │   └── User.java
│   │   │              │   ├── req
│   │   │              │   │   └── UserReq.java
│   │   │              │   ├── res
│   │   │              │   │   └── UserRes.java
│   │   │              │   └── vo
│   │   │              │       └── UserInfo.java
│   │   │              └── service
│   │   │                       ├── IUserService.java
│   │   │                       └── impl
│   │   │                           └── UserServiceImpl.java
│   │   └── resources
│   │       ├── application.yml
│   │       └── mybatis
│   │           ├── config
│   │           │   └── mybatis-config.xml
│   │           └── mapper
│   │               └── User_Mapper.xml
│   └── test
│       └── java
│           └── cn
│               └── bugstack
│                   └── xfg
│                       └── frame
│                           └── test
│                               └── ApiTest.java
└── user.sql

## 



