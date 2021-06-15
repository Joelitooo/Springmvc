package com.joelito.spring.Repository;

import com.joelito.spring.DAL.AguaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AguaRepository extends JpaRepository<AguaEntity, Integer> {


}
