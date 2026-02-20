package agenda;

import java.util.ArrayList;

public class Agenda {
	
	public void eliminarContacto(String nombre) {
    	for ( int i = 0; i < contactos.size();i++) {
    		if (contactos.get(i).getNombre().contentEquals(nombre)) {
    				contactos.remove(i);
    		}
    	}
    }
    
    public Contacto buscarContacto(String nombre) {
    	for (Contacto c : contactos) {
    		if (c.getNombre().equals(nombre)) {
    			return c;
    		}
    	}
    	return null;
    	
    	
    }
}