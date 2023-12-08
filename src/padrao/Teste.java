package padrao;

import java.time.LocalDate;

public class Teste {

	public static void main(String[] args) {
		//Professor, pra facilitar seu trabalho reuní todos os testes aqui! Para testar um bloco é só remover os /* */ que estão mais à esquerda
		//e por dentro de cada bloco de propósito. Cada teste tem dentro de seu bloco tudo o que é necessário, é realmente só remover os /* */.

//>>>>>>Parte 1:		
		
	
		//--------teste de Cliente e Fornecedor-------------
	
		Cliente c1 = new Cliente("Joaozinho", "joaozinholegal@gmail.com", "M", "12345678910");
		System.out.println(c1.getDescricao());
		
		System.out.println("\n");
		
		Fornecedor f1 = new Fornecedor("Almerinda", "almerindamassa@gmail.com", "F", "12345678910123");
		System.out.println(f1.getDescricao());
	
		//------------------fim de teste--------------------

		
		
//>>>>>>Parte 2:
		
		
		
		//-------teste de ContaAReceber toString()----------
	/*
		Cliente c1 = new Cliente("Joaozinho", "joaozinholegal@gmail.com", "M", "12345678910");
		ContaAReceber conta1 = new ContaAReceber(LocalDate.of(2010, 05, 22), "compra de materiais", "Banco do Brasil", c1, 20.45);
		System.out.println(conta1.toString());
		
		//{teste do incremento do id de ContaAReceber com novo objeto de ano igual}
		Cliente c2 = new Cliente("Joaozinho Dois", "joaozinholegal2@gmail.com", "M","22345678910" );
		ContaAReceber conta2 = new ContaAReceber(LocalDate.of(2010, 03, 16), "compra de materiais", "Banco do Brasil", c2, 10.45);
		System.out.println("id: " + conta2.getId());
		
		//{teste da reinicialização do id de ContaAReceber com novo objeto de ano diferente}
		Cliente c3 = new Cliente("Joaozinho Três", "joaozinholegal3@gmail.com","M","32345678910" );
		ContaAReceber conta3 = new ContaAReceber(LocalDate.of(2011, 03, 16), "compra de materiais", "Banco do Brasil", c3, 14.45);
		System.out.println("id: " + conta3.getId());
	*/
		//------------------fim de teste--------------------
		
		///-------teste de ContaAPagar toString()-----------
	/*
		Fornecedor f1 = new Fornecedor("Almerinda", "almerindamassa@gmail.com", "F", "12345678910123");
		ContaAPagar contaP1 = new ContaAPagar(LocalDate.of(2000, 05, 22), "compra de insumos", "Santander", f1, 45.80);
		System.out.println(contaP1.toString());
		
		//{teste do incremento do id de ContaAReceber com novo objeto de ano igual}
		Fornecedor f2 = new Fornecedor("Calos Legal", "carloslegal@gmail.com","M","22345678910123" );
		ContaAPagar contaP2 = new ContaAPagar(LocalDate.of(2000, 04, 03), "compra de insumos", "Banco do Brasil", f2, 42.80);
		System.out.println("id: " + contaP2.getId());
				
		//{teste da reinicialização do id de ContaAReceber com novo objeto de ano diferente}
		Fornecedor f3 = new Fornecedor("Vanessão Manerão", "almerindamassa2@gmail.com","F","32345678910123" );
		ContaAPagar contaP3 = new ContaAPagar(LocalDate.of(2001, 11, 29), "compra de insumos", "Banco do Brasil", f3, 94.30);
		System.out.println("id: " + contaP3.getId());
		System.out.println("\n");
	*/
		//------------------fim de teste--------------------
		
		//----------------teste de HistoricoReceber---------
	/*
		Cliente c1 = new Cliente("Joaozinho", "joaozinholegal@gmail.com", "M", "12345678910");
		ContaAReceber conta1 = new ContaAReceber(LocalDate.of(2010, 05, 22), "compra de materiais", "Banco do Brasil", c1, 20.45);
		HistoricoReceber hR = new HistoricoReceber(conta1);//<teste de construtor
		
		//{teste de informaçoes pertinentes}
		System.out.println("Teste de informaçoes pertinentes:\n");
		System.out.println(hR.getInfo(conta1) + "\n");
		
		//{teste de calculo de valores}
		System.out.println("Teste de cálculo de valores:\n");
		Cliente c2 = new Cliente("Joaozinho Dois", "joaozinholegal@gmail.com", "M", "12345678910");
		ContaAReceber conta2 = new ContaAReceber(LocalDate.of(2010, 05, 22), "compra de materiais", "Banco do Brasil", c2, 23.45);
		hR.setContas(conta2);
		System.out.println(hR.calculaValor());
	*/
		//------------------fim de teste--------------------
		 
		//----------------teste de HistoricoPagar---------
	/*
		Fornecedor f1 = new Fornecedor("Almerinda", "almerindamassa@gmail.com", "F", "12345678910123");
		ContaAPagar conta1 = new ContaAPagar(LocalDate.of(2010, 05, 22), "compra de materiais", "Banco do Brasil", f1, 20.45);
		HistoricoPagar hP = new HistoricoPagar(conta1);//<teste de construtor
		
		//{teste de informaçoes pertinentes}
		System.out.println("Teste de informaçoes pertinentes:\n");
		System.out.println(hP.getInfo(conta1) + "\n");
		
		//{teste de calculo de valores}
		System.out.println("Teste de cálculo de valores:\n");
		Fornecedor f2 = new Fornecedor("Almerinda Dois", "almerindamassa2@gmail.com", "M", "12345678910123");
		ContaAPagar conta2 = new ContaAPagar(LocalDate.of(2010, 05, 22), "compra de materiais", "Banco do Brasil", f2, 23.45);
		hP.setContas(conta2);
		System.out.println(hP.calculaValor());
	*/
		//------------------fim de teste--------------------
		
		
		
//>>>>>>Parte 3:		
		
		
	
		//-------HistoricoReceber testes--------------------
	/*
	 	//{teste de existência}
		Cliente c1 = new Cliente("Joaozinho", "joaozinholegal@gmail.com", "M", "12345678910");
		ContaAReceber conta1 = new ContaAReceber(LocalDate.of(2010, 05, 22), "compra de materiais", "Banco do Brasil", c1, 20.45);
		HistoricoReceber hR = new HistoricoReceber(conta1);
		
		System.out.println("Teste de existência:" );
		System.out.println(hR.verificaExistencia(conta1));
		
		//{teste de remoção}
		System.out.println("\nTeste de remoção(se falso é que a conta foi removida):" );
		hR.removeConta(conta1);//
		System.out.println(hR.verificaExistencia(conta1));
		
		//{teste de adição}
		System.out.println("\nTeste de adição:" );
		hR.setContas(conta1);
		System.out.println(hR.verificaExistencia(conta1));
		System.out.println("\n");
	*/
		//------------------fim de teste--------------------
		
		//-------HistoricoPagar testes--------------------
	/*
	 	//{teste de existência}
		Fornecedor f1 = new Fornecedor("Almerinda", "almerindamassa@gmail.com", "F", "12345678910123");
		ContaAPagar conta1 = new ContaAPagar(LocalDate.of(2010, 05, 22), "compra de materiais", "Banco do Brasil", f1, 20.45);
		HistoricoPagar hP = new HistoricoPagar(conta1);
			
		System.out.println("Teste de existência:" );
		System.out.println(hP.verificaExistencia(conta1));
			
		//{teste de remoção}
		System.out.println("\nTeste de remoção(se falso é que a conta foi removida):" );
		hP.removeConta(conta1);//
		System.out.println(hP.verificaExistencia(conta1));
			
		//{teste de adição}
		System.out.println("\nTeste de adição:" );
		hP.setContas(conta1);
		System.out.println(hP.verificaExistencia(conta1));
		System.out.println("\n");
	/*
		//------------------fim de teste--------------------


	
//>>>>>>Parte 4:
 
 
 
		//---------teste forma de tratamento----------------
	/*
		Cliente c1 = new Cliente("Joaozinho", "joaozinholegal@gmail.com", "M", "12345678910");
		System.out.println("Tratamento: " + c1.getTitulo(c1));
		System.out.println(c1.getDescricao());
		
		System.out.println("\n");
		
		Fornecedor f1 = new Fornecedor("Almerinda", "almerindamassa@gmail.com", "F", "12345678910123");
		System.out.println("Tratamento: " + f1.getTitulo(f1));
		System.out.println(f1.getDescricao());
	*/
		//------------------fim de teste--------------------
		
		//---------teste IdentificadorDeConta---------------
	/*
		Cliente c1 = new Cliente("Joaozinho", "joaozinholegal@gmail.com", "M", "12345678910");
		Conta nova = new ContaAReceber(LocalDate.of(2015, 12, 29), "compra fictícia", "Bradesco", c1, 340.99);
		System.out.println(IdentificadorDeConta.identificarConta(nova));
		
		Fornecedor f1 = new Fornecedor("Almerinda", "almerindamassa@gmail.com", "F", "12345678910123");
		Conta novanova = new ContaAPagar(LocalDate.of(2018, 9, 03), "compra fictícia", "Nubank", f1, 7200.65);
		System.out.println(IdentificadorDeConta.identificarConta(novanova));
	*/
		//------------------fim de teste--------------------
	
		
		
//>>>>>>Parte 5:
		
		
		
		//---------teste ocorrencia de excessão---------------
	/*
		Fornecedor fornecedor = new Fornecedor("Almerinda", "almerindamassa@gmail.com", "F", "12345678910123");
		ContaAPagar conta1 = new ContaAPagar(LocalDate.of(2023, 06, 27), "compra de 2kg de carne", "Banco do Brasil", fornecedor, 42000.80);
	*/
		//------------------fim de teste--------------------
		
		//---------teste tratamento de excessão---------------
	/*
		try {
		Fornecedor fornecedor = new Fornecedor("Almerinda", "almerindamassa@gmail.com", "F", "12345678910123");
		ContaAPagar conta2 = new ContaAPagar(LocalDate.of(2023, 06, 27), "compra de 2kg de carne", "Banco do Brasil", fornecedor, 42000.80);
		}
		catch(AltoValorException erro)
		{
			System.out.println("\nValor muito alto. Não foi cadastrado no sistema, favor olhar novamente.");
		}
	*/
		//------------------fim de teste--------------------
		
		
		//---------teste relatorios ArrayList---------------
	/*
		Fornecedor almerinda = new Fornecedor("Almerinda", "almerindamassa@gmail.com", "F", "12345678910123");
		Fornecedor lucas = new Fornecedor("Lucas", "lucasaleatorio@gmail.com", "M", "12345678910123");
		Fornecedor jose = new Fornecedor("José", "josesacana@gmail.com", "M", "12345678910123");
		
		ContaAPagar contalucas = new ContaAPagar(LocalDate.of(2021, 06, 27), "Compra de 100g de carne no Brasil", "Banco do Brasil", lucas, 999.80);
		ContaAPagar contajose = new ContaAPagar(LocalDate.of(2021, 06, 27), "Compra de desodorante", "Banco do Brasil", jose, 10.20);
		ContaAPagar contaalmerinda = new ContaAPagar(LocalDate.of(2021, 06, 27), "Compra de cadeira", "Itaú", almerinda, 200.40);
		
		HistoricoPagar hP = new HistoricoPagar(contalucas, contajose, contaalmerinda);

		System.out.println("Relatorio em função do nome de forma decrescente:\n" + hP.RelacaoDecrescenteNome());
		System.out.println("\n");
		System.out.println("Relatorio em função do valor de forma crescente:\n" + hP.RelacaoCrescenteValor());
	*/
		//------------------fim de teste--------------------

		
		
//>>>>>>Parte 6:
		
		
		
		//---------teste ranking clientes-------------------
	/*	
		Cliente jose = new Cliente("José", "jose@hotmail.com", "M", "11592865636");
		Cliente marcio = new Cliente("Marcio", "marcio@hotmail.com", "M", "11792865166");
		Cliente ana = new Cliente("Ana", "ana@hotmail.com", "F", "11792365766");
		
		ContaAReceber venda1jose = new ContaAReceber(LocalDate.of(2015, 12, 29), "compra ficticia", "Bradesco", jose, 340.99);
		ContaAReceber venda1marcio = new ContaAReceber(LocalDate.of(2019, 12, 29), "ccompra ficticia", "Bradesco", marcio, 9999.99);
		ContaAReceber venda2marcio = new ContaAReceber(LocalDate.of(2019, 12, 29), "compra ficticia", "Bradesco", marcio, 9999.99);
		ContaAReceber venda1ana = new ContaAReceber(LocalDate.of(2019, 12, 29), "compra ficticia", "Bradesco", ana, 9999.99);
		ContaAReceber venda2ana = new ContaAReceber(LocalDate.of(2019, 12, 29), "compra ficticia", "Bradesco", ana, 9999.99);
		ContaAReceber venda3ana = new ContaAReceber(LocalDate.of(2019, 12, 29), "compra ficticia", "Bradesco", ana, 9999.99);
		ContaAReceber venda4ana = new ContaAReceber(LocalDate.of(2019, 12, 29), "compra ficticia", "Bradesco", ana, 9999.99);
	
		HistoricoReceber historico = new HistoricoReceber(venda1jose, venda1marcio, venda2marcio, venda1ana, venda2ana, venda3ana, venda4ana);
		RankingClientes ranking = new RankingClientes(historico);
		
		ranking.associaClienteCategoria(jose); //método de inclusão
		ranking.associaClienteCategoria(marcio);
		ranking.associaClienteCategoria(ana);
		
		System.out.println("Cliente " + jose.getNome() + "| Categoria: " + ranking.consultaCategoriaString(jose)); //método de leitura
		System.out.println("Cliente " + marcio.getNome() + "| Categoria: " + ranking.consultaCategoriaString(marcio));
		System.out.println("Cliente " + ana.getNome() + "| Categoria: " + ranking.consultaCategoriaString(ana) + "\n");
	
		//------------------fim de teste--------------------
		
		//--------------teste métodos ranking---------------
		
		System.out.println(ranking.relatorioRanking()); //método de leitura
		System.out.println(ranking.calculaValorCliente(ana));
	*/
		//------------------fim de teste--------------------
	
		
		
//>>>>>>Parte 7:
		
		
		
		//---------teste lista generica-------------------
	/*
		Cliente jose = new Cliente ("José", "jose@hotmail.com", "M", "11592865636");
		 
		Cliente josias = new Cliente ("Josias", "josias@hotmail.com", "M", "11599385636");
		
		ListaGenerica <Cliente> listaCliente = new ListaGenerica<Cliente>(jose); //testando com o tipo Cliente
		
		listaCliente.add(josias);  //testando metodo add
		listaCliente.add(new Cliente ("Maria", "maria@hotmail.com", "F", "12392865636")); 
		listaCliente.add(new Cliente ("Abel", "abel@hotmail.com", "M", "32392865636"));
		
		for(int i = 0; i<listaCliente.size(); i++) //testando metodo size
		{
			System.out.println(listaCliente.get(i).getNome()); //testando metodo get
		}
		System.out.println("\n");
		
		
		
		
		
		
		
		
		Fornecedor f1 = new Fornecedor("Almerinda", "almerindamassa@gmail.com", "F", "12345678910123"); //testando outra lista com tipo Fornecedor
		
		ListaGenerica <Fornecedor> listaFornecedor = new ListaGenerica<Fornecedor>(f1);
		
		listaFornecedor.add(new Fornecedor("Thiago", "thiago@gmail.com", "M", "12345678910123"));
		listaFornecedor.add(new Fornecedor("Rita", "rita@gmail.com", "F", "12345678910123"));
		
		for(int i = 0; i<listaFornecedor.size(); i++) //testando metodo size
		{
			System.out.println(listaFornecedor.get(i).getNome()); //testando metodo get
		}
		
		System.out.println("\n");
		
		System.out.println(listaFornecedor.contains(f1)); //testando metodo contains
		
		listaFornecedor.remove(f1); //testando metodo remove passando objeto
		System.out.println("\n");
		
		for(int i = 0; i<listaFornecedor.size(); i++) 
		{
			System.out.println(listaFornecedor.get(i).getNome()); //pode ver que f1 (almerinda) foi removida
		}
		System.out.println("\n");
		
		listaFornecedor.remove(0); //testando metodo remove passando índice
		for(int i = 0; i<listaFornecedor.size(); i++) 
		{
			System.out.println(listaFornecedor.get(i).getNome()); 
		}
	*/
		
	}
}



