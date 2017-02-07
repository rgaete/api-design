package com.socrates.controller;

import com.socrates.domain.Appointment;
import com.socrates.domain.AppointmentRequest;
import com.socrates.domain.OpenSlotRequest;
import com.socrates.domain.Slot;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MainController {

    @RequestMapping(value = "appointmentService/", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Slot> findSlot(@RequestParam(value = "openSlotRequest") OpenSlotRequest openSlotRequest){

        return null;
    }

    @RequestMapping(value = "appointmentService/", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public Appointment appointment(@RequestParam(value = "openSlotRequest") AppointmentRequest appointmentRequest){

        return null;
    }
}
