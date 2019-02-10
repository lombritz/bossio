package io.codil.bossio.model;

import lombok.Data;
import lombok.NonNull;

import javax.persistence.*;

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
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "address_id")
    private Address address;
}
