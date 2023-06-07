package co.edu.unbosque.proyectoalkosto.repository;

import org.springframework.data.repository.CrudRepository;

import co.edu.unbosque.proyectoalkosto.model.Producto;

public interface ProductoRepository extends CrudRepository<Producto, Long> {
    // Métodos personalizados si los necesitas
}
