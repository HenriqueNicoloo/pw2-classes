
public class TestaAluno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Aluno referencia = new Aluno();
		referencia.nome = "Henrique";
		referencia.rg = "123456789";
		referencia.dataNascimento = "17-05-2005";
		
		Aluno referencia2 = new Aluno();
		referencia2.nome = "Emilly";
		referencia2.rg = "987654321";
		referencia2.dataNascimento = "10-03-2005";
		
		System.out.println(referencia.nome + " " + referencia.rg + " " + referencia.dataNascimento);
		System.out.println(referencia2.nome + " " + referencia2.rg + " " + referencia2.dataNascimento);
		
		
		Turma aluno = new Turma();
		aluno.periodo = "Manhã";
		aluno.serie = "Segundo ano de informática";
		aluno.sigla = "2ºAI";
		aluno.tipo = "Ensino médio";
		
		System.out.println(aluno.periodo + ", " + aluno.serie + ", " + aluno.sigla + ", " + aluno.tipo);
	}

}
