package org.springframework.samples.petclinic.grooming;

import java.util.List;
import java.util.Optional;

public interface CouponRepository {
    Coupon save(Coupon o);
    List<Coupon> findAll();
    Optional<Coupon> findById(Integer id);
}
