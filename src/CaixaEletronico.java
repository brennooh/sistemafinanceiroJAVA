public class CaixaEletronico {

    private Conta conta;

    public Cliente autenticar(String numeroConta){
        Cliente cliente = new Cliente();
        cliente.setNome("Beltrano");
        cliente.setSobrenome("Tricides");

        ContaCorrente contaCorrente = new ContaCorrente(cliente, numeroConta);
        this.conta = contaCorrente;
        return cliente;
    }

    public void exibirSaldo(){
        if (this.conta == null){
            System.out.println("Faça a autenticacao primeiro!");
        } else{
        System.out.println("O seu saldo é" + this.conta.consultarSaldo());
        }
    }

    public void efetuarSaque(double valor){
        if (this.conta == null){
            System.out.println("Faça a autenticacao primeiro!");
        } else{

        this.conta.sacar(valor);
        System.out.println("Saque efetuado com sucesso");
        System.out.println("O seu novo saldo é" + this.conta.consultarSaldo());
        }
    }

    public void efetuarDeposito(double valor){
        if (this.conta == null){
            System.out.println("Faça a autenticacao primeiro!");
        } else{
        this.conta.depositar(valor);
        System.out.println("Deposito efetuado com sucesso");
        System.out.println("O novo saldo é" + this.conta.consultarSaldo());
        }
    }

    public void efetuarTransfer(Conta destino, double valor){
        if (this.conta == null){
            System.out.println("Faça a autenticacao primeiro!");
        } else{
            this.conta.transferir(valor, destino);
            System.out.println("Transferencia realizada com sucesso");
            System.out.println("O seu novo saldo é:" + this.conta.consultarSaldo());
        }
    }

    public void encerrarUso(){
        this.conta = null;
    }
}
