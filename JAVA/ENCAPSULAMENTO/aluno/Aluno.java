package ENCAPSULAMENTO.aluno;

public class Aluno {
    private String nome;
    private int matricula;
    private Double media;
    private String situacao;

    public Aluno(String nome, int matricula, Double media){
        this.nome = nome;
        this.matricula = matricula;
        this.media = media;
        verificaSituacao();
    }

    private void verificaSituacao(){
        if (media >=6.0) {
            this.situacao = "APROVADO";
        } else {
            this.situacao = "REPROVADO";
        }
    }

    public String resultadoFinal(){
        String r = "Nome: "+nome+"\nMatricula: "+matricula+"\nMedia: "+media+"\nSituacao: "+situacao;
        return r;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }
    
    public int getMatricula() {
        return matricula;
    }

    public void setMatricula (int matricula){
        this.matricula = matricula;
    }

    public Double getMedia() {
        return media;
    }

    public void setMedia(Double media){
        this.media = media;
        verificaSituacao();
    }





}
