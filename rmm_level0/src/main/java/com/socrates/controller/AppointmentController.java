package com.socrates.controller;

import com.socrates.domain.Doctor;
import com.socrates.domain.OpenSlotList;
import com.socrates.domain.OpenSlotRequest;
import com.socrates.domain.Slot;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class AppointmentController {

    @RequestMapping(value = "appointmentService", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE,consumes = MediaType.APPLICATION_JSON_VALUE)
    public OpenSlotList openSlotRequest(@RequestBody OpenSlotRequest openSlotRequest){
        OpenSlotList openSlotList = new OpenSlotList();
        List<Slot> list = new ArrayList<>();

        Slot slot = new Slot();
        slot.setStart(1400);
        slot.setEnd(1500);
        Doctor doctor = new Doctor();
        doctor.setId(1L);
        doctor.setUsername("mjones");
        slot.setDoctor(doctor);
        list.add(slot);

        Slot slot2 = new Slot();
        slot2.setStart(1500);
        slot2.setEnd(1600);
        Doctor doctor2 = new Doctor();
        doctor2.setId(2L);
        doctor2.setUsername("mjones");
        slot2.setDoctor(doctor2);
        list.add(slot2);

        openSlotList.setSlotList(list);
        return openSlotList;
    }
}
