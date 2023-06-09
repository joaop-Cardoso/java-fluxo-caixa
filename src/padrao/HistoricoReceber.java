package padrao;

import java.util.List;
import java.util.ArrayList;

public class HistoricoReceber implements Historico{
	
	private List<ContaAReceber> listaContas;

	public HistoricoReceber()
	{
		if (listaContas == null)
		{
			listaContas = new ArrayList<ContaAReceber>();
		}
	}
	
	public HistoricoReceber(ContaAReceber ...objetos)//construtor podendo já passar objetos
	{
		if (listaContas == null)
		{
			listaContas = new ArrayList<ContaAReceber>();
		}
		for (int i = 0; i<objetos.length; i++) 
		{
		listaContas.add(objetos[i]);
		}
	}	
	
	public void setContas(ContaAReceber ... contas){
		for (int i = 0; i<contas.length; i++) 
		{
			listaContas.add(contas[i]);
		}
	}

	public String getInfo(ContaAReceber conta)
		{
		  return conta.toString();
		}

	public ArrayList<ContaAReceber> getArray()
	{
		ArrayList<ContaAReceber> novo = new ArrayList<ContaAReceber>(listaContas);
		return novo;
	}
	
	@Override
	public double calculaValor()
	{	
		double valor_total = 0;
		ContaAReceber momentaneo;
		for (int i = 0; i<listaContas.size(); i++) 
		{
			momentaneo = listaContas.get(i);
			valor_total= valor_total + momentaneo.getValor();
		}
		momentaneo = null;
		return valor_total;
	}

	public boolean verificaExistencia(ContaAReceber conta)
	{
		if(listaContas.contains(conta))
		{
			return true;
		}
			return false;
	}

	public void removeConta(ContaAReceber conta)
	{	
		if(listaContas.contains(conta))
		{
		listaContas.remove(conta);
		}else{
		throw new NullPointerException("Objeto não encontrado na lista.");
		}
	}

}
