package musical.reproducao;

import musical.interfaces.Pausar;
import musical.interfaces.SelecionarMusica;
import musical.interfaces.Tocar;

public class ReprodutorMusical implements Pausar,Tocar, SelecionarMusica{
  
  public void tocar(){
    System.out.println("Tocando música");
  }
  
  public void pausar(){
    System.out.println("Pausando música");
  }

  public void selecionarMusica(){
    System.out.println("Selecionando música");
  }
}
