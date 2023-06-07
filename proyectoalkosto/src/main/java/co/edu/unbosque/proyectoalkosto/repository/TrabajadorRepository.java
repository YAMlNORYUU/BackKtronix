package co.edu.unbosque.proyectoalkosto.repository;

import org.springframework.data.repository.CrudRepository;

import co.edu.unbosque.proyectoalkosto.model.Trabajador;

public interface TrabajadorRepository extends CrudRepository<Trabajador, Long> {
    // Métodos personalizados si los necesitas
}
