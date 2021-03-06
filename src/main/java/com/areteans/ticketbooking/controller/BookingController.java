package com.areteans.ticketbooking.controller;

import com.areteans.ticketbooking.models.PassengerJPA;
import com.areteans.ticketbooking.models.Ticket;
import com.areteans.ticketbooking.models.TrainJPA;
import com.areteans.ticketbooking.service.CommonService;
import com.areteans.ticketbooking.service.PassengerService;
import com.areteans.ticketbooking.service.TicketService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.areteans.ticketbooking.service.TrainService;

import java.util.Map;

@RestController
@RequiredArgsConstructor
@RequestMapping(path = "booking")
public class BookingController {
    private final TrainService trainService;
    private final TicketService ticketService;
    private final PassengerService passengerService;
    private final CommonService commonService;

    @PostMapping(path = "train", consumes = MediaType.APPLICATION_JSON_VALUE)
    public Map<String, Object> createDetails(@RequestBody Map<String, Object> train) {
        return trainService.save(train);
    }

    @PostMapping(path = "ticket", consumes = MediaType.APPLICATION_JSON_VALUE)
    public Map<String, Object> ticketDetails(@RequestBody Map<String, Object> ticket) {
        return ticketService.save(ticket);
    }

    @PostMapping(path = "passengers", consumes = MediaType.APPLICATION_JSON_VALUE)
    public Map<String, Object> passengerDetails(@RequestBody Map<String, Object> passengers) {
        return passengerService.save(passengers);
    }

    @PostMapping(path = "passengersJpa", consumes = MediaType.APPLICATION_JSON_VALUE)
    public PassengerJPA passengerData(@RequestBody PassengerJPA passengerJpa) {
        return passengerService.savePassenger(passengerJpa);
    }

    @PostMapping(path = "trainJpa", consumes = MediaType.APPLICATION_JSON_VALUE)
    public TrainJPA trainData(@RequestBody TrainJPA trainJPA) {
        return trainService.saveTrain(trainJPA);
    }

    @PostMapping(path = "nestedPassTick", consumes = MediaType.APPLICATION_JSON_VALUE)
    public Ticket createPassTick(@RequestBody Ticket ticket) {
        return commonService.create(ticket);
    }

    @PostMapping(path = "create", consumes = MediaType.APPLICATION_JSON_VALUE)
    public Map<String, Object> createPassenger(@RequestBody Map<String, Object> passengerJPA) {
        return commonService.createPassengerJpa(passengerJPA);
    }
}


