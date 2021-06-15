package com.joelito.spring.Repository;

import com.joelito.spring.DAL.TipoDeAvariaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TipoDeAvariaRepository extends JpaRepository<TipoDeAvariaEntity,Integer> {

}
