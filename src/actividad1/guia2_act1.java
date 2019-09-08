package actividad1;

public class guia2_act1 {
    public static void main(String[] args) {
        Dupla primerPar = new Dupla();
        int x = 0, y = 0;
        primerPar.Guarda(12, 32);
        primerPar.Lee(x, y);
        System.out.println("Valor de primerPar.a " + primerPar.a);
        System.out.println("Valor de primerPar.b " + primerPar.b);
    }    
}

class Dupla {
    int a;
    int b;

    public void Guarda(int a2, int b2) {
        this.a = a2;
        this.b = b2;
    }

    public void Lee(Integer a2, Integer b2) {
        a2 = this.a;
        b2 = this.b;
    }
}
