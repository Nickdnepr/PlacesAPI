package com.nickdnepr.places.api.database.dao;

import com.nickdnepr.places.api.database.mappers.TypesMapper;
import com.nickdnepr.places.api.models.ActivityType;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import java.util.List;

public class TypesDao extends JdbcDaoSupport {


    public List<ActivityType> getAllTypes() {
        String sql = "SELECT * from types";

        List<ActivityType> types = getJdbcTemplate().query(sql, new TypesMapper());

        return types;
    }

    public List<ActivityType> getTypesFromCategory(int categoryId) {
        String sql =
                "select tp.*\n" +
                        "from types tp, activities act, crr_type_activity crr\n" +
                        "where tp.id = crr.type_id and crr.activity_id = act.id and act.id = ?;";

        List<ActivityType> types = getJdbcTemplate().query(sql, new TypesMapper(), categoryId);

        return types;
    }

    public List<ActivityType> getTypesByString(String pattern) {
        pattern = "%" + pattern + "%";
        String sql = "select * from types tp where lower(tp.title) like lower(?);";

        List<ActivityType> types = getJdbcTemplate().query(sql, new TypesMapper(), pattern);

        return types;
    }

}
