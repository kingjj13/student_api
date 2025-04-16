package com.example.student_api.EtudiantRepository;

import  com.example.student_api.entities.Etudiant;
import org.springframework.data.jpa.repository.JpaRepository;


public interface EtudiantRepository extends JpaRepository<Etudiant, Long> {
}
