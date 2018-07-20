package com.nickdnepr.places.api.services;

import com.nickdnepr.places.api.database.dao.TestDao;
import com.nickdnepr.places.api.models.ActivityType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestService {

    @Autowired
    TestDao dao;

    public List<ActivityType> getTypes(){
        return dao.getData();
    }


}
