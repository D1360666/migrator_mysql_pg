package uy.com.soluciones.repositorymysql;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uy.com.soluciones.modelmysql.Ods_Recurso;

@Repository
public interface Ods_Recurso_MySql_Repository extends JpaRepository<Ods_Recurso, Integer> {
}
