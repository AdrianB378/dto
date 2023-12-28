
package com.todocode.dtocontroller;

import com.todocode.dto.Inquilino;
import com.todocode.dto.Propiedad;
import com.todocode.dto.propiedadDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;




@RestController
public class ApliacionController {
    
     @GetMapping ("/propiedad/{id}")
     @ResponseBody
    public propiedadDTO devolverPropiedad (@PathVariable Long id) {
        // Que a traves de la id buscamos la propiedad
        // Trajimos al inquilino asociado a esa propiedad
        
        Propiedad prop = new Propiedad (15487L, "Casa", "308 Negro Arroyo Lane",200.0, 40000.0 );
        Inquilino inqui = new Inquilino (1L, "12345678","Walter", "White", "Profesor de quimica" );
        
        propiedadDTO propiDTO = new propiedadDTO();
        
        // Asignamos los datos que necesitamos de  propiedad
        propiDTO.setId_propiedad(prop.getId_propiedad());
        propiDTO.setTipo_propiedad(prop.getTipo_propiedad());
        propiDTO.setDireccion(prop.getDireccion());
        propiDTO.setValor_alquiler(prop.getValor_alquiler());
        // Asignamos los datos que necesitamos de inquilino
        propiDTO.setNombre(inqui.getNombre());
        propiDTO.setApellido(inqui.getApellido());
        
        return propiDTO;
        // Habria que hacer de nuevo el ejercicio.
    }
    
}
