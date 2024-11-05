package org.springframework.samples.petclinic.grooming;

import java.util.List;

import org.springframework.samples.petclinic.visit.Visit;
import org.springframework.transaction.annotation.Transactional;


public class CouponService {
    private CouponRepository cr;

    public CouponService(CouponRepository cr){
        this.cr=cr;
    }

    @Transactional
    public Coupon save(Coupon d) {
        // TODO: Change this
        return cr.save(d);
    }
    
    @Transactional(readOnly = true)
    public List<Coupon> getAll() {
        // TODO: Change this
        return cr.findAll();
    }

    public void addVisit(Coupon c, Visit v) throws UnfeasibleCouponException {
        // TODO: Change this
    }
}
