package com.devsuperior.dslist.entities;

import jakarta.persistence.*;

import java.util.Objects;
@Entity
@Table(name = "tb_game")
public class Game {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String title;
    @Column(name = "game-year")
    private Integer year;
    private String genre;
    private String platform;
    private String imgUrl;

    private String shortDescrition;
    private String longDescription;

    public Game() {

    }

    public Game(Long id, String title, Integer year, String genre, String plataform, String imgUrl,
                String shortDescription,String longDescription) {
        this.id = id;
        this.title = title;
        this.year = year;
        this.genre = genre;
        this.platform = plataform;
        this.imgUrl = imgUrl;
        this.shortDescrition = shortDescription;
        this.longDescription = longDescription;
    }

    public  void setShortDescription(String shortDescription) {
        this.shortDescrition = shortDescrition;
    }

    public String getLongDescription() {
        return longDescription;
    }

    public void setLongDescription(String longDescription) {
        this.longDescription = longDescription;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Game other = (Game) obj;
        return Objects.equals(id,other.id);
    }

}


