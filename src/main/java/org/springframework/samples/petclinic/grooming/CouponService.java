package org.springframework.samples.petclinic.grooming;

import java.util.List;

import org.springframework.samples.petclinic.visit.Visit;


public class CouponService {
    private CouponRepository cr;

    public CouponService(CouponRepository cr){
        this.cr=cr;
    }

    public Coupon save(Coupon d) {
        // TODO: Change this
        return null;
    }
    
    public List<Coupon> getAll() {
        // TODO: Change this
        return null;
    }    

    public void addVisit(Coupon c, Visit v) throws UnfeasibleCouponException {
        // TODO: Change this
    }
}
