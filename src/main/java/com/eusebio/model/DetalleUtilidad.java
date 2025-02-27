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
@Table(name = "detalle_utilidad")
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class DetalleUtilidad {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_detalle")
    @EqualsAndHashCode.Include
    private Integer idDetalle;

    @ManyToOne
    @JoinColumn(name = "id_utilidad", foreignKey = @ForeignKey(name = "FK_detalle_utilidad_utilidad"))
    private Utilidad idUtilidad;

    @Column(name = "tipo", length = 50, nullable = false)
    private String tipo;

    @Column(name = "monto", columnDefinition = "DECIMAL(18,2)")
    private BigDecimal monto;

    @Column(name = "observacion", length = 50, nullable = false)
    private String observacion;

    @Column(name = "usuario", length = 50, nullable = false)
    private String usuario;
}
