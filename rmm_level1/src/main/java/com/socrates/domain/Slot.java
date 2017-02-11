package com.socrates.domain;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Slot {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    private Doctor doctor;

    private int start;

    private int end;

}
