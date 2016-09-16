package com.mybatis;

import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by vashishta on 9/16/16.
 */
public interface PersonMapper {

    Person getById(@Param("id") Long id);

    List<Person> all();

    void newPerson(@Param("person") Person person);
}
