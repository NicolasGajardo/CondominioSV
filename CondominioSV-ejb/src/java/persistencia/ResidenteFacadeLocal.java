/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author ottoekog
 */
@Local
public interface ResidenteFacadeLocal {

    void create(Residente residente);

    void edit(Residente residente);

    void remove(Residente residente);

    Residente find(Object id);

    List<Residente> findAll();

    List<Residente> findRange(int[] range);

    int count();
    
}
