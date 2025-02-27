package com.eusebio.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "menu")
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Menu {

    @Id
    @EqualsAndHashCode.Include
    @Column(name = "id_menu")
    private Integer idMenu;

    @Column(length = 20, nullable = false)
    private String icon;

    @Column(length = 20, nullable = false)
    private String name;

    @Column(length = 50, nullable = false)
    private String url;

}
