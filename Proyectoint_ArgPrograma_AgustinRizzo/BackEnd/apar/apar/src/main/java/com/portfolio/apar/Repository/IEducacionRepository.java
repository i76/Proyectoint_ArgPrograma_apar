package com.portfolio.apar.Repository;

import com.portfolio.apar.Entity.Educacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository 
public interface IEducacionRepository extends JpaRepository<Educacion,Long>{
    
}
