/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

import Clases.Ejecutivo;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author alumnos09
 */
@Stateless
public class EjecutivoFacade extends AbstractFacade<Ejecutivo> {

    @PersistenceContext(unitName = "NicolasCastroI031PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public EjecutivoFacade() {
        super(Ejecutivo.class);
    }
    
}
