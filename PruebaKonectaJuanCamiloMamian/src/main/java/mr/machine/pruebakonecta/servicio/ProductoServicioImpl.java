package mr.machine.pruebakonecta.servicio;

import java.util.List;
import mr.machine.pruebakonecta.dao.IProductosDao;
import mr.machine.pruebakonecta.dominio.Producto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Mr. Machine
 */
@Service
public class ProductoServicioImpl implements IProductoServicio{

    @Autowired
    private IProductosDao iProductosDao;
    
    @Override
    @Transactional(readOnly = true)
    public List<Producto> listarProductos() {
        return iProductosDao.findAll();
    }

    @Transactional
    @Override
    public void guardar(Producto producto) {
        iProductosDao.save(producto);
    }

    @Transactional
    @Override
    public void eliminar(Producto producto) {
        iProductosDao.delete(producto);
    }

    @Transactional
    @Override
    public Producto encontrarProducto(Producto producto) {
        return iProductosDao.findById(producto.getIdProducto()).orElse(null);
    }
    
}
