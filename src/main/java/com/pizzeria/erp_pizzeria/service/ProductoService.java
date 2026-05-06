package com.pizzeria.erp_pizzeria.service;

import com.pizzeria.erp_pizzeria.model.Producto;
import com.pizzeria.erp_pizzeria.repository.ProductoRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ProductoService {

    private final ProductoRepository productoRepository;

    public ProductoService(ProductoRepository productoRepository) {
        this.productoRepository = productoRepository;
    }

    public List<Producto> listarTodos() {
        return productoRepository.findAll();
    }

    public Producto buscarPorId(int id) {
        return productoRepository.findById(id).orElse(null);
    }

    public Producto guardar(Producto producto) {
        return productoRepository.save(producto);
    }

    public Producto actualizar(int id, Producto producto) {
        producto.setId(id);
        return productoRepository.save(producto);
    }

    public void  eliminarPorId(int id) {
        productoRepository.deleteById(id);
    }
}