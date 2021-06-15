package com.joelito.spring.Repository;

import com.joelito.spring.DAL.TanqueloteEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TanqueLoteRepository extends JpaRepository<TanqueloteEntity,Integer> {

}
