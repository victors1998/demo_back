package com.eusebio.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "utilidad")
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Utilidad {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_utilidad")
    @EqualsAndHashCode.Include
    private Integer idUtilidad;

    @ManyToOne
    @JoinColumn(name = "id_accionista", foreignKey = @ForeignKey(name = "FK_utilidad_accionista"))
    private Accionista idAccionista;

    @Column(name = "nombre_utilidad", length = 50, nullable = false)
    private String nombreUtilidad;

    @Column(name = "ejercicio", columnDefinition = "DECIMAL(18,2)")
    private BigDecimal ejercicio;

    @Column(columnDefinition = "DECIMAL(18,6)", name = "utilidad_accion")
    private BigDecimal utilidadAccion;

    @Column(name = "cant_acciones", length = 50, nullable = false)
    private Integer cantAcciones;

    @Column(columnDefinition = "DECIMAL(18,2)", name = "total_dividendos")
    private BigDecimal totalDividendos;

    @Column(columnDefinition = "DECIMAL(18,2)", name = "retencion")
    private BigDecimal retencion;

    @Column(columnDefinition = "DECIMAL(18,2)", name = "total_neto")
    private BigDecimal totalNeto;


}
