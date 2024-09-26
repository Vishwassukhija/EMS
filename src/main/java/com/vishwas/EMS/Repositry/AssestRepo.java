package com.vishwas.EMS.Repositry;

import com.vishwas.EMS.Entity.AssestEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AssestRepo extends JpaRepository<AssestEntity,Long> {
}
