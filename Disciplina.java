public class Disciplina
{
   //Atributos
   private String nomeDisciplina;
   private boolean pratica;
   
   //Construtor
   public Disciplina(String nome,boolean pratica)
   {
      this.nomeDisciplina=nome;
      this.pratica=pratica;
   }
   
   //Metodos de acesso
   public String getNome()
   {
      return nomeDisciplina;
   }
   public boolean getPratica()
   {
      return pratica;
   }
   
   //Metodos modificador
   public void setNomeDisciplina(String nome)
   {
      this.nomeDisciplina=nome;
   }
   public void setPratica(boolean pratica)
   {
      this.pratica=pratica;
   }
   
   //Metodo GetDados
   public String getDados()
   {
      return "\n Nome: " + nomeDisciplina + "\n Pratica " + pratica;
   }
}