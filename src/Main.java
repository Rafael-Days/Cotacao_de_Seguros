public class Main {
    public static void main(String[] args) {
        Motorista motorista1 = new Motorista("Roberto", 30, Pessoa.EstadoCivil.CASADO, Automovel.Tipo.CARGA, true);
        Motorista motorista2 = new Motorista("Roger", 20, Pessoa.EstadoCivil.SOLTEIRO, Automovel.Tipo.PASSEIO, false);
        Motorista motorista3 = new Motorista("Roseli", 40, Pessoa.EstadoCivil.VIUVO, Automovel.Tipo.TRANSPORTE, true);


        System.out.println("Informações do Motorista:");
        System.out.println("Nome: " + motorista1.getNome());
        System.out.println("Idade: " + motorista1.getIdade());
        System.out.println("Estado Civil: " + motorista1.getEstadoCivil());
        System.out.println("Tipo do Automóvel: " + motorista1.getAutomovel());
        System.out.println("Portão Automático: " + motorista1.getEstacionamento());


    }

}

