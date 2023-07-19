package uy.com.soluciones.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uy.com.soluciones.modelmysql.Ods_Recurso;
import uy.com.soluciones.repositorymysql.Ods_Recurso_MySql_Repository;

import java.util.ArrayList;
import java.util.List;

@Service
public class ods_recurso_mysql_service {

    @Autowired
    private Ods_Recurso_MySql_Repository repo;

    public List<Ods_Recurso> findAll(){
        return repo.findAll();
    }
}
