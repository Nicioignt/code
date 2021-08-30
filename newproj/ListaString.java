import javax.swing.JOptionPane;


public class Main

{

    int q;

  public static void main(String[] args) {

      Main m = new Main();

      m.nom();

  }

  public void nom(){

    String j = "itens\n";

    String produto;

    int q = Integer.parseInt(JOptionPane.showInputDialog(null, "Quantos itens você quer cadastrar?"));

    String[] palavras = new String[q];

  for(int i = 0; i<q; i++){

    palavras[i] = JOptionPane.showInputDialog(null, "Digite o "+(i+1)+"º item" );

          j = j +"\n"+ palavras[i];

    JOptionPane.showMessageDialog(null, j);

  produto = JOptionPane.showInputDialog(null, "Qual produto quer encontrar?");

         if(produto.equals(palavras[i])){

JOptionPane.showMessageDialog(null, "Item encontrado!" );

      }else{

JOptionPane.showMessageDialog(null, "Item não encontrado!" );

  }

  


  }

}

}
