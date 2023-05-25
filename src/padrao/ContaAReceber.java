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
	public String toString() {
		return "Descrição da conta: [data=" + this.getData() + ", descricao=" + this.getDescricao() + ", banco=" + this.getBanco() + ", cliente=" + this.cliente.getNome()
		+ ", valor=R$" + this.getValor() + ", id=" + this.getId() + "]";
	}

	
}