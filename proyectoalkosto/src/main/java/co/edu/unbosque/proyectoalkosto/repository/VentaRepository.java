package co.edu.unbosque.proyectoalkosto.repository;


import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import co.edu.unbosque.proyectoalkosto.model.Trabajador;
import co.edu.unbosque.proyectoalkosto.model.Venta;

public interface VentaRepository extends CrudRepository<Venta, Long> {
    @Query("SELECT v FROM Venta v WHERE v.vendedor = :vendedor")
    List<Venta> findByVendedor(@Param("vendedor") Trabajador vendedor);
}
