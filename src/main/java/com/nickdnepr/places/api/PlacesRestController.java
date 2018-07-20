package com.nickdnepr.places.api;
//Дотянуться до тебя

import com.nickdnepr.places.api.database.dao.TestDao;
import com.nickdnepr.places.api.models.ActivityCategory;
import com.nickdnepr.places.api.models.ActivityType;
import com.nickdnepr.places.api.services.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class PlacesRestController {

    @Autowired
    TestService testDao;

    @RequestMapping(value = "/helloWorld")
    public String helloWorld() {
        return "Hello world";
    }

    @RequestMapping(value =  "/getCategories")
    public List<ActivityCategory> getCategories(){
        List<ActivityCategory> categories = new ArrayList<>();

        List<ActivityType> types = new ArrayList<>();
        types.add(new ActivityType(0, "PaintBall"));
        types.add(new ActivityType(1, "StrikeBall"));
        ActivityCategory active = new ActivityCategory(0, "Active rest", types);

        types = new ArrayList<>();
        types.add(new ActivityType(2, "VrCube"));
        ActivityCategory tech = new ActivityCategory(1, "Tech", types);

        categories.add(active);
        categories.add(tech);
        return categories;
    }

    @RequestMapping(value =  "/getTypes")
    public List<ActivityType> getTypes(){

        return testDao.getTypes();
//        List<ActivityType> types = new ArrayList<>();
//        types.add(new ActivityType(0, "PaintBall"));
//        types.add(new ActivityType(1, "StrikeBall"));
//        types.add(new ActivityType(2, "VrCube"));
//        return types;
    }

}
