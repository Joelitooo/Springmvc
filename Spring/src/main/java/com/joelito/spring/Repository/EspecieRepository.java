package com.joelito.spring.Repository;

import com.joelito.spring.DAL.EspecieEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EspecieRepository extends JpaRepository<EspecieEntity, Integer> {
}
