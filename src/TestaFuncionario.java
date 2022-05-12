
public class TestaFuncionario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Aluno aluno = new Aluno();
		aluno.nome = "Josevaldo";
		aluno.rg = "125478965";
		aluno.dataNascimento = "12-06-2010";
		
		System.out.println(aluno.nome + " " + aluno.rg + " " + aluno.dataNascimento);
		
		Endereco funcionario = new Endereco();
		funcionario.bairro = "Vila Augusta";
		funcionario.cidade = "Guarulhos";
		funcionario.estado = "Maldivas";
		funcionario.número = "552175";
		funcionario.logradouro = "Nº 60";
		
		System.out.println(funcionario.bairro + ", " + funcionario.cidade + ", " + funcionario.estado + ", " + funcionario.número + ", " + funcionario.logradouro);
	}

}
