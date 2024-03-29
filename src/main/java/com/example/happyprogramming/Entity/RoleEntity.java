package com.example.happyprogramming.Entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

/**
 * @author Admin
 */
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "role")
public class RoleEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;


    @Column
    private String name;

    @ManyToMany(mappedBy = "roles") //tên của arraylist bên roleEntity để mapped
    private Set<UserEntity> users ;

    public RoleEntity(String role) {
        this.name=role;
    }
}
