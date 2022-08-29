package operaciones;

public class Aritmetica {
    //atributos de la clase

    int a;
    int b;
    int alt, anc, prof;

    //metodo modificador de acceso
    public void sumar() {
        int resultado = a + b;
        System.out.println("resultado = " + resultado);
    }

    public int sumarConRetorno() {
        return a + b;
    }

    public int sumarConArgumentos(int arg1, int arg2) {
        a = arg1;
        b = arg2;
        return a + b;
    }

    public int calculeVolumen() {
        int res = ((alt + anc + prof)*2);
        return(res);
    }

    public int calculeVolumenConArgumentos(int e, int d, int c) {
        anc = e;
        alt = d;
        prof = c;
        int res = (anc + alt + prof)*2;
        return (res);
    }
}
