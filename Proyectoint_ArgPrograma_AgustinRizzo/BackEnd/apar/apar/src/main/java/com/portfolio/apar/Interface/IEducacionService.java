package com.portfolio.apar.Interface;

import com.portfolio.apar.Entity.Educacion;
import java.util.List;



public interface IEducacionService {
    //Traer una lista de Educacion
    public List<Educacion> getEducacion();
    
    
    //Guardar un objeto de tipo Educacion
    public void saveEducacion(Educacion educacion);
    
    
    //Eliminar una capacitacion pero por ID
    public void deleteEducacion(Long id);
    
    
    //Buscar una Educacion por ID
    public Educacion findEducacion(Long id);

   

 
}

