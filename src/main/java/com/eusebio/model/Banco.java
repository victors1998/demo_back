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
@Table(name = "banco")
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Banco {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    @Column(name = "id_banco")
    private Integer id_banco;

    @Column(name = "nombre", length = 150)
    private String nombre;

    @Column(name = "abrv", length = 150)
    private String abrv;
}
