package com.example.shopr.domain;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@DiscriminatorValue("FICTION")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@EqualsAndHashCode(callSuper = true)
@Entity
public class BookFiction extends Book{

    private BookGenre bookGenre;

    @Column(length = 255)
    private String description;
}
