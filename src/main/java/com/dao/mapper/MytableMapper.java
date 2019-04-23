package com.dao.mapper;

import com.dao.bean.Mytable;

public interface MytableMapper {
    int insert(Mytable record);

    int insertSelective(Mytable record);
}