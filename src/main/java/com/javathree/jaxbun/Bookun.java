/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.javathree.jaxbun;


import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "book")
public class Bookun {

    private String title;
    private String author;

    // REQUIRED by JAXB
    public Bookun() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}