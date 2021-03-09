package com.shenjies88.practice.clickhouse;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author shenjies88
 * @since 2021/3/9-3:28 PM
 */
@Mapper
public interface UserMapper {

    void insert();

    List<User> listAll();

    void delete();

    void update();
}
