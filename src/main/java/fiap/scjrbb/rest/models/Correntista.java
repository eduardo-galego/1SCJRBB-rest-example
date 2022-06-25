package fiap.scjrbb.rest.models;

public class Correntista {

    private String id;
    private String nome;
    private String telefone;

    public Correntista() {
        super();
    }

    public Correntista(String id, String nome, String telefone) {
        this();
        this.id = id;
        this.nome = nome;
        this.telefone = telefone;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}
