package com.portfolio.apar.Controller;


import com.portfolio.apar.Entity.Experiencia;
import com.portfolio.apar.Interface.IExperienciaService;
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
public class ExperienciaController {
    
    @Autowired IExperienciaService iexperienciaService;
    
    @GetMapping("experiencia/traer")
    public List<Experiencia> getExperiencia(){
        return iexperienciaService.getExperiencia();
    }
    
    @PostMapping("/experiencia/crear")
    public String createExperiencia(@RequestBody Experiencia experiencia){
        iexperienciaService.saveExperiencia(experiencia);
        return "La experiencia fue creada correctamente";
    }
    
    @DeleteMapping("/experiencia/borrar/{id}")
    public String deleteExperiencia(@PathVariable Long id){
        iexperienciaService.deleteExperiencia(id);
        return "La experiencia fue borrada correctamente";
    }
    //URL:PUERTO/experiencia/editar/4/experiencia
    @PutMapping("/experiencia/editar/{id}")
    public Experiencia editExperiencia(@PathVariable Long id,
                               @RequestParam("empresa") String nuevoEmpresa,
                               @RequestParam("tarea") String nuevoTarea,
                               @RequestParam("duracion") String nuevoDuracion){
    Experiencia experiencia = iexperienciaService.findExperiencia(id);
    
    experiencia.setEmpresa(nuevoEmpresa);
    experiencia.setTarea(nuevoTarea);
    experiencia.setDuracion(nuevoDuracion);
    
    iexperienciaService.saveExperiencia(experiencia);
    return experiencia;
   }
    
    @GetMapping("/experiencia/traer/perfil")
    public Experiencia findExperiencia(){
        return iexperienciaService.findExperiencia((long)1);
    }
}


