package com.areteans.ticketbooking.service;

import com.areteans.ticketbooking.models.TrainJPA;
import com.areteans.ticketbooking.repository.TrainRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.Map;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class TrainEnquiryService {
    private final JdbcTemplate jdbctemplateForTrainEq;
    private final TrainRepository trainRepository;
    public Map<String, Object> trainDetails(String start_city, String end_city) {
        return jdbctemplateForTrainEq.queryForMap("select * from train where start_city=? and end_city=?", start_city,end_city);
    }


    public TrainJPA getTrainByID(Long id) {
        Optional<TrainJPA> emp = trainRepository.findById(id);
        if (emp.isPresent()) {
            return emp.get();
        }
        return null;
    }

}
