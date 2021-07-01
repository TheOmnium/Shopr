package com.example.shopr.domain;


import lombok.AllArgsConstructor;
import lombok.Data;

import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.Pattern;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@DiscriminatorColumn(name ="type")
@Entity
public abstract class Book extends Article{


    private String Author;

//    @Pattern(regexp="^[a-zA-Z0-9]{3}",message="length must be 3") //TODO: REGEX aanpassen
    private String isbn;
    private int pages;

    @Column(insertable = false, updatable = false)
    private String type;

}
