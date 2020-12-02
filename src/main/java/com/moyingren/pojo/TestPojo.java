package com.moyingren.pojo;

import org.springframework.stereotype.Component;

@Component
public class TestPojo {
    private Integer id;
    private String name;

    public TestPojo() {
    }

    public TestPojo(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
