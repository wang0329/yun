package com.yun.dao;

import org.springframework.stereotype.Repository;

@Repository("testDaoHibernate")
public class TestDaoHibernateImpl implements TestDao{
    @Override
    public String select() {
        return "Hibernate";
    }
}
