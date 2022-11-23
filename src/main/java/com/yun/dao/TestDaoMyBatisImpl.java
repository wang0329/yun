package com.yun.dao;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

@Repository
@Primary
public class TestDaoMyBatisImpl implements TestDao{
    @Override
    public String select() {
        return "NyBatis";
    }
}
