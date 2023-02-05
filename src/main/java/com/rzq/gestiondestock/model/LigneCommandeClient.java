package com.rzq.gestiondestock.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "lignecommandeclient")
public class LigneCommandeClient extends AbstractEntity {

    @Column(name = "idarticle")
    private Article article;

    @ManyToOne
    @JoinColumn(name = "idCommandeclient")
    private CommandeClient commandeClient;
}
