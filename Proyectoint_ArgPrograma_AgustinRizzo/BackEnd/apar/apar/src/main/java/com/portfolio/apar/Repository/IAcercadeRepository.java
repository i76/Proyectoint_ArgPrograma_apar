
package com.portfolio.apar.Repository;



import org.springframework.stereotype.Repository;
import com.portfolio.apar.Entity.Acercade;
import org.springframework.data.jpa.repository.JpaRepository;


@Repository
public interface IAcercadeRepository extends JpaRepository<Acercade,Long>{
    
}
