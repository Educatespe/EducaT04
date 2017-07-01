
package ec.edu.espe.isi.educat04.dao;

import ec.edu.espe.isi.educat04.model.CapacitacionAlumno;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Clase que registra la informcion de las capacitaciones del alumno. .
 * @author: Cristhian J Arevalo.
 * @version: 1/7/2017.
 */
@Stateless
public class CapacitacionAlumnoFacade extends AbstractFacade<CapacitacionAlumno> {

    @PersistenceContext(unitName = "ec.edu.espe.isi.educat04_EducaT04-ejb_ejb_1PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public CapacitacionAlumnoFacade() {
        super(CapacitacionAlumno.class);
    }
    
}
