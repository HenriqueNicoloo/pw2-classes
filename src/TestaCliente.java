
public class TestaCliente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cliente cliente = new Cliente();
		cliente.codigo = "123456";
		cliente.nome = "Emilly";
		cliente.status = ClienteEnum.ATIVO;
		
		Cartao credito = new Cartao();
		credito.numero = "654321";
		credito.dataValidade = "10-03-2032";
		credito.tipo = ClienteCartao.CREDITO;
	}
}
