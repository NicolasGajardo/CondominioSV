/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.session;

import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateless;
import com.session.ItemAgenda;
import java.util.Date;

/**
 *
 * @author Hamzo
 */
@Stateless
public class CodominioSendaVistaSessionBean implements CodominioSendaVistaSessionBeanLocal {

    @Override
    public int businessMethod(String parameter1) {
        return 0;
    }
    
    /**
     *
     * @param username
     * @param password
     * @return
     */
    @Override
    public boolean iniciarSession(String username, String password){
        if(null!=username && null!=password){
            if(username.equals(password)){
                //TODO: Hacer llamada a la BD
                
                return true;
            }
        }
        return false;
    }
    
    @Override
    public List<ItemAgenda> getAgenda(){
        List<ItemAgenda> listItemAgenda = new ArrayList<ItemAgenda>();
        for (int i = 0; i < 10; i++) {
            ItemAgenda itemAgenda = new ItemAgenda();
            itemAgenda.setFechaHora(new Date());
            itemAgenda.setNombreCliente("Anastasio");
            itemAgenda.setObservaciones("A mostrar departamento con habitacion suite");
            itemAgenda.setRutCliente(""+((i+3)^15));
            
        }
        return listItemAgenda;
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    
    
}
