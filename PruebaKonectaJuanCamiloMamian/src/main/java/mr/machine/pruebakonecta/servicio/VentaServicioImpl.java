/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mr.machine.pruebakonecta.servicio;

import mr.machine.pruebakonecta.dao.IVentaDao;
import mr.machine.pruebakonecta.dominio.Venta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Mr. Machine
 */
@Service
public class VentaServicioImpl implements IVentaServicio{

    @Autowired
    IVentaDao iVentaDao;
    
    @Transactional
    @Override
    public void guardar(Venta ventaProducto) {
        iVentaDao.save(ventaProducto);
    }
    
}
