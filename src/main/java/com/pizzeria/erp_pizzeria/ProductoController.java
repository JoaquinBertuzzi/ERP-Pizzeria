package com.pizzeria.erp_pizzeria;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/productos")
public class ProductoController {

    private  List<Producto> productos = new ArrayList<>(Arrays.asList(

        new Producto(1, "Pizza Pepperoni", 9.99),
        new Producto(2, "Burger Clásica", 7.50),
        new Producto(3, "Pasta Carbonara", 8.00)
));
@GetMapping
    public List<Producto> listar() {
        return productos;
    }

    @GetMapping("/{id}")
    public Producto buscarPorId(@PathVariable int id) {
        return productos.stream()
                .filter(p -> p.getId() == id)
                .findFirst()
                .orElse(null);
    }

    @PostMapping
    public Producto crear(@RequestBody Producto producto) {
        productos.add(producto);
        return producto;
    }
}