package com.KipperApp.kiperApp.service;
//aqui tem toda a regra de negocio

import org.springframework.stereotype.Service;

@Service
public class Services {
    public String hellow(String name)
    {
        return "hellow world "+name;
    }
}
