package com.portfolio.apar.Controller;


import com.portfolio.apar.Entity.Proyecto;
import com.portfolio.apar.Interface.IProyectoService;
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
public class ProyectoController {
    @Autowired IProyectoService iproyectoService;
    
    @GetMapping("proyecto/traer")
    public List<Proyecto> getProyecto(){
        return iproyectoService.getProyecto();
    }
    
    @PostMapping("/proyecto/crear")
    public String createProyecto(@RequestBody Proyecto proyecto){
        iproyectoService.saveProyecto(proyecto);
        return "El Proyecto fue creada correctamente";
    }
    
    @DeleteMapping("/proyecto/borrar/{id}")
    public String deleteProyecto(@PathVariable Long id){
        iproyectoService.deleteProyecto(id);
        return "El Proyecto fue borrada correctamente";
    }
    //URL:PUERTO/proyecto/editar/4/nombre & apellido & img
    @PutMapping("/proyecto/editar/{id}")
    public Proyecto editProyecto(@PathVariable Long id,
                               @RequestParam("nombreproy") String nuevoNombreproy,
                               @RequestParam("descripcion") String nuevoDescripcion,
                               @RequestParam("urlproy") String nuevoUrlproy){
    Proyecto proyecto = iproyectoService.findProyecto(id);
    
    proyecto.setNombreproy(nuevoNombreproy);
    proyecto.setDescripcion(nuevoDescripcion);
    proyecto.setUrlproy(nuevoUrlproy);
    
    iproyectoService.saveProyecto(proyecto);
    return proyecto;
   }
    
    @GetMapping("/proyecto/traer/perfil")
    public Proyecto findProyecto(){
        return iproyectoService.findProyecto((long)1);
    }
}
