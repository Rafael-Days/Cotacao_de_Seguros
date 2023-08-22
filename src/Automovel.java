public class Automovel {

    private Integer valorBase;

    enum Tipo{
        PASSEIO, TRANSPORTE, CARGA;
    }

    public Automovel(Integer valorBase){
        this.valorBase = valorBase;
    }

}
