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
@Table(name = "user_data")
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class User {

    @Id
    @EqualsAndHashCode.Include
    @Column(name = "id_user")
    private Integer idUser;

    @Column(length = 60, nullable = false, unique = true)
    private String username;

    @Column(length = 60, nullable = false)
    private String password;

    @Column(nullable = false)
    private Boolean enabled;
}
