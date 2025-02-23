import interfaces.Conta;

public abstract class ContaBancaria implements Conta{
    public abstract void consultarSaldo();
    public abstract void depositar(double qntd);
}
