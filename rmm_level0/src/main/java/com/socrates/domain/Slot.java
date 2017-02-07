package com.socrates.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
public class Slot {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Setter
    private Long id;

    @Getter
    @Setter
    @ManyToOne(cascade = CascadeType.ALL)
    private Doctor doctor;

    @Getter
    @Setter
    private int start;

    @Getter
    @Setter
    private int end;

}
