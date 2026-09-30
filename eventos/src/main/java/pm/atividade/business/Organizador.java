package pm.atividade.business;

public class Organizador {
    
    private String nome;
    private String CPF;
    private String telefone;
    private String areaAtuacao;
    private boolean responsavel;
    
    public Organizador(String nome, String CPF, String telefone, String areaAtuacao) {
        this.nome = nome;
        CPF = CPF;
        this.telefone = telefone;
        this.areaAtuacao = areaAtuacao;
        this.responsavel = false;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCPF() {
        return CPF;
    }
    public void setCPF(String CPF) {
        CPF = CPF;
    }
    
    public String getAreaAtuacao() {
        return areaAtuacao;
    }
    public void setAreaAtuacao(String areaAtuacao) {
        this.areaAtuacao = areaAtuacao;
    }

    public boolean isResponsavel() {
        return responsavel;
    }
    public void setResponsavel(boolean responsavel) {
        this.responsavel = responsavel;
    }
    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

}
