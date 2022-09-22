/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cersocode.integrador_web_03.service;

import com.cersocode.integrador_web_03.model.Producto;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author vicec
 */
public class ServiceProducto {

    private List<Producto> lstProductos = new ArrayList<Producto>();

    public void agregar(Producto p) {
        lstProductos.add(p);
    }

    public List getProductos() {
        return lstProductos;
    }
}
