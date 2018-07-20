package com.nickdnepr.places.api.services;

import com.nickdnepr.places.api.database.dao.TypesDao;
import com.nickdnepr.places.api.models.ActivityType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TypesService {

    @Autowired
    TypesDao typesDao;

    public List<ActivityType> getAllTypes(){
        return typesDao.getAllTypes();
    }

    public List<ActivityType> getTypesFromCategory(int categoryId){
        return typesDao.getTypesFromCategory(categoryId);
    }

    public List<ActivityType> getTypesByString(String pattern){
        return typesDao.getTypesByString(pattern);
    }
}
