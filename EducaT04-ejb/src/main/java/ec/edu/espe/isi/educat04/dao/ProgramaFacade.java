
package ec.edu.espe.isi.educat04.dao;

import ec.edu.espe.isi.educat04.model.Programa;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Esta clase define al objeto programa facede la cual contiene todos sus atributos.
 * @author: Mario Neptalí Catota Guerrero.
 * @version: 03/07/2017.
 */
@Stateless
public class ProgramaFacade extends AbstractFacade<Programa> {

    @PersistenceContext(unitName = "ec.edu.espe.isi.educat04_EducaT04-ejb_ejb_1PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ProgramaFacade() {
        super(Programa.class);
    }
    
}
