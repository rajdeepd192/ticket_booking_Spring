package com.areteans.ticketbooking.service;

import com.areteans.ticketbooking.models.PassengerJPA;
import com.areteans.ticketbooking.models.TrainJPA;
import com.areteans.ticketbooking.repository.TrainRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
@RequiredArgsConstructor
public class TrainService {

    private final JdbcTemplate jdbcTemplate;
    private final TrainRepository trainRepository;

    public Map<String, Object> save(Map<String, Object> train) {
        Map<String, Object> sMap = jdbcTemplate.queryForMap("insert into train(train_no,train_name,start_city,end_city,total_seats,fare) values(?,?,?,?,?,?) RETURNING train_no",
                Integer.parseInt((String) train.get("train_no")),
                train.get("train_name"),
                train.get("start_city"),
                train.get("end_city"),
                Integer.parseInt((String) train.get("total_seats")),
                Integer.parseInt((String) train.get("fare")));

        train.put("train_no" , sMap.get("train_no"));
        return train;
    }

    public TrainJPA saveTrain(TrainJPA trainJPA) {
        return trainRepository.save(trainJPA);
    }
}






