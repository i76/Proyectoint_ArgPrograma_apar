package com.portfolio.apar.Interface;

import com.portfolio.apar.Entity.Proyecto;
import java.util.List;


public interface IProyectoService {
    //Traer una lista de Proyectos
    public List<Proyecto> getProyecto();
    
    
    //Guardar un objeto de tipo Proyecto
    public void saveProyecto(Proyecto proyecto);
    
    
    //Eliminar un Proyecto pero por ID
    public void deleteProyecto(Long id);
    
    
    //Buscar una Proyecto por ID
    public Proyecto findProyecto(Long id);
}
