package padrao;

import java.time.LocalDate;

public class ContaAReceber {//herança total com ContaAPagar, tudo duplicado
	
	private LocalDate data;
	private String descricao;
	private String banco;
	private Cliente cliente;
	private double valor;
	private static int id = 1;
	private static String ano; //atributo necessário para a troca do id
	private static String anoAux; //atributo necessário para a troca do id

	ContaAReceber(LocalDate data, String descricao, String banco, Cliente cliente, double valor){//passar data com LocalDate.of(ano, mês, dia)				
		this.data = data;
		this.descricao = descricao;
		this.banco = banco;
		this.cliente = cliente;
		this.valor = valor;
		trocaAno(data);
	}
	
	public void setData(LocalDate data) {
		this.data = data;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public void setBanco(String banco) {
		this.banco = banco;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
	
	private void trocaAno(LocalDate data)
	{
		ano = data.toString().substring(0, 4);
		
		if (ano.equals(anoAux))//em Java, o operador == compara a igualdade entre objetos, .equals() compara conteúdo de strings
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
		return String.valueOf(id);
	}
	
	public double getValor()
	{
		String valor2 = String.valueOf(this.valor);
		double valor3 = Double.parseDouble(valor2);
		return valor3;
	}
	
	@Override
	public String toString() {
		return "ContaAReceber [data=" + data + ", descricao=" + descricao + ", banco=" + banco + ", cliente=" + cliente.getNome()
				+ ", valor=R$" + valor + "]";
	}
	
	
	
}