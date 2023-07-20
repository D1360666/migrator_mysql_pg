package uy.com.soluciones.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uy.com.soluciones.modelmysql.Ods_Recurso;
import uy.com.soluciones.repositorymysql.Ods_Recurso_MySql_Repository;
import uy.com.soluciones.repositorypgsql.Ods_Recurso_PG_Repository;
import uy.com.soluciones.service.interfaces.IOdsRecursoMysqlService;

import java.util.ArrayList;
import java.util.List;

@Service
public class ods_recurso_mysql_service implements IOdsRecursoMysqlService {

    @Autowired
    private Ods_Recurso_MySql_Repository recursoPgRepository;

}
