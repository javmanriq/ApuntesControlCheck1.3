package org.springframework.samples.petclinic.grooming;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

public class GroomingPackageService {
    GroomingPackageRepository gr;
   
    public GroomingPackageService(GroomingPackageRepository gr){
        this.gr=gr;
    }

    @Transactional
    public GroomingPackage save(GroomingPackage o) {
        // TODO: Change this
        return gr.save(o);
    }
    
    @Transactional(readOnly = true)
    public List<GroomingPackage> getAll() {
        // TODO: Change this
        return gr.findAll();
    }
    
}
