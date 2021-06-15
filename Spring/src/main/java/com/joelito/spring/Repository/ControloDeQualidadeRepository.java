package com.joelito.spring.Repository;

import com.joelito.spring.DAL.ControlodequalidadeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ControloDeQualidadeRepository extends JpaRepository<ControlodequalidadeEntity,Integer> {
}
