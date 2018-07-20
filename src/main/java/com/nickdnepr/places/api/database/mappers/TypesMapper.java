package com.nickdnepr.places.api.database.mappers;

import com.nickdnepr.places.api.models.ActivityType;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class TypesMapper implements RowMapper<ActivityType> {
    @Override
    public ActivityType mapRow(ResultSet resultSet, int i) throws SQLException {
        return new ActivityType(resultSet.getLong("id"), resultSet.getString("title"));
    }
}
