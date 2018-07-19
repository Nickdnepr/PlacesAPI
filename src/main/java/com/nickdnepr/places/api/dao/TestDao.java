package com.nickdnepr.places.api.dao;

import com.nickdnepr.places.api.mappers.TypesMapper;
import com.nickdnepr.places.api.models.ActivityType;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import java.util.List;


public class TestDao extends JdbcDaoSupport {

    public List<ActivityType> getData() {
        String sql = "SELECT * from types";

        List<ActivityType> types = getJdbcTemplate().query(sql, new TypesMapper());

        return types;
    }

}
