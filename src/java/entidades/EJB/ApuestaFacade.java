/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades.EJB;

import entidades.Apuesta;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author ealonso
 */
@Stateless
public class ApuestaFacade extends AbstractFacade<Apuesta> {

    @PersistenceContext(unitName = "UnimonitoEJBPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ApuestaFacade() {
        super(Apuesta.class);
    }
    
}
