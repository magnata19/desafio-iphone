package internet.interfaces.navegador;

import internet.interfaces.AdicionarNovaAba;
import internet.interfaces.AtualizarPagina;
import internet.interfaces.ExibirPagina;

public class NavegadorInternet implements AdicionarNovaAba, AtualizarPagina, ExibirPagina {
  
  public void adicionarNovaAba(){
    System.out.println("Adicionando nova aba no navegador");
  }

  public void atualizarPagina() {
    System.out.println("Atualizando página no navegador");
  }

  public void exibirPagina() {
    System.out.println("Exibindo página no navegador");

  }
}
