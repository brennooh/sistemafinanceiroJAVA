public class SistemaFinanceiro {
    public static void main(String[] args) {

        Cliente destinatario = new Cliente();
        destinatario.setNome("DIJSHIJS");
        destinatario.setSobrenome("hsuodfhds");
        Conta contaDestino = new ContaCorrente(destinatario);

        CaixaEletronico caixaEletronico = new CaixaEletronico();
        caixaEletronico.autenticar("2");
        caixaEletronico.exibirSaldo();
        caixaEletronico.efetuarDeposito(1000);
        caixaEletronico.efetuarSaque(100);
        caixaEletronico.efetuarTransfer(contaDestino, 30);
        caixaEletronico.encerrarUso();

    }
}
