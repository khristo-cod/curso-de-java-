package operaciones;

public class Caja {
    public static void main(String[] args) {
        Aritmetica cCaja1 = new Aritmetica ();
        cCaja1.anc = 3;
        cCaja1.alt = 2;
        cCaja1.prof = 6;
        
        var res = cCaja1.calculeVolumen ();
        System.out.println("resultado desde retorno = " + res);
        
        res = cCaja1.calculeVolumenConArgumentos(3, 2, 6);
        System.out.println("resultado desde argumentos = " + res);
    }     
}
