package classes;

import Enums.TipoEspecialidade;
import Enums.TipoHabilidade;
import interfaces.Ninja;

public class NinjaAvancado extends NinjaBasico implements Ninja {
    TipoEspecialidade especialidade;

    public NinjaAvancado(String nome, int idade, TipoHabilidade habilidade, TipoEspecialidade especialidade) {
        super(nome, idade, habilidade);
        this.especialidade = especialidade;
    }

    public void mostrarInformacoes(){
        super.mostrarInformacoes();
    }

    public void executarHabilidade(){
        System.out.println(this.nome + " utiliza sua habilidade de " + this.habilidade + " e sua especialidade é " + this.especialidade);
    }
}
