package com.joelito.spring.Repository;

import com.joelito.spring.DAL.TipoDeControloEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TipoDeControlo extends JpaRepository<TipoDeControloEntity,Integer> {
}
