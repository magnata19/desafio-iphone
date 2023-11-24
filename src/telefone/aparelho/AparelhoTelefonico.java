package telefone.aparelho;

import telefone.interfaces.Atender;
import telefone.interfaces.IniciarCorreioDeVoz;
import telefone.interfaces.Ligar;

public class AparelhoTelefonico implements Atender, Ligar, IniciarCorreioDeVoz {

  public void atender() {
    System.out.println("Atendendo o telefone");
  }

  public void ligar() {
    System.out.println("Fazendo uma ligação");
  }

  public void iniciarCorreioDeVoz() {

    System.out.println("Deixar mensagem no correio de voz.");
  }

}
