package com.portfolio.apar.Interface;

import com.portfolio.apar.Entity.HardSoftskill;
import java.util.List;


public interface IHardSoftskillService {
   //Traer una lista de hard y soft skills
    public List<HardSoftskill> getHardSoftskill();
    
    
    //Guardar un objeto de tipo HardSoftskill
    public void saveHardSoftskill(HardSoftskill hardsoftskill);
    
    
    //Eliminar un HardSoftskill pero por ID
    public void deleteHardSoftskill(Long id);
    
    
    //Buscar una HardSoftskill por ID
    public HardSoftskill findHardSoftskill(Long id); 
}
