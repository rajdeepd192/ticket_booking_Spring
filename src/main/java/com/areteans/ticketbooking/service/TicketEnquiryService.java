package com.areteans.ticketbooking.service;

import com.areteans.ticketbooking.models.PassengerJPA;
import com.areteans.ticketbooking.models.TrainJPA;
import com.areteans.ticketbooking.repository.TrainRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.Map;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class TicketEnquiryService {
    private final JdbcTemplate jdbctemplateForTicketEq;

    public Map<String, Object> ticketDetails(Integer ticket_no) {
        return jdbctemplateForTicketEq.queryForMap("select * from ticket where ticket_no=?", ticket_no);
    }




    }

