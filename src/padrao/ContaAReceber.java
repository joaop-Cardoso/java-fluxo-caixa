package padrao;

import java.time.LocalDate;

public class ContaAReceber extends Conta{
	
	private Cliente cliente;
	private static int id = 1;
	private static String ano;
	private static String anoAux;
	
	public ContaAReceber(LocalDate data, String descricao, String banco, Cliente cliente, double valor)
	{
		super(data, descricao, banco, valor);
		this.cliente = cliente;
		trocaAno(data);
	}

	private void trocaAno(LocalDate data)
	{
		ano = data.toString().substring(0, 4);//passando a data para string e pegando o valor dos 4 primeiros caracteres
		
		if (ano.equals(anoAux))//O operador == compara a igualdade entre objetos, .equals() compara conteúdo de strings
		{
			id++;
		}
		else 
		{
			id=1;
		}
			anoAux = ano;
	}
	
	public String getId()
	{
		String dataid = ano+"-"+id;
		return dataid;
	}
	
	@Override
	public String getTipo()
	{
		return "Conta a Receber";
	}
	
	public Cliente getCliente()
	{
		if(this.cliente == null)
		{
			throw new NullPointerException("Cliente inexistente!");
		}
		Cliente clienteigual = cliente;
		return clienteigual;					//se de merda o erro ta aqui ou na de cima. clienteigual tem que se IDENTICO a cliente e te os memo valo
	}

	@Override
	public String toString() {
		return "Descrição da conta: [data=" + this.getData() + ", descricao=" + this.getDescricao() + ", banco=" + this.getBanco() + ", cliente=" + this.cliente.getNome()
		+ ", valor=R$" + this.getValor() + ", id=" + this.getId() + "]";
	}

	
}
