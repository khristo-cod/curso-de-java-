package palabrathis;

import clases.Persona;

public class PalabraThis {
    public static void main(String[] args) {
        Persona persona = new Persona ( "Juan", "Perez");
        System.out.println("persona nombre = " + persona.nombre);
        System.out.println("persona apellido = " + persona.apellido);
    }
}

class persona{
    String nombre;
    String apellido;
    
    persona (String nombre, String apellido){
     this.nombre = nombre;
     this.apellido = apellido;
    }
}

class imprimir{
    public void imprimir (Persona persona){
        
    }
}