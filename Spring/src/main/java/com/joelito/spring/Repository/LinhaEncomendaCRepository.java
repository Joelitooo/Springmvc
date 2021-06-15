package com.joelito.spring.Repository;

import com.joelito.spring.DAL.LinhadeencomendacEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LinhaEncomendaCRepository extends JpaRepository<LinhadeencomendacEntity, Integer> {
}
