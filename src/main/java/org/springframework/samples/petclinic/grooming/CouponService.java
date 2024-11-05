package org.springframework.samples.petclinic.grooming;

import java.util.List;

import org.springframework.samples.petclinic.visit.Visit;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
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
        if (c.getStartDate().compareTo(v.getDatetime().toLocalDate()) > 0 ||
                c.getExpiryDate().compareTo(v.getDatetime().toLocalDate()) < 0) {
            throw new UnfeasibleCouponException();
        }
    }
}
