package org.example.autoloc.entities;
import jakarta.persistence.*;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import org.example.autoloc.entities.enums.Role;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor


public class Employe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long idEmploye;
    String nom;
    String prenom;
    @Enumerated(EnumType.STRING)
    Role role;

    @ManyToOne
    @JoinColumn(name = "id_agence")
    private Agence agence;

}
