package com.example.demospringday2.model;

import lombok.*;

@Data  //getters, setters, toString, EqualsHashcode
@NoArgsConstructor
@AllArgsConstructor

public class Institute {
    private int id;
    private String name;
    private String address;
    private String registrationNo;


}
