package uy.com.soluciones.repositorypgsql;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uy.com.soluciones.modelpgsql.Ods_Recurso_PG;

@Repository
public interface Ods_Recurso_PG_Repository extends JpaRepository<Ods_Recurso_PG, Integer> {
}
