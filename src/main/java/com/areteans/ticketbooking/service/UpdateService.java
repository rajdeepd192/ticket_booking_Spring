package com.areteans.ticketbooking.service;
<<<<<<< HEAD
import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import java.util.Map;
@Service
@RequiredArgsConstructor
public class UpdateService {
=======

import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
@RequiredArgsConstructor
public class UpdateService {

>>>>>>> origin/master
    private final JdbcTemplate jdbcTemplateForUpdate;
    public Map<String,Object> updatePassengers(Map<String,Object> passengers){
        jdbcTemplateForUpdate.update("insert into passengers (passenger_name,age,contact_no) values(?,?,?)",
                passengers.get("passenger_name"),
                Integer.parseInt((String) passengers.get("age")),
                Long.parseLong((String) passengers.get("contact_no")));
<<<<<<< HEAD
        return passengers;
    }
    //to alter a particular row entry????
}
=======

        return passengers;
    }

     //to alter a particular row entry????
}
>>>>>>> origin/master
