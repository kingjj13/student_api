package com.example.student_api.services;

import com.example.student_api.entities.Etudiant;
import com.example.student_api.EtudiantRepository.EtudiantRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service

public class EtudiantService {

    private  final EtudiantRepository repository;

    public EtudiantService(EtudiantRepository repository) {
        this.repository = repository;
    }

    // on inscrit un etudiant

    public Etudiant inscrire(Etudiant e) {
        e.setMoyenne((e.getNote1() + e.getNote2()) / 2.0);
        return  repository.save(e);
    }
    // on recupere l'etudiant par son ID

    public Optional<Etudiant> getEtudiant(Long id) {
        return repository.findById(id);
    }

    // on fait le MAJ des notes et on recalcul la moyenne

    public Optional<Etudiant> mettreAjourMoyenne(Long id, double note1, double note2) {
        return repository.findById(id).map(e -> {
            e.setNote2(note1);
            e.setNote2(note2);
            e.setMoyenne((note1 + note2) / 2.0 );
            return  repository.save(e);
        } );
    }
}
