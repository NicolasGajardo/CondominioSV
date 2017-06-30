/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

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
    
    public List<Residente> buscarResidentePorRut(String rut){
        Query q;
        q = getEntityManager().createQuery("SELECT r FROM Residente r WHERE r.rut = '"+rut+"'");
        List<Residente> listResidente = q.getResultList();
        return listResidente;
    }
    
    public List<Residente> buscarResidentePorId(int id){
        Query q;
        q = getEntityManager().createQuery("SELECT r FROM Residente r WHERE r.id ="+id);
        List<Residente> listResidente = q.getResultList();
        return listResidente;
    }
    
    public List<Residente> buscarResidentePorNombre(String nombre){
        Query q;
        q = getEntityManager().createQuery("SELECT r FROM Residente r WHERE r.nombre LIKE '%"+nombre+"%' ORDER BY r.nombre");
        List<Residente> listResidente = q.getResultList();
        return listResidente;
    }
    
    public List<Residente> buscarResidentePorDepto(String depto){
        Query q;
        q = getEntityManager().createQuery("SELECT r FROM Residente r WHERE r.depto = '"+depto+"' ORDER BY r.nombre");
        List<Residente> listResidente = q.getResultList();
        return listResidente;
    }
    
}
