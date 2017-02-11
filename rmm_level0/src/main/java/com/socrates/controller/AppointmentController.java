package com.socrates.controller;

import com.socrates.services.AppointmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppointmentController {

    @Autowired
    private AppointmentService appointmentService;

    @RequestMapping(value = "appointmentService", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE,consumes = MediaType.APPLICATION_JSON_VALUE)
    public AppointmentServiceResponse callService(@RequestBody AppointmentServiceRequest appointmentServiceRequest){
        AppointmentServiceResponse appointmentServiceResponse = new AppointmentServiceResponse();
        return appointmentServiceResponse;
    }
}
