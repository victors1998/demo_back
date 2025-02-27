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
@Table(name = "cuenta_bancaria")
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class CuentaBancaria {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_cuenta")
    @EqualsAndHashCode.Include
    private Integer idCuenta;

    @ManyToOne
    @JoinColumn(name = "id_accionista", foreignKey = @ForeignKey(name = "FK_cuenta_accionista"))
    private Accionista idAccionista;

    @ManyToOne
    @JoinColumn(name = "id_banco", foreignKey = @ForeignKey(name = "FK_cuenta_banco"))
    private Banco idBanco;

    @Column(name = "nombre", length = 70, nullable = false)
    private String numero;

    @Column(name = "cci", length = 70, nullable = false)
    private String cci;

    @Column(name = "estado", length = 70, nullable = false)
    private String estado;
}
