/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.eurismar;

import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Eurismar
 */
@ManagedBean
@RequestScoped
public class CategoriaFace {

   List<Categoria> categorias;
    public CategoriaFace() {
    }

    public Categoria getCategorias() {
        
        List<Categoria> categorias;
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("FinanceiroPU");
        CategoriaJpaController cc = new CategoriaJpaController(emf);
        
        
        Categoria c = new Categoria();
        c.setId(8);
        c.setNome("Farmacia");
        
      //  cc.create(c);
        
        
       // categoria =  cc.findCategoriaEntities();         
        //return categorias;
        
    }

    public void setCategorias(Categoria categorias) {
        this.categorias = categorias;
    }
    
}
