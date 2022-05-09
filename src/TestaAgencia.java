
public class TestaAgencia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AgenciaBanco agencia = new AgenciaBanco();
		agencia.numero = "1234";
		
		ContasBanco contas = new ContasBanco();
		contas.agencia = agencia;
		contas.limite = "5";
		contas.numero = "1234567";
		contas.saldo = "5.000";
	}

}
