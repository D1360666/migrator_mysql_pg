package uy.com.soluciones.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import uy.com.soluciones.modelmysql.Ods_Recurso;
import uy.com.soluciones.service.ods_recurso_mysql_service;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/migrator")
public class DBController {

    @Autowired
    private ods_recurso_mysql_service serviceMysql;

    @GetMapping
    public String prueba(){
        return "hola";
    }
//public List<Ods_Recurso> listarRecursos(){
    //return serviceMysql.findAll();

}
