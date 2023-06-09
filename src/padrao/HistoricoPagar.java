package padrao;

import java.util.ArrayList;

public class HistoricoPagar implements Historico{
	
	static ArrayList<ContaAPagar> listaContas;


	public HistoricoPagar()
	{
		if (listaContas == null)
		{
			listaContas = new ArrayList<ContaAPagar>();
		}
	}
	
	public HistoricoPagar(ContaAPagar ...objetos)//construtor podendo já passar objetos
	{
		if (listaContas == null)
		{
			listaContas = new ArrayList<ContaAPagar>();
		}
		for (int i = 0; i<objetos.length; i++) 
		{
		listaContas.add(objetos[i]);
		}
	}	
	
	public void setContas(ContaAPagar ... contas){
		for (int i = 0; i<contas.length; i++) 
		{
			listaContas.add(contas[i]);
		}
	}

	public String getInfo(ContaAPagar conta)
		{
           return conta.toString();
		}

	@Override
	public double calculaValor()
	{	
		double valor_total = 0;
		ContaAPagar momentaneo;
		for (int i = 0; i<listaContas.size(); i++) 
		{
			momentaneo = listaContas.get(i);
			valor_total= valor_total + momentaneo.getValor();
		}
		momentaneo = null;
		return valor_total;
	}

	public boolean verificaExistencia(ContaAPagar conta)
	{
		if(listaContas.contains(conta))
		{
			return true;
		}
			return false;
	}

	public void removeConta(ContaAPagar conta)
	{	
		if(listaContas.contains(conta))
		{
		listaContas.remove(conta);
		}else {
		System.out.println("Objeto não encontrado na lista.");
		}
	}

}
