package padrao;

import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;


public class RankingClientes {
	
	static private Map<Cliente, CategoriaCliente> ranking;
	static private List<ContaAReceber> historico;
	
	RankingClientes()
	{
		if(ranking == null)
		{
			ranking = new HashMap<Cliente, CategoriaCliente>();
		}
	}
	
	RankingClientes(HistoricoReceber parametrohistorico)
	{
		if(ranking == null)
		{
			ranking = new HashMap<Cliente, CategoriaCliente>();
		}
		historico = new ArrayList<ContaAReceber>(parametrohistorico.getArray());
	}
	
	public void associaClienteCategoria(Cliente cliente)
	{
		if(calculaValorCliente(cliente) > 30000)
		{
			CategoriaCliente categoria1 = new CategoriaCliente('A'); //se de erro e pq ta criano toda hora um categoria diferente 
			ranking.put(cliente, categoria1);
		}
		if(calculaValorCliente(cliente) < 30000 && calculaValorCliente(cliente) > 10000)
		{
			CategoriaCliente categoria2 = new CategoriaCliente('B');
			ranking.put(cliente, categoria2);
		}
		if(calculaValorCliente(cliente) < 10000 && calculaValorCliente(cliente) > 0.001)
		{
			CategoriaCliente categoria3 = new CategoriaCliente('C');
			ranking.put(cliente, categoria3);
		}
	}
	
	public String relatorioRanking()
	{
		String relatorio = "";
		Set<Cliente> lista = ranking.keySet();
		for(Cliente a: lista)
		{
			relatorio = relatorio + "Cliente: " + a.getNome() + " Total de vendas:" + calculaValorCliente(a) + "\n";
		}
		
		return relatorio;
	}
	
	public double calculaValorCliente(Cliente cliente)
	{
		double valor_total = 0;
		List<ContaAReceber> novo = new ArrayList<ContaAReceber>(historico);

		for (int i = 0 ; i<novo.size(); i++)
		{
			if(novo.get(i).getCliente().equals(cliente))
			valor_total = valor_total + novo.get(i).getValor();
		}
		
		return valor_total;
	}
		
	public String consultaCategoriaString(Cliente cliente)
	{
		if(ranking.containsKey(cliente))
		{
			String string = ranking.get(cliente).toString();
			return string;
		}else 
		{
			throw new NullPointerException("Cliente não encontrado");
		}
		
		
	}
	
	
}
