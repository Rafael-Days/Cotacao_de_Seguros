public class Automovel {

    public double valorBase;
    public Tipo tipo;

    enum Tipo{
        PASSEIO, TRANSPORTE, CARGA;
    }

    public Automovel(double valorBase, Tipo tipo){
        this.valorBase = valorBase;
        this.tipo = tipo;
    }

    public double descontoAutomovel() {
        double descontoA = 0.0;

        switch (tipo) {
            case PASSEIO:
                descontoA = valorBase * (1 - 0.12);
                break;
            case TRANSPORTE:
                descontoA = valorBase * (1 - 0.135);
                break;
            case CARGA:
                descontoA = valorBase * (1 - 0.08);
                break;
        }

        return descontoA;
    }



}
