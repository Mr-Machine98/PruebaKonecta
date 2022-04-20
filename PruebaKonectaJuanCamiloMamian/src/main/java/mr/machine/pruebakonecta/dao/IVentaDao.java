/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package mr.machine.pruebakonecta.dao;

import mr.machine.pruebakonecta.dominio.Venta;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Mr. Machine
 */
public interface IVentaDao extends JpaRepository<Venta, Long>{}
