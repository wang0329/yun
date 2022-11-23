package com.yun.service;

import com.yun.dao.TestDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Service
//@Scope("prototype")
public class TestService {
    @Autowired
    private TestDao testDao;

//    public TestService() {
//        System.out.println("实例化TestService");
//    }
//
//    @PostConstruct
//    public void init() {
//        System.out.println("初始化TestService");
//    }
//
//    @PreDestroy
//    public void destroy() {
//        System.out.println("销毁TestService");
//    }

    public String find() {
        return testDao.select();
    }
}
