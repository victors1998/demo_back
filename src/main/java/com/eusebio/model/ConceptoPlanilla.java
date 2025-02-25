package com.eusebio.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "concepto_planilla")
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class ConceptoPlanilla {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    @Column(name = "id_concepto")
    private Integer idConcepto;

    @Column(name = "descripcion", length = 50)
    private String descripcion;

    @Column(name = "tipo", length = 50)
    private String tipo;

}
