/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.javathree.java_applicatiom;


import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlElement;

@XmlRootElement
public class Book {

    private String title;
    private String author;
    private int ssn;
    private String Barcode;
    private int Year;
    private String About;

    public Book() {
        // Required by JAXB
    }

    public Book(String title, String author, int ssn, String Barcode,int Year,String About) {
        this.title = title;
        this.author = author;
        this.ssn=ssn;
        this.Barcode= Barcode;
        this.Year=Year;
        this.About=About;
    }

    @XmlElement
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
      @XmlElement
    public String getAbout() {
        return About;
    }

    public void setAbout(String About) {
        this.About = About;
    }
    @XmlElement
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
       @XmlElement
    public int getssn() {
        return ssn;
    }

    public void setssn(int ssn) {
       this.ssn= ssn;
    }
     @XmlElement
    public String getBarcode() {
        return Barcode;
    }

    public void setBarcode(String Barcode) {
        this.Barcode = Barcode;
    }
       @XmlElement
    public int getYear() {
        return Year;
    }

    public void setYear(int Year) {
        this.Year = Year;
    }
}
