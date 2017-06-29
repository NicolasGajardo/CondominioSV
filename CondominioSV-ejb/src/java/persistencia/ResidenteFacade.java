/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author ottoekog
 */
@Stateless
public class ResidenteFacade extends AbstractFacade<Residente> implements ResidenteFacadeLocal {

    @PersistenceContext(unitName = "CondominioSV-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ResidenteFacade() {
        super(Residente.class);
    }
    
}
