package com.areteans.ticketbooking.controller;
<<<<<<< HEAD
=======

>>>>>>> origin/master
import com.areteans.ticketbooking.service.UpdateService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
<<<<<<< HEAD
import java.util.Map;
=======

import java.util.Map;

>>>>>>> origin/master
@RestController
@RequiredArgsConstructor
@RequestMapping(path = "update")
public class UpdateController {
    private final UpdateService updateService;
<<<<<<< HEAD
=======

>>>>>>> origin/master
    @PutMapping (path = "passengers", consumes = MediaType.APPLICATION_JSON_VALUE)
    public Map<String, Object> passengerDetails(@RequestBody Map<String, Object> passengers){
        return updateService.updatePassengers(passengers);
    }
<<<<<<< HEAD
}
=======
}
>>>>>>> origin/master
