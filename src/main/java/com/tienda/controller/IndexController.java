/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/springframework/Controller.java to edit this template
 */
package com.tienda.controller;

import com.tienda.dao.UsuarioDao;
import com.tienda.domain.Usuario;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class IndexController {
    @Autowired
    UsuarioDao UsuarioDao;
    
    @RequestMapping("/")
    public String page(Model model, HttpSession session) {
        //String imagen =(String) session.getAttribute("usuarioImagen");
        //model.addAttribute("avatar", imagen);
        //session.setAttribute("idUsuario", model);
        
        //Obtener usuario loggeado
       /* Object principal =SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        UserDetails user=null;
        if(principal instanceof UserDetails){
            user=(UserDetails) principal;
        }
        
        if(user!=null){
            Usuario usuario = UsuarioDao.findByUsername(user.getUsername());
            session.setAttribute("Email", usuario.getCorreo());
        }*/
        return "index";
    }
    
}
