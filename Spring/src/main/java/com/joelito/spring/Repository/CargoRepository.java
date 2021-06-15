package com.joelito.spring.Repository;

import com.joelito.spring.DAL.CargoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CargoRepository extends JpaRepository<CargoEntity,Integer> {


}
