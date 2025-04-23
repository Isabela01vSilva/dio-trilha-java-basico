public class Main {
    public static void main(String[] args) {
        Iphone meuIphone = new Iphone();

        // Testando o Reprodutor Musical
        System.out.println("\n--- Reprodutor Musical ---");
        meuIphone.selecionarMusica("Music - Cantor");
        meuIphone.tocar();
        meuIphone.pausar();

        // Testando o Aparelho Telefônico
        System.out.println("\n--- Aparelho Telefônico ---");
        meuIphone.ligar("11999998888");
        meuIphone.atender();
        meuIphone.iniciarCorreioVoz();

        // Testando o Navegador na Internet
        System.out.println("\n--- Navegador na Internet ---");
        meuIphone.exibirPagina("https://www.apple.com");
        meuIphone.adicionarNovaAba();
        meuIphone.atualizarPagina();
    }
}
