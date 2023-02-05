package com.rzq.gestiondestock.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Table;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Embeddable
public class Addresse {

    @Column(name = "addresse1")
    private String addresse1;

    @Column(name = "Addresse2")
    private String Addresse2;

    @Column(name = "ville")
    private String ville;

    @Column(name = "CodePostal")
    private String CodePostal;

    @Column(name = "pays")
    private String pays;
}
