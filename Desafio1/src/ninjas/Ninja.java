package ninjas;

public class Ninja {
    private String nome = "Jairo";
    private int idade = 12;
    private String missao = "Lavar pratos";
    private String nivelMissao = "D";
    private String statusDeConclusao = "Não-Concluída";

    // GETTER E SETTER DE NOME
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    // GETTER E SETTER DE IDADE
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }

    // GETTER E SETTER DE MISSAO
    public String getMissao() {
        return missao;
    }
    public void setMissao(String missao) {
        this.missao = missao;
    }

    // GETTER E SETTER DE NIVEL
    public String getNivelMissao() {
        return nivelMissao;
    }
    public void setNivelMissao(String nivelMissao) {
        this.nivelMissao = nivelMissao;
    }

    // GETTER E SETTER DE STATUS
    public String getStatusDeConclusao() {
        return statusDeConclusao;
    }
    public void setStatusDeConclusao(String statusDeConclusao) {
        this.statusDeConclusao = statusDeConclusao;
    }

    public void verificar(){
        if(idade<15){
            if(nivelMissao.equalsIgnoreCase("C") || nivelMissao.equalsIgnoreCase("D")){
                setStatusDeConclusao("Concluída");
            }else{
                setStatusDeConclusao("Não-Concluída");
            }
        }else{
            setStatusDeConclusao("Concluída");
        }
    }
}
