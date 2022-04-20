/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mr.machine.pruebakonecta.web;

import java.util.List;
import javax.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import mr.machine.pruebakonecta.dominio.Producto;
import mr.machine.pruebakonecta.dominio.Venta;
import mr.machine.pruebakonecta.servicio.IProductoServicio;
import mr.machine.pruebakonecta.servicio.IVentaServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

/**
 *
 * @author Mr. Machine
 */
@Controller
@Slf4j
public class ControladorMVC {

    @Autowired
    private IProductoServicio iProductoServicio;
    
    @Autowired
    private IVentaServicio iVentaServicio;

    /*
    Listar el producto
     */
    @GetMapping("/")
    public String crudInicio(Model model) {
        log.info("Listando productos cafetería...");
        List<Producto> productos = iProductoServicio.listarProductos();
        log.info("Listando productos: " + productos);
        model.addAttribute("productos", productos);
        return "index"; //retorna a la Pa'g inicial de la app
    }

    /*Almacenar productos*/
    @GetMapping("/agregarProducto")
    public String agregarProducto(Producto producto) {
        return "modificarProducto";
    }

    /*
    Guarda  el producto
    y verifica los campos si esta'n
    vacios
     */
    @PostMapping("/guardarProducto")
    public String guardarProducto(@Valid Producto producto, BindingResult errores) {
        if (errores.hasErrors()) return "modificarProducto";
        iProductoServicio.guardar(producto);
        return "redirect:/";
    }

    @GetMapping("/eliminarProducto")
    public String eliminarProdcuto(Producto producto) {
        iProductoServicio.eliminar(producto);
        return "redirect:/";
    }
    
    @GetMapping("/editarProducto")
    public String editarProducto(Producto producto, Model model) {
        producto = iProductoServicio.encontrarProducto(producto);
        model.addAttribute("producto", producto);
        return "modificarProducto";
    }
    
    
    
    /*Manda el objeto producto para realizar la compra*/
    @GetMapping("/comprarProducto")
    public String comprarProducto(Producto producto, Model model){
        producto = iProductoServicio.encontrarProducto(producto);
        model.addAttribute("producto", producto);
        return "comprarProducto";
    }
    
    /*
    realizar la compra
    */
    @PostMapping("/realizarCompraProducto")
    public String realizarCompraProducto(Producto producto) {
        
        log.info("Producto a comprar...");
        log.info(producto.toString());
        producto.setStock( producto.getStock() - 1 );
        iProductoServicio.guardar(producto);
        
        log.info("Guardando venta...");
        Venta nuevaVenta = new Venta();
        nuevaVenta.setPeso(producto.getPeso());
        nuevaVenta.setPrecio(producto.getPrecio());
        nuevaVenta.setProductoVendido(producto.getNombreProducto());
        nuevaVenta.setReferencia(producto.getReferencia());
        
        log.info(nuevaVenta.toString());
        iVentaServicio.guardar(nuevaVenta);
        
        return "redirect:/";
    }
    

}
