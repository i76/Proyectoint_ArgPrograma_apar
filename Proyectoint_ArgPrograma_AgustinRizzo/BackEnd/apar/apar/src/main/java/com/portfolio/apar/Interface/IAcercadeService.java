/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.portfolio.apar.Interface;

import com.portfolio.apar.Entity.Acercade;
import java.util.List;




public interface IAcercadeService {
        //Traer una lista de Acercade
    public List<Acercade> getAcercade();
    
    
    //Guardar un objeto de tipo Acercade
    public void saveAcercade(Acercade acercade);
    
    
    //Eliminar un Acercade pero por ID
    public void deleteAcercade(Long id);
    
    
    //Buscar un Acercade por ID
    public Acercade findAcercade(Long id);
}
