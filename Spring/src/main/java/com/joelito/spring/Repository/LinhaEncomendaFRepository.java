package com.joelito.spring.Repository;

import com.joelito.spring.DAL.LinhaencomendafEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LinhaEncomendaFRepository extends JpaRepository<LinhaencomendafEntity, Integer> {

}
