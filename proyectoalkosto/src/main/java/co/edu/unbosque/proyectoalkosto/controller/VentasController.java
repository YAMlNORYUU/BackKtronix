package co.edu.unbosque.proyectoalkosto.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.edu.unbosque.proyectoalkosto.model.Producto;
import co.edu.unbosque.proyectoalkosto.model.Sucursal;
import co.edu.unbosque.proyectoalkosto.model.Trabajador;
import co.edu.unbosque.proyectoalkosto.model.Venta;
import co.edu.unbosque.proyectoalkosto.repository.ProductoRepository;
import co.edu.unbosque.proyectoalkosto.repository.SucursalRepository;
import co.edu.unbosque.proyectoalkosto.repository.TrabajadorRepository;
import co.edu.unbosque.proyectoalkosto.repository.VentaRepository;


@RestController
@RequestMapping("/api")
public class VentasController {

	@Autowired
	private VentaRepository ventadao;
	private TrabajadorRepository tradao;
	private SucursalRepository sudao;
	private ProductoRepository prodao;


	@GetMapping("/ventas-empleados")
	public ResponseEntity<Iterable<Venta>> getAllVentas() {
		List<Venta> all = (List<Venta>) ventadao.findAll();

		if (all.isEmpty()) {
			return ResponseEntity.status(HttpStatus.NO_CONTENT).body(all);
		}
		return ResponseEntity.status(HttpStatus.FOUND).body(all);
	}
	
	@GetMapping("/trabajador")
	public ResponseEntity<Iterable<Trabajador>> getAllTrabajador() {
		List<Trabajador> all = (List<Trabajador>) tradao.findAll();

		if (all.isEmpty()) {
			return ResponseEntity.status(HttpStatus.NO_CONTENT).body(all);
		}
		return ResponseEntity.status(HttpStatus.FOUND).body(all);
	}
	
	@GetMapping("/sucursal")
	public ResponseEntity<Iterable<Sucursal>> getAllSucursal() {
		List<Sucursal> all = (List<Sucursal>) sudao.findAll();

		if (all.isEmpty()) {
			return ResponseEntity.status(HttpStatus.NO_CONTENT).body(all);
		}
		return ResponseEntity.status(HttpStatus.FOUND).body(all);
	}
	
	@GetMapping("/ventas-empleados")
	public ResponseEntity<Iterable<Producto>> getAllProductos() {
		List<Producto> all = (List<Producto>) prodao.findAll();

		if (all.isEmpty()) {
			return ResponseEntity.status(HttpStatus.NO_CONTENT).body(all);
		}
		return ResponseEntity.status(HttpStatus.FOUND).body(all);
	}
}
