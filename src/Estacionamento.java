public class Estacionamento {

    public boolean portao;

    public Estacionamento(boolean portao){
        this.portao = portao;
    }

    public double descontoEstacionamento(double valorBase) {
        double descontoEstacio = 0.0;

        if (portao) { // PORTAO AUTOMATICO
            descontoEstacio = valorBase * (1 - 0.045);
        } else { // PORTAO MANUAL
            descontoEstacio = valorBase * (1 - 0.02);
        }

        return descontoEstacio;

    }

}
