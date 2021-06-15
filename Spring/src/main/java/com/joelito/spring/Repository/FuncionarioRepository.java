package com.joelito.spring.Repository;

import com.joelito.spring.DAL.FuncionarioEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FuncionarioRepository extends JpaRepository<FuncionarioEntity,Integer> {

}
