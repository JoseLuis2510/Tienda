package com.tienda.service.impl;

import com.tienda.dao.CategoriaDao;
import com.tienda.service.CategoriaService;
import com.tienda.domain.Categoria;
import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

@Service
public class CategoriaServiceImpl implements CategoriaService {

    @Autowired
    private CategoriaDao categoriaDao;

    @Override
    @Transactional(readOnly = true)
    public List<Categoria> getCategorias(boolean activos) {
        List<Categoria> lista = categoriaDao.findAll();
        if (activos) {
            //Para remover las categorias donde activo= false
            lista.removeIf(x -> !x.isActivo());
        }
        return lista;

    }
}