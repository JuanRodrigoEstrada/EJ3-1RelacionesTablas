package com.bosonit.EJ31CRUDRELTABLASJuanRodrigo.Profesor.infraestructure.repository;

import com.bosonit.EJ31CRUDRELTABLASJuanRodrigo.Profesor.domain.Profesor;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfesorRepository extends JpaRepository<Profesor, String> {
}
