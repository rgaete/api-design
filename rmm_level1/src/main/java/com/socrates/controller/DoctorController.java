package com.socrates.controller;

import com.socrates.domain.*;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class DoctorController {

    @RequestMapping(value = "doctors/{id}",method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public List<Slot> findSlot(@RequestBody OpenSlotRequest openSlotRequest, @PathVariable("id") String id){
        List<Slot> slots = new ArrayList<>();
        Slot slot1 = new Slot();
        slot1.setStart(1400);
        slot1.setEnd(1500);
        slot1.setId(1L);
        Doctor doctor = new Doctor();
        doctor.setUsername(openSlotRequest.getDoctor().getUsername());
        doctor.setId(openSlotRequest.getDoctor().getId());
        slot1.setDoctor(doctor);
        slots.add(slot1);
        return slots;
    }

    @RequestMapping(value = "appointmentService/", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public Appointment appointment(@RequestParam(value = "openSlotRequest") AppointmentRequest appointmentRequest){

        return null;
    }
}
