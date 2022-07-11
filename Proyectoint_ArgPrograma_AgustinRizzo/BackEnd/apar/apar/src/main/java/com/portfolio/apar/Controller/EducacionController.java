package com.portfolio.apar.Controller;


import com.portfolio.apar.Entity.Educacion;
import com.portfolio.apar.Interface.IEducacionService;
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
public class EducacionController {
    @Autowired IEducacionService ieducacionService;
    
    @GetMapping("educacion/traer")
    public List<Educacion> getEducacion(){
        return ieducacionService.getEducacion();
    }
    
    @PostMapping("/educacion/crear")
    public String createEducacion(@RequestBody Educacion educacion){
        ieducacionService.saveEducacion(educacion);
        return "La capacitacion fue creada correctamente";
    }
    
    @DeleteMapping("/educacion/borrar/{id}")
    public String deleteEducacion(@PathVariable Long id){
        ieducacionService.deleteEducacion(id);
        return "La capacitacion fue borrada correctamente";
    }
    //URL:PUERTO/educacion/editar/4/educacion & years
    @PutMapping("/educacion/editar/{id}")
    public Educacion editEducacion(@PathVariable Long id,
                               @RequestParam("estudio") String nuevoEstudio,
                               @RequestParam("years") String nuevoYears){
    Educacion educacion = ieducacionService.findEducacion(id);
    
    educacion.setEstudio(nuevoEstudio);
    educacion.setYears(nuevoYears);
        
    ieducacionService.saveEducacion(educacion);
    return educacion;
   }
    
    @GetMapping("/educacion/traer/perfil")
    public Educacion findEducacion(@PathVariable Long id){
        return ieducacionService.findEducacion((long)1);
    }
}

