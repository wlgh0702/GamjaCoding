package org.gamjacoding.gamjacoding.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Test {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int number;

    @Column(name = "NAME")
    private String name;

    @Column(name = "AGE")
    private int age;

    @Column(name = "WEIGHT")
    private double weight;
}
