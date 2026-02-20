package agenda;

import java.util.ArrayList;

public class Agenda {
	
    ArrayList<Contacto> contactos = new ArrayList<>();
	
    public void agregarContacto(Contacto c) {
       
        if (c.getNombre() != null && c.getEmail() != null && c.getTelefono() != null) {
            
            contactos.add(c);
        }
    }
    
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
    
   public void listarContactos() {
	   if (contactos.isEmpty()) {
		   System.out.println("La agenda esta vacia");
	   }else {
		   System.out.println("== Lista Contactos ==");
		   for(Contacto c : contactos) {
			   System.out.println("Nombre: " + c.getNombre()+
					   "Nº Telefono: "+ c.getTelefono()+
					   "Email: "+ c.getEmail());
			   
		   }
	   }
   }
}
