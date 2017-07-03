/*
 * MIT Licence
 * All Right Reserved
 */
package ec.edu.espe.isi.educat04.dao;

import ec.edu.espe.isi.educat04.model.Capacitacion;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Clase que define la Capacitación usando el pratron de diseño Facade.
 * @author Pablo Guallichico
 * @version 01/07/2017
 */
@Stateless
public class CapacitacionFacade extends AbstractFacade<Capacitacion> {
    @PersistenceContext(unitName = "ec.edu.espe.isi.educat04_EducaT04-ejb_ejb_1PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public CapacitacionFacade() {
        super(Capacitacion.class);
    }
    
}
