public class Professor
{
   //Aributos
   private String nome;
   private int idade;
   
   //Construtor 
   public Professor(String nome,int idade)
   {
      this.nome=nome;
      this.idade=idade;
   }
   //Metodos de acesso
   public String getNome() 
   {
      return nome;
   }
   public int getIdade() 
   {
      return idade;
   }
   //Metodos de modificação
   public void setNome(String nome)
   {
     this.nome=nome;
   }
   public void setIdade(int idade)
   {
      this.idade=idade;
   }
   //Metodo GetDados
   public String getDados() 
   {
   return "\n Nome do Professor: " + nome + "\n Idade" + idade;
   }   
}