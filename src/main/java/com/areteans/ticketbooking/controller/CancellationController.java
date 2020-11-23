package com.areteans.ticketbooking.controller;

import com.areteans.ticketbooking.service.CancellationService;
import com.areteans.ticketbooking.service.PassengerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping(path = "Cancel")
public class CancellationController {
    private final CancellationService cancellationService;

    @DeleteMapping(value = "ticket/{ticket_no}")
    public void cancellationOfTicket(@PathVariable("ticket_no") Integer ticket_no){
        cancellationService.cancelticket(ticket_no);
    }

    @DeleteMapping(value = "passenger/{passenger_id}")
    public void cancellationOfPassenger(@PathVariable("passenger_id")Integer passenger_id){
        cancellationService.cancelpassenger(passenger_id);
    }

    @DeleteMapping(value = "deletepassenger/{passenger_id}")
    public void deletepassenger(@PathVariable("passenger_id") Long passenger_id){
        cancellationService.deletePassenger(passenger_id);
    }
}
