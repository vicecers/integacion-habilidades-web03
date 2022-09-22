package com.cersocode.integrador_web_03.controller;

import com.cersocode.integrador_web_03.model.Producto;
import com.cersocode.integrador_web_03.service.ServiceProducto;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author vicec
 */
@Controller
public class RegistraProductoController {

    ServiceProducto serviceproducto = new ServiceProducto();

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("producto", new Producto());
        return "index";
    }

    @PostMapping("/registrar")
    public String registrar(@ModelAttribute("porducto") Producto producto, Model model) {
        serviceproducto.agregar(producto);
        model.addAttribute("producto", producto);
        return "muestraRegistro";
    }
    
    @GetMapping("/muestraProductos")
    public String muestraProductos (Model model){
        List lstProductos = serviceproducto.getProductos();
        int cantRegistros=lstProductos.size();
        model.addAttribute("productos", lstProductos);
        model.addAttribute("cantRegistros", cantRegistros);
        return "despliegaProductos";
    }
    
}
