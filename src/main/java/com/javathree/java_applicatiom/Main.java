/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.javathree.java_applicatiom;


import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.Marshaller;

public class Main {

    public static void main(String[] args) throws Exception {

        Book book = new Book("Java Basics", "Tolani",19625,"BDP001",2019);

        JAXBContext context = JAXBContext.newInstance(Book.class);
        Marshaller marshaller = context.createMarshaller();

        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

        marshaller.marshal(book, System.out);
    }
}