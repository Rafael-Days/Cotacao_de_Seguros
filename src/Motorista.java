public class Motorista extends Pessoa{

    private Automovel automovel;
    private Estacionamento estacionamento;

    public Motorista(String nome, Integer idade, Pessoa.EstadoCivil estadoCivil, Automovel automovel, Estacionamento estacionamento){
        super(nome, idade, estadoCivil);
        this.automovel = automovel;
        this.estacionamento = estacionamento;
    }

    public Automovel.Tipo getAutomovel() {
        return automovel.tipo;
    }

    public boolean getEstacionamento() {
        return estacionamento.portao;
    }

    public double getValorBase(Automovel automovel) {
        return automovel.valorBase;
    }

    public double calcularDescontoAutomovel() { //METODO PARA CALCULO DO DESCONTO
        double descontoA = automovel.descontoAutomovel();
        return descontoA;
    }

    public double calcularDescontoEstadoCivil() { //METODO PARA CALCULO DO DESCONTO do estado civil
        double descontoEC = super.descontoEstadoCivil(automovel.valorBase);
        return descontoEC;
    }

    public double calcularDescontoEstacionamento() {
        double descontoEstacio = estacionamento.descontoEstacionamento(automovel.valorBase);
        return descontoEstacio;
    }

}
