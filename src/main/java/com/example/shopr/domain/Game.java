package com.example.shopr.domain;

import lombok.*;

import javax.persistence.*;


@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
//@DiscriminatorValue("GAME")
@Inheritance(strategy = InheritanceType.JOINED) // proberen weg te laten
@Entity
public class Game extends Article {

    @Column(columnDefinition = "varchar(255) default 'GAME'")
    private String type;

    private String publisher;
    private String minAge;

    @Enumerated(EnumType.STRING)
    private GameGenre gameGenre;
}



