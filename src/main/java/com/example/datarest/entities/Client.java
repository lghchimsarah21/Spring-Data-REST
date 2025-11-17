package com.example.datarest.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString(exclude = "comptes") // Évite LazyInitializationException
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nom;

    private String email;

    @OneToMany(mappedBy = "client", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Compte> comptes;

    // Constructeur personnalisé si nécessaire
    public Client(String nom, String email) {
        this.nom = nom;
        this.email = email;
    }
}
