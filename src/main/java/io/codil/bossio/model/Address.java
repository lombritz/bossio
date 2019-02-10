package io.codil.bossio.model;

import lombok.Data;
import lombok.NonNull;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
public class Address {
    @Id
    @GeneratedValue
    private Long id;

    private String number;

    private String street;

    private String postalCode;

    private String city;

    private String country;

    private Double latitude;

    private Double longitude;
}