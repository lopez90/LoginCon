package com.logicon.service;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Dom on 15.06.2016.
 */

public class TextViewImpl {

    String Text;

    public TextViewImpl(){
    }

    public void getMessage()
    {
        System.out.println("Jarosław Kaczynski krolem naszym");
    }
}
