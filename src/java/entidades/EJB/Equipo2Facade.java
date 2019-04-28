/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades.EJB;

import entidades.Equipo2;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author ealonso
 */
@Stateless
public class Equipo2Facade extends AbstractFacade<Equipo2> {

    @PersistenceContext(unitName = "UnimonitoEJBPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public Equipo2Facade() {
        super(Equipo2.class);
    }
    
}
