package org.springframework.samples.petclinic.grooming;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.samples.petclinic.exceptions.ResourceNotFoundException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.security.SecurityRequirement;

@RestController
@RequestMapping("/api/v1/groomingtypes")
@SecurityRequirement(name = "bearerAuth")
public class GroomingTypeController {
    @Autowired
    GroomingTypeService gs;

    @GetMapping
    public List<GroomingType> findAll() {
        return gs.getAllGroomingTypes();
    }

    @GetMapping("/{id}")
    public GroomingType findGroomingTypeById(@PathVariable("id") Integer id) {
        GroomingType type = gs.getGroomingTypeById(id);
        if (type == null) {
            throw new ResourceNotFoundException("No existe un tipo con dicha id" + id);
        }
        return type;
    }
    
}
