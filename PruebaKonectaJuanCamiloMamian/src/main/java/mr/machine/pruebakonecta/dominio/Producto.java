/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mr.machine.pruebakonecta.dominio;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import lombok.Data;


/**
 *
 * @author Mr. Machine
 */
@Entity
@Data
@Table(name = "productos")
public class Producto implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idProducto;

    @NotEmpty
    @Column(name = "nombre_producto")
    private String nombreProducto;

    @NotEmpty
    private String referencia;

    private int precio;

    private int peso;

    @NotEmpty
    private String categoria;


    private int stock;
    
    @NotEmpty
    @Column(name = "fecha_creacion")
    private String fechaCreacion;

}
