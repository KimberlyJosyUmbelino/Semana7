public class Atribuicao
{
   //Atributos
   private Professor professor;
   private Disciplina disciplina;
   
   //Construtor
   public Atribuicao(Professor professor,Disciplina disciplina)
   {
      this.professor=professor;
      this.disciplina=disciplina;
   }
   //Metodo de acesso
   public Professor getprofessor()
   {
      return professor;
   }
   public Disciplina getdisciplina()
   {
      return disciplina;
   }
   //Metodo modificador
   public void setProfessor(Professor professor)
   {
      this.professor=professor;
   }
   public void setDisciplina(Disciplina disciplina)
   {
      this.disciplina=disciplina;
   }
   //Metodo GetDados
   public String getDados()
   {
     return "Professor: "+professor.getDados()+""+disciplina.getDados();
   }
}