/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.apar.Controller;




import com.portfolio.apar.Entity.Acercade;
import com.portfolio.apar.Interface.IAcercadeService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class AcercadeController {
    @Autowired IAcercadeService iacercadeService;
    
    @GetMapping("acercade/traer")
    public List<Acercade> getAcercade(){
        return iacercadeService.getAcercade();
    }
    
    @PostMapping("/acercade/crear")
    public String createAcercade(@RequestBody Acercade acercade){
        iacercadeService.saveAcercade(acercade);
        return "El relato fue creado correctamente";
    }
    
    @DeleteMapping("/acercade/borrar/{id}")
    public String deleteAcercade(@PathVariable Long id){
        iacercadeService.deleteAcercade(id);
        return "El relato fue borrado correctamente";
    }
    //URL:PUERTO/acercade/editar/4/acercade
    @PutMapping("/acercade/editar/{id}")
    public Acercade editAcercaden(@PathVariable Long id,
                               @RequestParam("acerca") String nuevoAcerca){
    Acercade acercade = iacercadeService.findAcercade(id);
    
    acercade.setAcerca(nuevoAcerca);
            
    iacercadeService.saveAcercade(acercade);
    return acercade;
   }
    
    @GetMapping("/acercade/traer/perfil")
    public Acercade findAcercade(){
        return iacercadeService.findAcercade((long)1);
    }
}