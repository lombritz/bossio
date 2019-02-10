package io.codil.bossio.model;

import lombok.Data;
import lombok.NonNull;

@Data
public class Property {
    @NonNull private Long id;
    @NonNull private String name;
    @NonNull private Address address;
}
