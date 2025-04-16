package com.example.student_api.controllers;

import com.example.student_api.controllers.EtudiantController;

import com.example.student_api.entities.Etudiant;
import com.example.student_api.services.EtudiantService;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/etudiants")

public class EtudiantController {
    private final EtudiantService service;

    public EtudiantController(EtudiantService service) {
        this.service = service;
    }

    // inscription

    @PatchMapping

    public Etudiant inscrire(@RequestBody Etudiant etudiant) {
        return service.inscrire(etudiant);
    }

    // on recupere l'etudiant par son ID

    @GetMapping("/{id}")
    public Optional<Etudiant> getEtudiant(@PathVariable Long id) {
        return service.getEtudiant(id);
    }

    // MAJ notes et moyennes

    @PutMapping("/{id}/moyenne")

    public  Optional<Etudiant> updateMoyenne(
            @PathVariable Long id,
            @RequestParam double note1,
            @RequestParam double note2
    ) {
        return  service.mettreAjourMoyenne(id, note1, note2);
    }
}
