package clases;

public class Persona {
    //atributos de la clase
    public String nombre;
    public String apellido;

    public Persona(String juan, String perez) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    //metodos de la clase
    public void desplegarInformacion(){
        System.out.println("nombre = " + nombre);
        System.out.println("apellido = " + apellido);
        
    }
}
