package com.joelito.spring.Repository;

import com.joelito.spring.DAL.TanqueEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TanqueRepository extends JpaRepository<TanqueEntity, Integer> {


}
