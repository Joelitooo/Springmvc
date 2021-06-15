package com.joelito.spring.Repository;

import com.joelito.spring.DAL.TanqueespecieEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TanqueEspecieRepository extends JpaRepository<TanqueespecieEntity,Integer> {
}
