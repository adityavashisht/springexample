package com.jdbc;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

/**
 * Created by vashishta on 9/14/16.
 */
public class PersonService extends JdbcDaoSupport {

    /**
     *
     * @return
     */
    public String getPerson(Long id) {
        String SQL = "select first_name as firstName from Person where id=" + id;

        String person = getJdbcTemplate().queryForObject(SQL, String.class);
        return person;
    }


}
