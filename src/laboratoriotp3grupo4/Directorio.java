
package laboratoriotp3grupo4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;


public class Directorio {
    private HashMap <Long,Cliente> registro= new HashMap();
    
    public void agregarCliente(Cliente cliente, Long num){
        registro.put(num, cliente);
        
    }
    
    public Cliente buscarCliente(long num){
        for (Map.Entry<Long, Cliente> entry : registro.entrySet()) {
            if (entry.getKey()== num) {
                return entry.getValue();
            } 
        }
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
    
    public HashSet<Cliente> buscarClientes(String ciudad){
        HashSet<Cliente> busCliente= new HashSet();
        for (Map.Entry<Long, Cliente> entry : registro.entrySet()) {
            Cliente value = entry.getValue();
            if (value.getCiudad().equalsIgnoreCase(ciudad)) {
                busCliente.add(value);
            }
            
        }
        return busCliente;
    }
    
    public void borrarCliente(long telefono){
        registro.remove(telefono);
                
        
    }
    
    
    
            
}
