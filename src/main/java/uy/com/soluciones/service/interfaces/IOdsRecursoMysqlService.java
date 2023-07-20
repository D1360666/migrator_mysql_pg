package uy.com.soluciones.service.interfaces;

import uy.com.soluciones.modelmysql.Ods_Recurso;

import java.util.List;

public interface IOdsRecursoMysqlService {
    /*public List<ClienteDto> buscarClientes();
    public Optional<ClienteDto> buscarClientePorId(Long id);
    public ClienteDto guardarCliente(ClienteDto clienteDto);
    public void eliminarCliente(Long id);
    public Optional<ClienteDto> modificarCliente(ClienteDto clienteDto, Long id);*/
   // public List<Ods_Recurso> buscarMovimientos();

    public List<Ods_Recurso> findAll();
    public long Count();

}
