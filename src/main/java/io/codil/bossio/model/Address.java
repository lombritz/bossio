package io.codil.bossio.model;

import lombok.Data;

@Data
public class Address {
    private Long id;
    private String number;
    private String street;
    private String postalCode;
    private String city;
    private String country;
    private Double latitude;
    private Double longitude;
}