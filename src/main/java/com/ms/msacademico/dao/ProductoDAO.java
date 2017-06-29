package com.ms.msacademico.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ms.msacademico.repository.*;

public interface ProductoDAO extends JpaRepository<Producto, Integer> {

}
