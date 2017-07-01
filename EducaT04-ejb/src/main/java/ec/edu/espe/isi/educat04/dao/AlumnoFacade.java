
package ec.edu.espe.isi.educat04.dao;

import ec.edu.espe.isi.educat04.model.Alumno;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Esta clase define al objeto alumno la cual contiene todos sus atributos.
 * @author: Cristhian J Arevalo.
 * @version: 1/7/2017.
 */
@Stateless
public class AlumnoFacade extends AbstractFacade<Alumno> {

    @PersistenceContext(unitName = "ec.edu.espe.isi.educat04_EducaT04-ejb_ejb_1PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public AlumnoFacade() {
        super(Alumno.class);
    }
    
}
