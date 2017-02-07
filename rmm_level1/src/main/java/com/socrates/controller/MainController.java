package com.socrates.controller;

import com.socrates.domain.Slot;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MainController {

    @RequestMapping(value = "doctor/", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Slot> openSlotRequest(@RequestParam(value = "origin") String origin){

    }
}
