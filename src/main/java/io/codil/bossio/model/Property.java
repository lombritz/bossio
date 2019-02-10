package io.codil.bossio.model;

import lombok.Data;
import lombok.NonNull;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
public class Property {

    @Id
    @GeneratedValue
    @NonNull
    private Long id;

    @NonNull
    private String name;

    @NonNull
    private Address address;
}
