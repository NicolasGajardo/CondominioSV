/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.session;

import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Hamzo
 */
@Local
public interface CodominioSendaVistaSessionBeanLocal {

    int businessMethod(String parameter1);

    boolean iniciarSession(String username, String password);

    public List<ItemAgenda> getAgenda();
    
}
