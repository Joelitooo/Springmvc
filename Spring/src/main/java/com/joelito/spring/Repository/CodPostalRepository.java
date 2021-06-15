package com.joelito.spring.Repository;

import com.joelito.spring.DAL.CodpostalEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CodPostalRepository extends JpaRepository<CodpostalEntity,Integer> {


}
