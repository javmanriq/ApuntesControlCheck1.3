package org.springframework.samples.petclinic.grooming;

import java.time.LocalDate;
import java.util.List;

import org.springframework.samples.petclinic.visit.Visit;

import jakarta.persistence.Transient;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Coupon {
    
    LocalDate startDate;
    
    LocalDate expiryDate;
    
    @Transient
    GroomingPackage groomingPackage;    

    @Transient
    List<Visit> consumed;
}

