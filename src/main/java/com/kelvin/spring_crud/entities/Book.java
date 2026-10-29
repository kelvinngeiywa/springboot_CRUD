package com.kelvin.spring_crud.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long _id;
    private String _title;
    private String _author;
    private Double _price;

    public Book() {

    }

    public Book(Long id,String title,String author,Double price){
        this._id=id;
        this._title=title;
        this._author=author;
        this._price=price;

    }



    public Long getId(){
        return _id;
    }

    public void setId(Long id){
        this._id=id;
    }

    public String getTitle(){
        return _title;
    }

    public void setTitle(String title){
        this._title=title;
    }

    public String getAuthor(){
        return _author;
    }

    public void setAuthor(String author){
        this._author=author;
    }

    public Double getPrice(){
        return _price;
    }

    public void setPrice(Double price){
        this._price=price;
    }
}
