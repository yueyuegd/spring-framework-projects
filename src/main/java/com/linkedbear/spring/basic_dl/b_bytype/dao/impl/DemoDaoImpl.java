package com.linkedbear.spring.basic_dl.b_bytype.dao.impl;

import com.linkedbear.spring.basic_dl.b_bytype.dao.DemoDao;

import java.util.ArrayList;
import java.util.List;

public class DemoDaoImpl implements DemoDao {
    @Override
    public List<String> finaAll() {
        List<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        return list;
    }
}
