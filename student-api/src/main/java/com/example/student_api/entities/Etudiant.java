package com.example.student_api.entities;

import jakarta.persistence.*;

@Entity
public class Etudiant {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        private String nom;
        private String email;

        private double note1;
        private double note2;
        private double moyenne;

        public Etudiant() {}

        public Etudiant(String nom, String email, double note1, double note2) {
                this.nom = nom;
                this.email = email;
                this.note1 = note1;
                this.note2 = note2;
                this.moyenne = (note1 + note2) / 2.0;
        }

        public Long getId() {
                return id;
        }

        public void setId(Long id) {
                this.id = id;
        }

        public String getNom() {
                return nom;
        }

        public void setNom(String nom) {
                this.nom = nom;
        }

        public String getEmail() {
                return email;
        }

        public void setEmail(String email) {
                this.email = email;
        }

        public double getNote1() {
                return note1;
        }

        public void setNote1(double note1) {
                this.note1 = note1;
        }

        public double getNote2() {
                return note2;
        }

        public void setNote2(double note2) {
                this.note2 = note2;
        }

        public double getMoyenne() {
                return moyenne;
        }

        public void setMoyenne(double moyenne) {
                this.moyenne = moyenne;
        }
}
