package com.joelito.spring.Repository;

import com.joelito.spring.DAL.LoteEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoteRepository extends JpaRepository<LoteEntity, Integer> {

}
