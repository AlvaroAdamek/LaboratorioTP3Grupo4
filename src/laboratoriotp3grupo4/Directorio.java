
package laboratoriotp3grupo4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import javax.swing.JOptionPane;


public class Directorio {
    private HashMap <Long,Cliente> registro= new HashMap();
    
    public void agregarCliente(Cliente cliente, Long num){
        
         if (registro.containsKey(num)) {
             JOptionPane.showMessageDialog(null,"No se puedo agregar");
           
        } else {
           registro.put(num, cliente);
             JOptionPane.showMessageDialog(null,"Contacto agregado");
          
        }
               
    }
    
    public Cliente buscarCliente(long num){
        for (Map.Entry<Long, Cliente> entry : registro.entrySet()) {
            if (entry.getKey()== num) {
                return entry.getValue();
            } 
        }
        JOptionPane.showMessageDialog(null,"El cliente no se encuentra en el directorio");
        return null;
    }
    
    public ArrayList<Long> buscarTelefono(String apellido){
        ArrayList<Long> busTelefono=new ArrayList();
        for (Map.Entry<Long, Cliente> entry : registro.entrySet()) {
            Cliente value = entry.getValue();
            if (value.getApellido().equalsIgnoreCase(apellido)) {
                busTelefono.add(entry.getKey());
            } 
        }
        
        return busTelefono;
        
    }
    
    public ArrayList<Cliente> buscarClientes(String ciudad){
        ArrayList<Cliente> busCliente= new ArrayList();
        for (Map.Entry<Long, Cliente> entry : registro.entrySet()) {
            Cliente value = entry.getValue();
            if (value.getCiudad().equalsIgnoreCase(ciudad)) {
                busCliente.add(value);
            }
            
        }
        return busCliente;
    }
    
    public void borrarCliente(long telefono){
        if (registro.containsKey(telefono)) {
            JOptionPane.showMessageDialog(null, "Eliminado con exito el telefono " +telefono);
            registro.remove(telefono);
            
        } else {
            JOptionPane.showMessageDialog(null, "El numero no esta cargado en el directorio");
          
        }
                            
        
    }
    
    
    
            
}
