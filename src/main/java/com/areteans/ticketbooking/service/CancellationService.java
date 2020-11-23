package com.areteans.ticketbooking.service;

import com.areteans.ticketbooking.repository.PassengerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class CancellationService {
    private final JdbcTemplate jdbcTemplateForCancellation;
    private final PassengerRepository passengerRepository;

    public  void cancelticket(Integer ticket_no) {
         jdbcTemplateForCancellation.update("Delete from ticket where ticket_no=?", ticket_no);
    }
    public void cancelpassenger(Integer passenger_id) {
         jdbcTemplateForCancellation.update("Delete from passengers where passenger_id=?", passenger_id);
    }

    public void deletePassenger(long id){
        passengerRepository.deleteById(id);
    }



}
