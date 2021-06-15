package com.joelito.spring.Repository;

import com.joelito.spring.DAL.EncomendacEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EncomendaCRepository extends JpaRepository<EncomendacEntity,Integer> {
}
