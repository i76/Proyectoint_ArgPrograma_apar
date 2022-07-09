package com.portfolio.apar.Controller;


import com.portfolio.apar.Entity.HardSoftskill;
import com.portfolio.apar.Interface.IHardSoftskillService;
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
public class HardSoftskillController {
    @Autowired IHardSoftskillService ihardsoftskillService;
    
    @GetMapping("hardsoftskill/traer")
    public List<HardSoftskill> getHardSoftskill(){
        return ihardsoftskillService.getHardSoftskill();
    }
    
    @PostMapping("/hardsoftskill/crear")
    public String createHardSoftskill(@RequestBody HardSoftskill hardsoftskill){
        ihardsoftskillService.saveHardSoftskill(hardsoftskill);
        return "La HardSoftskill fue creada correctamente";
    }
    
    @DeleteMapping("/hardsoftskill/borrar/{id}")
    public String deleteHardSoftskill(@PathVariable Long id){
        ihardsoftskillService.deleteHardSoftskill(id);
        return "La HardSoftskill fue borrada correctamente";
    }
    //URL:PUERTO/HardSoftskill/editar/4/nombre & apellido & img
    @PutMapping("/hardsoftskill/editar/{id}")
    public HardSoftskill editHardSoftskill(@PathVariable Long id,
                               @RequestParam("nombre") String nuevoNombre,
                               @RequestParam("valor") String nuevoValor){
    HardSoftskill hardsoftskill = ihardsoftskillService.findHardSoftskill(id);
    
    hardsoftskill.setNombre(nuevoNombre);
    hardsoftskill.setValor(nuevoValor);
    
    
    ihardsoftskillService.saveHardSoftskill(hardsoftskill);
    return hardsoftskill;
   }
    
    @GetMapping("/hardsoftskill/traer/perfil")
    public HardSoftskill findHardSoftskill(){
        return ihardsoftskillService.findHardSoftskill((long)1);
    }
    
}
