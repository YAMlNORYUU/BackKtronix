package co.edu.unbosque.proyectoalkosto.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "sucursales")
public class Sucursal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;

    @OneToMany(mappedBy = "sucursal")
    private List<Trabajador> trabajadores;

    @OneToMany(mappedBy = "sucursal")
    private List<Venta> ventas;

    @OneToMany(mappedBy = "sucursal")
    private List<Producto> inventario;

    // Constructor, getters y setters
    // ...

    public void despedirUltimosTresTrabajadores() {
        int totalTrabajadores = trabajadores.size();
        int numTrabajadoresDespedir = Math.min(3, totalTrabajadores);
        for (int i = 0; i < numTrabajadoresDespedir; i++) {
            Trabajador trabajadorDespedido = trabajadores.remove(totalTrabajadores - 1 - i);
            generarCartaDespidoPDF(trabajadorDespedido);
        }
    }

    private void generarCartaDespidoPDF(Trabajador trabajador) {
        // Lógica para generar el PDF de la carta de despido
    }

    public List<Venta> obtenerVentasTrabajador(Trabajador trabajador) {
		return ventas;
        // Lógica para obtener las ventas de un trabajador específico
    }

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Trabajador> getTrabajadores() {
		return trabajadores;
	}

	public void setTrabajadores(List<Trabajador> trabajadores) {
		this.trabajadores = trabajadores;
	}

	public List<Venta> getVentas() {
		return ventas;
	}

	public void setVentas(List<Venta> ventas) {
		this.ventas = ventas;
	}

	public List<Producto> getInventario() {
		return inventario;
	}

	public void setInventario(List<Producto> inventario) {
		this.inventario = inventario;
	}
    
}