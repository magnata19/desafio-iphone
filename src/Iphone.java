
// métodos para pausar, tocar e selecionar músicas.
import musical.interfaces.Pausar;
import musical.interfaces.Tocar;
import musical.interfaces.SelecionarMusica;
import musical.reproducao.ReprodutorMusical;

// métodos do telefone
import telefone.interfaces.Atender;
import telefone.interfaces.Ligar;
import telefone.interfaces.IniciarCorreioDeVoz;
import telefone.aparelho.AparelhoTelefonico;

// métodos para se conectar na internet
import internet.interfaces.AdicionarNovaAba;
import internet.interfaces.AtualizarPagina;
import internet.interfaces.ExibirPagina;
import internet.interfaces.navegador.NavegadorInternet;

public class Iphone {
    public static void main(String[] args) {
        // métodos para pausar, tocar e selecionar músicas.
        Pausar pausar = new ReprodutorMusical();
        Tocar tocar = new ReprodutorMusical();
        SelecionarMusica selecionarMusica = new ReprodutorMusical();

        // métodos do telefone
        Atender atender = new AparelhoTelefonico();
        Ligar ligar = new AparelhoTelefonico();
        IniciarCorreioDeVoz iniciarCorreioDeVoz = new AparelhoTelefonico();

        // métodos para se conectar na internet
        AdicionarNovaAba adicionarNovaAba = new NavegadorInternet();
        AtualizarPagina atualizarPagina = new NavegadorInternet();
        ExibirPagina exibirPagina = new NavegadorInternet();
    }
}
