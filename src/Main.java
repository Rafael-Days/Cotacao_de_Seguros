public class Main {
    public static void main(String[] args) {
        Automovel automovel1 = new Automovel(50000.00, Automovel.Tipo.PASSEIO);
        Estacionamento estacionamento = new Estacionamento(true);
        Motorista motorista1 = new Motorista("Roberto", 30, Pessoa.EstadoCivil.CASADO, automovel1, estacionamento);


        //Motorista motorista2 = new Motorista("Roger", 20, Pessoa.EstadoCivil.SOLTEIRO, Automovel.Tipo.PASSEIO, false);
        //Motorista motorista3 = new Motorista("Roseli", 40, Pessoa.EstadoCivil.VIUVO, Automovel.Tipo.TRANSPORTE, true);


        //double valorSeguroMotorista1 = motorista1.calcularValorSeguro();

        System.out.println("Informações do Motorista:");
        System.out.println("Nome: " + motorista1.getNome());
        System.out.println("Idade: " + motorista1.getIdade());
        System.out.println("Estado Civil: " + motorista1.getEstadoCivil());
        System.out.println("Tipo do Automóvel: " + motorista1.getAutomovel());
        System.out.println("Portão Automático: " + motorista1.getEstacionamento());
        System.out.println("Valor Base do Automóvel: " + motorista1.getValorBase(automovel1));

        double descontoMotorista1 = motorista1.calcularDescontoAutomovel();
        System.out.println("Valor do Seguro com Desconto do Automóvel: " + descontoMotorista1);

        double descontoMotorista2 = motorista1.calcularDescontoEstadoCivil();
        System.out.println("Valor do Seguro com Desconto do Estado Civil: " + descontoMotorista2);

        double descontoMotorista3 = motorista1.calcularDescontoEstacionamento();
        System.out.println("Valor do Seguro com Desconto do Estado Civil: " + descontoMotorista3);

    }

}

