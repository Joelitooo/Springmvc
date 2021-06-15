package com.joelito.spring.Repository;

import com.joelito.spring.DAL.EncomendafEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EncomendaFRepository extends JpaRepository<EncomendafEntity,Integer> {
}
