public class Pessoa {
    private String nome;
    private Integer idade;
    public EstadoCivil estadoCivil;

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

    public double descontoEstadoCivil(double valorBase){
        double descontoEC = 0.0;

        switch (estadoCivil){
            case SOLTEIRO:
                descontoEC = valorBase * (1 - 0.08);
                break;
            case CASADO:
                descontoEC = valorBase * (1 - 0.025);
                break;
            case VIUVO:
                descontoEC = valorBase * (1 - 0.05);
                break;
        }

        return descontoEC;
        }
    }
