package com.rzq.gestiondestock.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "fournisseur")
public class Fournisseur extends AbstractEntity {

    @Column(name="nom")
    private String nom;
    @Column(name="prenom")
    private String prenom;

    @Embedded
    private Addresse adresse;
    @Column(name="photo")
    private String photo;
    @Column(name="mail")
    private String mail;
    @Column(name="numeroTelephoene")
    private String numeroTelephoene;

    @OneToMany(mappedBy = "founisseur")
    private List<CommandeFournisseur> commandesFournisseur;
}
