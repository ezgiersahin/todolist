package com.springboot.newproject.model;

import lombok.Data;

import javax.persistence.*;
@Data
@Entity
@Table(name="mission")
public class mission {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "mail")
    private String mail;

    @Column(name = "firstName")
    private String firstName;

    @Column(name = "lastName")
    private String lastName;

    @Column(name = "middleName")
    private String middleName;

}
/*
@Table : Tablo seçimi için kullanılır, eğer içindeki değer boş ise direkt sınıf ismini tablo olarak alır.

@Id : Tablodaki benzersiz sütunu belirtmek için kullanılır.

@GeneratedValue : Tablodaki auto-increment gibi tiplerin belirlenmesi için kullanılır.

@Column : Tablodaki sütunları belirtmek için kullanılır, eğer içi boşsa direkt değişken ismini sütun ismi olarak sayar. */

