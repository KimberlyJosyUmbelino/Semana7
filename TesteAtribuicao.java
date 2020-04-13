import javax.swing.JOptionPane;
public class TesteAtribuicao
{
   public static void main(String[]args)
   {
      //Leitura de dados
      String nome = JOptionPane.showInputDialog("Digite o nome do professor: ");
      String sIdade = JOptionPane.showInputDialog("Digite a idade do professor: ");
      
      String nomeDisciplina=JOptionPane.showInputDialog("Digite o nome da disciplina:");
      String tpratica=JOptionPane.showInputDialog("A disciplina tem pratica?Caso sim digite sim, caso contrario não:");
      
      boolean pratica=tpratica.equals("sim");
      //Convertendo dados
      int idade = Integer.parseInt(sIdade);
      //Criar objetos
      Professor professor   = new Professor(nome,idade);
      
      Disciplina disciplina = new Disciplina(nomeDisciplina,pratica);
      
      Atribuicao atribuicao = new Atribuicao(professor,disciplina);
      
      //Alterando os dados
      professor.setNome(nome);
      professor.setIdade(idade);
      
      disciplina.setNomeDisciplina(nomeDisciplina);
      disciplina.setPratica(pratica);
      //Mostre dados
      JOptionPane.showMessageDialog(null,atribuicao.getDados());

   }
}