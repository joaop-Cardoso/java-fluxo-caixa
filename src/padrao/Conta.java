package padrao;

import java.time.LocalDate;

public abstract class Conta {
	private LocalDate data;
	private String descricao;
	private String banco;
	private double valor;
	
	public Conta(LocalDate data, String descricao, String banco, double valor)
	{
		this.data = data;
		this.descricao = descricao;
		this.banco = banco;
		setValor(valor);
		
	}
	
	public LocalDate getData()
	{
		LocalDate nova;
		nova = this.data;
		return data;
	}
	
	public String getDescricao()
	{
		return new String(descricao);
	}
	
	public String getBanco()
	{
		return new String(banco);
	}
	
	public double getValor()
	{
		String valor2 = String.valueOf(this.valor);
		double valor3 = Double.parseDouble(valor2);
		return valor3;
	}
	
	public void setValor(double valor) throws AltoValorException
	{
		if(valor >= 10000)
		{
			throw new AltoValorException("Valor muito alto!");
		}
		this.valor = valor;
	}
	
	public abstract String getTipo();

}
