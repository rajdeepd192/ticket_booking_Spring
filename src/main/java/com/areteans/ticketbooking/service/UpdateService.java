package com.areteans.ticketbooking.service;

import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
@RequiredArgsConstructor
public class UpdateService {

    private final JdbcTemplate jdbcTemplateForUpdate;
    public Map<String,Object> updatePassengers(Map<String,Object> passengers){
        jdbcTemplateForUpdate.update("update passengers set passenger_name=?,age=?,contact_no=? where passenger_id = ?",
                passengers.get("passenger_name"),
                Integer.parseInt((String) passengers.get("age")),
                Long.parseLong((String) passengers.get("contact_no")),
                Long.parseLong((String) passengers.get("passenger_id")));

        return passengers;
    }
    public Map<String,Object> updateTrain(Map<String,Object> train){
        jdbcTemplateForUpdate.update("update train set total_seats=?,fare=? where train_no = ?",

                Long.parseLong((String) train.get("total_seats")),
                Long.parseLong((String) train.get("fare")),
                Long.parseLong((String) train.get("train_no")));

        return train;
    }

}