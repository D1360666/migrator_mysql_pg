package uy.com.soluciones.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import uy.com.soluciones.modelmysql.Ods_Recurso;
import uy.com.soluciones.repositorymysql.Ods_Recurso_MySql_Repository;
import uy.com.soluciones.service.interfaces.IOdsRecursoMysqlService;

import java.util.List;


@Service
public class ods_recurso_mysql_service implements IOdsRecursoMysqlService {

    @Autowired
    private Ods_Recurso_MySql_Repository repo;

    @Override
    public List<Ods_Recurso> findAll() {
        return repo.findAll();
    }

    @Override
    public long Count() {
        return repo.count();
    }
}
