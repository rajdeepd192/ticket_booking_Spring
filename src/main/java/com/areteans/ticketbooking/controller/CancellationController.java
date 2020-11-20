package com.areteans.ticketbooking.controller;

import com.areteans.ticketbooking.service.CancellationService;
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

    @DeleteMapping(path = "passenger/{passenger_id}")
    public void cancellationOfPassenger(@PathVariable("passenger_id")Integer passenger_id){
        cancellationService.cancelpassenger(passenger_id);
    }
}
