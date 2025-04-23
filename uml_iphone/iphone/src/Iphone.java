public class Iphone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical {

    private String musica;

    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para " + numero);
    }

    @Override
    public void atender() {
        System.out.println("Chamada atendida");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciado correio de voz");
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo página " + url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Nova aba adicionada.");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página");
    }

    @Override
    public void tocar() {
        if (musica != null) {
            System.out.println("Tocando: " + musica);
        } else {
            System.out.println("Nenhuma música selecionada.");
        }
    }

    @Override
    public void pausar() {
        if (musica != null) {
            System.out.println("Música pausada.");
        } else {
            System.out.println("Nenhuma música selecionada.");
        }
    }

    @Override
    public String selecionarMusica(String music) {
        this.musica = music;
        System.out.println("Música selecionada: " + music);
        return music;
    }
}
