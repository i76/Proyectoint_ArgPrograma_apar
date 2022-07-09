package com.portfolio.apar.Repository;

import com.portfolio.apar.Entity.Proyecto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository 
public interface IProyectoRepository extends JpaRepository<Proyecto,Long>{
    
}
