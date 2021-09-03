public class SistemaFinanceiro {
    public static void main(String[] args) {
        Cliente clientex = new Cliente();
        clientex.setNome("Fulano");
        clientex.setSobrenome("de Tal");

        ContaCorrente contaCorrente = new ContaCorrente(clientex);
        //System.out.println();
        //System.out.println(contaCorrente.getNumero());
        //System.out.println(contaCorrente.getSaldo());
        //System.out.println(contaCorrente.getTitular().getNome());
        //System.out.println(contaCorrente.getTitular().getSobrenome());

        Conta novaContaCorrente = new ContaCorrente(clientex);
        //System.out.println();
        //System.out.println(novaContaCorrente.getNumero());
        //System.out.println(novaContaCorrente.getSaldo());
        //System.out.println(novaContaCorrente.getTitular().getNome());
        //System.out.println(novaContaCorrente.getTitular().getSobrenome());

        ContaPoupanca contaPoupanca = new ContaPoupanca(clientex);
        //System.out.println();
        //System.out.println(contaPoupanca.getNumero());
        //System.out.println(contaPoupanca.getSaldo());
        //System.out.println(contaPoupanca.getTitular().getNome());
        //System.out.println(contaPoupanca.getTitular().getSobrenome());

        Conta novaContaPoupanca = new ContaPoupanca(clientex);
        //System.out.println();
        //System.out.println(novaContaPoupanca.getNumero());
        //System.out.println(novaContaPoupanca.getSaldo());
        //System.out.println(novaContaPoupanca.getTitular().getNome());
        //System.out.println(novaContaPoupanca.getTitular().getSobrenome());

        CaixaEletronico caixa = new CaixaEletronico();
        //.consultarSaldo(contaCorrente);
        //caixa.consultarSaldo(contaPoupanca);

        ContaEspecial contaEspecial = new ContaEspecial(clientex);

        System.out.println();
        caixa.consultarSaldo(contaCorrente);
        contaCorrente.depositar(1000);
        caixa.consultarSaldo(contaCorrente);
        contaCorrente.sacar(200);
        caixa.consultarSaldo(contaCorrente);

        System.out.println();
        caixa.consultarSaldo(contaPoupanca);
        contaPoupanca.depositar(800);
        caixa.consultarSaldo(contaPoupanca);
        contaPoupanca.sacar(100);
        caixa.consultarSaldo(contaPoupanca);

        System.out.println();
        caixa.consultarSaldo(contaEspecial);
        contaEspecial.depositar(8000);
        caixa.consultarSaldo(contaEspecial);
        contaEspecial.sacar(450);
        caixa.consultarSaldo(contaEspecial);
    }
}
