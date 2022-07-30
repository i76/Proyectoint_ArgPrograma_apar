package com.portfolio.apar.Service;


import com.portfolio.apar.Entity.Acercade;
import com.portfolio.apar.Interface.IAcercadeService;
import com.portfolio.apar.Repository.IAcercadeRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImpAcercadeService implements IAcercadeService{ 
    @Autowired IAcercadeRepository iacercadeRepository;
    
    @Override
    public List<Acercade> getAcercade() {
        List<Acercade> acercade = iacercadeRepository.findAll();
           return acercade;
    }

    @Override
    public void saveAcercade(Acercade acercade) {
        iacercadeRepository.save(acercade);
    }

    @Override
    public void deleteAcercade(Long id) {
        iacercadeRepository.deleteById(id);
    }

    @Override
    public Acercade findAcercade(Long id) {
        Acercade acercade = iacercadeRepository.findById(id).orElse(null);
        return acercade;
    }
}


