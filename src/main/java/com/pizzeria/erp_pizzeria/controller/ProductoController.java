package com.pizzeria.erp_pizzeria.controller;

import com.pizzeria.erp_pizzeria.model.Producto;
import com.pizzeria.erp_pizzeria.service.ProductoService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/productos")
public class ProductoController {

    private final ProductoService productoService;

    public ProductoController(ProductoService productoService) {
        this.productoService = productoService;
    }

    @GetMapping
    public List<Producto> listar() {
        return productoService.listarTodos();
    }

    @GetMapping("/{id}")
    public Producto buscarPorId(@PathVariable int id) {
        return productoService.buscarPorId(id);
    }

    @PostMapping
    public Producto crear(@RequestBody Producto producto) {
        return productoService.guardar(producto);
    }

    @PutMapping ("/{id}")
    public Producto actualizar(@PathVariable int id, @RequestBody Producto producto) {
        return productoService.actualizar(id, producto);
    }

    @DeleteMapping ("/{id}")
    public void eliminarPorId(@PathVariable int id) {
        productoService.eliminarPorId(id);
    }
}