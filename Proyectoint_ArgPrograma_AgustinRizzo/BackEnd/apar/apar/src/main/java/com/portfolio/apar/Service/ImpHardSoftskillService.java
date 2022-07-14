package com.portfolio.apar.Service;

import com.portfolio.apar.Entity.HardSoftskill;
import com.portfolio.apar.Interface.IHardSoftskillService;
import com.portfolio.apar.Repository.IHardSoftskillRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImpHardSoftskillService implements IHardSoftskillService {
    @Autowired IHardSoftskillRepository ihardsoftskillRepository;

    @Override
    public List<HardSoftskill> getHardSoftskill() {
        List<HardSoftskill> hardsoftskill = ihardsoftskillRepository.findAll();
           return hardsoftskill;
    }

    @Override
    public void saveHardSoftskill(HardSoftskill hardsoftskill) {
        ihardsoftskillRepository.save(hardsoftskill);
    }

    @Override
    public void deleteHardSoftskill(Long id) {
        ihardsoftskillRepository.deleteById(id);
    }

    @Override
    public HardSoftskill findHardSoftskill(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
   
}
