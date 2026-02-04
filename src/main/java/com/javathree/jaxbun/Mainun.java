/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.javathree.jaxbun;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.Unmarshaller;
import java.io.InputStream;

public class Mainun {

    public static void main(String[] args) throws Exception {

        // Step 1: Create JAXB context
        JAXBContext context = JAXBContext.newInstance(Bookun.class);

        // Step 2: Create Unmarshaller
        Unmarshaller unmarshaller = context.createUnmarshaller();

        // Step 3: Load XML from resources folder
        InputStream xml =
                Mainun.class.getClassLoader().getResourceAsStream("book.xml");

        if (xml == null) {
            throw new RuntimeException("book.xml NOT found in src/main/resources");
        }

        // Step 4: XML ➜ Java object
        Bookun book = (Bookun) unmarshaller.unmarshal(xml);

        // Step 5: Display result
        System.out.println(book.getTitle());
        System.out.println(book.getAuthor());
    }
}
