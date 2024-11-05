package org.springframework.samples.petclinic.grooming;

import java.util.List;

public class GroomingPackageService {
    GroomingPackageRepository gr;
   
    public GroomingPackageService(GroomingPackageRepository gr){
        this.gr=gr;
    }

    public GroomingPackage save(GroomingPackage o) {
        // TODO: Change this
        return null;
    }
    
    public List<GroomingPackage> getAll() {
        // TODO: Change this
        return null;
    }
    
}
