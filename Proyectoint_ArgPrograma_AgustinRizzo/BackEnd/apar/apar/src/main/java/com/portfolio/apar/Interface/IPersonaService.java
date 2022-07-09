
package com.portfolio.apar.Interface;

import com.portfolio.apar.Entity.Persona;
import java.util.List;



public interface IPersonaService {
    //Traer una lista de Persona  
    public List<Persona> getPersona();
    
//Guardar un objeto de tipo persona
    public void savePersona(Persona persona);
    
    //Eliminar un usuarion pero lo eliminamos por ID
    public void deletePersona(Long id);
    
    //Buscar una persona pero por ID
    
    public Persona findPersona(Long id);
    
}
