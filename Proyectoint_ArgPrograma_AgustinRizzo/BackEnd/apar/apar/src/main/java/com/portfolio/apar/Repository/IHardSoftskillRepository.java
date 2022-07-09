package com.portfolio.apar.Repository;

import com.portfolio.apar.Entity.HardSoftskill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository 
public interface IHardSoftskillRepository extends JpaRepository<HardSoftskill,Long>{
    
}
