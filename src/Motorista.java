public class Motorista extends Pessoa{

    private Automovel.Tipo automovel;
    private boolean estacionamento;

    public Motorista(String nome, Integer idade, Pessoa.EstadoCivil estadoCivil, Automovel.Tipo automovel, boolean portao){
        super(nome, idade, estadoCivil);
        this.automovel = automovel;
        this.estacionamento = portao;
    }

    public Automovel.Tipo getAutomovel() {
        return automovel;
    }

    public boolean getEstacionamento() {
        return estacionamento;
    }
}
