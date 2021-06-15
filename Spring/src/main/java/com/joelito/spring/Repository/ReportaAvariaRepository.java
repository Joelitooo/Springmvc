package com.joelito.spring.Repository;

import com.joelito.spring.DAL.ReportaavariaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReportaAvariaRepository extends JpaRepository<ReportaavariaEntity, Integer> {

}
