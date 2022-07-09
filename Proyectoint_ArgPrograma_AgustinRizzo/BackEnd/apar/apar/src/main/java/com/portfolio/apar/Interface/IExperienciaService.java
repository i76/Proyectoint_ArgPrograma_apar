package com.portfolio.apar.Interface;

import com.portfolio.apar.Entity.Experiencia;
import java.util.List;


public interface IExperienciaService {
    //Traer una lista de experiencias
    public List<Experiencia> getExperiencia();
    
    
    //Guardar un objeto de tipo experiencia
    public void saveExperiencia(Experiencia experiencia);
    
    
    //Eliminar una experiencia pero por ID
    public void deleteExperiencia(Long id);
    
    
    //Buscar una experiencia por ID
    public Experiencia findExperiencia(Long id);
}
