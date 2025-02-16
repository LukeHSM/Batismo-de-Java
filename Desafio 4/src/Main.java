import Enums.TipoEspecialidade;
import Enums.TipoHabilidade;
import classes.NinjaAvancado;
import classes.NinjaBasico;

public class Main {
    public static void main(String[] args) {
        NinjaBasico ninja1 = new NinjaBasico("Gustavo", 15, TipoHabilidade.NINJUSTU);
        NinjaAvancado ninja2 = new NinjaAvancado("Agatha", 14, TipoHabilidade.GENJUTSU, TipoEspecialidade.SHARINGAN);

        ninja1.mostrarInformacoes();
        ninja1.executarHabilidade();
        System.out.println("\n");
        ninja2.mostrarInformacoes();
        ninja2.executarHabilidade();
    }
}