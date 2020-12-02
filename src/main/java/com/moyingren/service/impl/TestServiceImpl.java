package com.moyingren.service.impl;

import com.moyingren.dao.TestDao;
import com.moyingren.result.ResponseResult;
import com.moyingren.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestServiceImpl implements TestService {
    @Autowired
    private TestDao testDao;
    @Override
    public ResponseResult test01() {
        List listByCount = testDao.getListByCount(1);
        return new ResponseResult(listByCount);
    }

    @Override
    public ResponseResult test02() {
        List listByCount = testDao.getListByCount(2);
        return new ResponseResult(listByCount);
    }

    @Override
    public ResponseResult test03() {
        List listByCount = testDao.getListByCount(3);
        return new ResponseResult(listByCount);
    }

    @Override
    public ResponseResult test04() {
        List listByCount = testDao.getListByCount(4);
        return new ResponseResult(listByCount);
    }

    @Override
    public ResponseResult test05() {
        List listByCount = testDao.getListByCount(5);
        return new ResponseResult(listByCount);
    }
}
