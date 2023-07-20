package uy.com.soluciones.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;
import uy.com.soluciones.modelmysql.Ods_Recurso;
import uy.com.soluciones.service.interfaces.IOdsRecursoMysqlService;

import java.util.List;


@RestController
@RequestMapping("/migrator")
public class DBController {

    @Autowired
    private IOdsRecursoMysqlService imysql;

    @GetMapping
    public String prueba(){
        return "hola";
    }

    @GetMapping("/registrosmysql")
    public long registrosMysql(){
        return imysql.Count();
    }
    @GetMapping("/vermysql")
    public List<Ods_Recurso> listaMysql(){
        return imysql.findAll();
    }

}
