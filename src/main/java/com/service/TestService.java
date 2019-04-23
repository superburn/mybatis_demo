package com.service;

import com.dao.bean.Mytable;
import com.dao.mapper.MytableMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestService {
    @Autowired
    private MytableMapper mytableMapper;

    public int insert(){
        Mytable test = new Mytable();
        test.setId(2);
        test.setUsername("Tom");
        return mytableMapper.insertSelective(test);
    }
}
