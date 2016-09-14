package com.jdbc;

import org.springframework.jdbc.core.namedparam.NamedParameterJdbcDaoSupport;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by vashishta on 9/14/16.
 */
public class PersonNamedParameterService extends NamedParameterJdbcDaoSupport {

    /**
     * @return
     */
    public Person getPerson(Long id) {
        String SQL = "select id as id, first_name as firstName from Person where id=:id";

        Map<String, Object> paramMap = new HashMap<String,Object>();
        paramMap.put("id", id);

        Person person =  getNamedParameterJdbcTemplate().queryForObject(SQL, paramMap, new PersonRowMapper());
        return person;
    }

}
