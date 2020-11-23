package com.areteans.ticketbooking.controller;


import com.areteans.ticketbooking.models.PassengerJPA;
import com.areteans.ticketbooking.models.TrainJPA;
import com.areteans.ticketbooking.service.PassengerEnquiryService;
import com.areteans.ticketbooking.service.TicketEnquiryService;
import com.areteans.ticketbooking.service.TrainEnquiryService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequiredArgsConstructor
@RequestMapping(path = "enquiry")
public class EnquiryController {
    private final TicketEnquiryService ticketEnquiryService;
    private final TrainEnquiryService trainEnquiryService;
    private final PassengerEnquiryService passengerEnquiryService;

    @GetMapping(path = "ticket")
    public Map<String, Object> getTicketDetails(@RequestParam(value = "ticket_no")Integer ticket_no){
    return this.ticketEnquiryService.ticketDetails(ticket_no);
    }
    @GetMapping(path = "train")
    public Map<String, Object> getTrainDetails(@RequestParam(value = "start_city")String start_city,
                                               @RequestParam(value = "end_city")String end_city){
        return this.trainEnquiryService.trainDetails(start_city,end_city);
    }
    @GetMapping(path = "passenger")
    public Map<String, Object> getPassengerDetails(@RequestParam(value = "passenger_id")Integer passenger_id){
        return this.passengerEnquiryService.passengerDetails(passenger_id);
    }

    @GetMapping(path = "passengerJpa")
    public PassengerJPA searchPassenger(@RequestParam(value = "passenger_id")Long passenger_id) {
        return passengerEnquiryService.getPassengerByID(passenger_id);
    }

    @GetMapping(path = "trainJpa")
    public TrainJPA searchTrain(@RequestParam(value = "train_no")Long train_no) {
        return trainEnquiryService.getTrainByID(train_no);
    }
}
