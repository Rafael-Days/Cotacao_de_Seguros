public class Pessoa {
    private String nome;
    private Integer idade;
    private EstadoCivil estadoCivil;

    enum EstadoCivil {
        SOLTEIRO, CASADO, VIUVO;
    }

    public Pessoa(String nome, Integer idade, EstadoCivil estadoCivil) {
        this.nome = nome;
        this.idade = idade;
        this.estadoCivil = estadoCivil;
    }

    public String getNome() {
        return nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public EstadoCivil getEstadoCivil() {
        return estadoCivil;
    }
}