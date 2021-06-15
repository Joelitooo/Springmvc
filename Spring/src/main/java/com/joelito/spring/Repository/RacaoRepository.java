package com.joelito.spring.Repository;

import com.joelito.spring.DAL.RacaoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RacaoRepository extends JpaRepository<RacaoEntity, Integer> {


}
