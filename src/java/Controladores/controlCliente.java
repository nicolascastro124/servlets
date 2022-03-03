/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import Clases.Cliente;
import Modelos.ClienteFacade;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Singleton;

/**
 *
 * @author alumnos09
 */
@Singleton
public class controlCliente implements controlClienteLocal {

    @EJB
    private ClienteFacade clienteFacade;

    @Override
    public List<Cliente> listaClientes() {
        
        return this.clienteFacade.findAll();
    }
    
    

   
   
  
    
    
    
}
