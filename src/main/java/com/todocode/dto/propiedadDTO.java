
package com.todocode.dto;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class propiedadDTO {

    private Long id_propiedad;
    private String tipo_propiedad;
    private String direccion;
    private Double valor_alquiler;
    private String nombre;
    private String apellido;
    
    public propiedadDTO() {
    }

    public propiedadDTO(Long id_propiedad, String tipo_propiedad, String direccion, Double valor_alquiler, String nombre, String apellido) {
        this.id_propiedad = id_propiedad;
        this.tipo_propiedad = tipo_propiedad;
        this.direccion = direccion;
        this.valor_alquiler = valor_alquiler;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    

   
    
    
    
}
