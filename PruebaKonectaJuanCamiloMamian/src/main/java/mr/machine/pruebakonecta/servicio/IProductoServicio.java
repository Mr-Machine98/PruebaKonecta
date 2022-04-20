/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package mr.machine.pruebakonecta.servicio;

import java.util.List;
import mr.machine.pruebakonecta.dominio.Producto;

/**
 *
 * @author Mr. Machine
 */
public interface IProductoServicio {
    public List<Producto> listarProductos();
    public void guardar(Producto producto);
    public void  eliminar(Producto producto);
    public Producto encontrarProducto(Producto producto);
}
