package com.example.shopr.domain;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@DiscriminatorColumn(name ="type")
@MappedSuperclass
public abstract class Article {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    private Double price;

    @Column(length = 100)
    private String supplierId;

//    @Column(insertable = false, updatable = false)
//    private String type;

}
