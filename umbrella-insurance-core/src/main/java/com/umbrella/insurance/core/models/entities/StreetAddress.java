package com.umbrella.insurance.core.models.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "street_addresses", schema = "public")
public class StreetAddress {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "street_address_id", nullable = false)
    private Long id;

    @NotNull
    @Column(name = "street_address_line_1", nullable = false, length = Integer.MAX_VALUE)
    private String streetAddressLine1;

    @Column(name = "street_address_line_2", length = Integer.MAX_VALUE)
    private String streetAddressLine2;

}