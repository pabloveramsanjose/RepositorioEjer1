package agenda;

import java.util.ArrayList;

public class Agenda {
	
    ArrayList<Contacto> contactos = new ArrayList<>();
	
    public void agregarContacto(Contacto c) {
       
        if (c.getNombre() != null && c.getEmail() != null && c.getTelefono() != null) {
            
            contactos.add(c);
        }
    }
}