package padrao;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class HistoricoPagar implements Historico{
	
	static private List<ContaAPagar> listaContas;

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
	
	private String relacao(ArrayList<ContaAPagar> a)
	{
		String relatorio = "";
		for(int i = 0; i<a.size(); i++)
		{
			relatorio = relatorio + "\n" + "Nome do fornecedor: " + a.get(i).getFornecedorNome()  + ", Valor a ser pago: R$"+ a.get(i).getValor();
		}
		return relatorio;
	}
	
	public String RelacaoDecrescenteNome()
	{	
		ArrayList<ContaAPagar> cloneListaContas = new ArrayList<ContaAPagar>(listaContas);
		
		Collections.sort(cloneListaContas, Comparator.comparing(ContaAPagar::getFornecedorNome).reversed());
		
		return relacao(cloneListaContas);
	}
	
	public String RelacaoCrescenteValor()
	{
		ArrayList<ContaAPagar> cloneListaContas = new ArrayList<ContaAPagar>(listaContas);
		
		Collections.sort(cloneListaContas, Comparator.comparing(ContaAPagar::getValor));
		
		return relacao(cloneListaContas);
	}
	
}
