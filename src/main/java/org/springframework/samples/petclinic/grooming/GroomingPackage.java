package org.springframework.samples.petclinic.grooming;

import java.util.List;

import org.springframework.samples.petclinic.model.BaseEntity;

import jakarta.persistence.Transient;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class GroomingPackage extends BaseEntity {
    double cost;

    String description;

    @Transient
    List<GroomingType> contents;
}
