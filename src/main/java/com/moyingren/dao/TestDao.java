package com.moyingren.dao;

import com.moyingren.pojo.TestPojo;
import org.springframework.stereotype.Repository;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

@Repository
public class TestDao {
    public List getListByCount(Integer count){
        LinkedList<TestPojo> list = new LinkedList<>();
        Random random = new Random();
        for (int i = 0; i < count; i++) {
            list.add(new TestPojo(count,"P"+random.nextInt(999999)));
        }
        return list;
    }
}
