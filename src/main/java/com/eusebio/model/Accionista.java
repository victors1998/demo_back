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
@Table(name = "accionista")
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Accionista {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    @Column(name = "id_accionista")
    private Integer idAccionista;

    @Column(name = "tipo", length = 150)
    private String tipo;

    @Column(name = "tipo_documento", length = 150)
    private String tipoDocumento;

    @Column(name = "numero_documento", length = 150)
    private String numeroDocumento;

    @Column(name = "nombres", length = 150)
    private String nombres;

    @Column(name = "paterno", length = 150)
    private String paterno;

    @Column(name = "materno", length = 150)
    private String materno;

    @Column(name = "direccion", length = 150)
    private String direccion;

    @Column(name = "cantidad_acciones", length = 150)
    private Integer cantidadAcciones;

    @Column(name = "estado", length = 150)
    private String estado;

}
