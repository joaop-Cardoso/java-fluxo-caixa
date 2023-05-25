package padrao;

import java.time.LocalDate;

public class Teste {

	public static void main(String[] args) {
		
		//----------------teste de Cliente------------------
		Cliente c1 = new Cliente("Joaozinho", "joaozinholegal@gmail.com", "M", "12345678910");
		System.out.println(c1.getDescricao());
		System.out.println("\n");
		//------------------fim de teste--------------------
		
		
		
		//----------------teste de Fornecedor---------------
		Fornecedor f1 = new Fornecedor("Almerinda", "almerindamassa@gmail.com", "F", "12345678910123");
		System.out.println(f1.getDescricao());
		System.out.println("\n");
		//------------------fim de teste--------------------
		
		
		
		//----------------teste de ContaAReceber------------
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
		System.out.println("\n");
		//------------------fim de teste--------------------
		
		
		
		//----------------teste de ContaAPagar--------------
		ContaAPagar contaP1 = new ContaAPagar(LocalDate.of(2000, 05, 22), "compra de insumos", "Santander", f1, 45.80);
		System.out.println(contaP1.toString());
		
		//{teste do incremento do id de ContaAReceber com novo objeto de ano igual}
		Fornecedor f2 = new Fornecedor("Almerinda Dois", "almerindamassa2@gmail.com","F","22345678910123" );
		ContaAPagar contaP2 = new ContaAPagar(LocalDate.of(2000, 04, 03), "compra de insumos", "Banco do Brasil", f2, 42.80);
		System.out.println("id: " + contaP2.getId());
				
		//{teste da reinicialização do id de ContaAReceber com novo objeto de ano diferente}
		Fornecedor f3 = new Fornecedor("Almerinda Dois", "almerindamassa2@gmail.com","F","32345678910123" );
		ContaAPagar contaP3 = new ContaAPagar(LocalDate.of(2001, 11, 29), "compra de insumos", "Banco do Brasil", f3, 44.80);
		System.out.println("id: " + contaP3.getId());
		System.out.println("\n");
		//------------------fim de teste--------------------

		
		
		//----------------teste de HistoricoReceber---------
		HistoricoReceber hR = new HistoricoReceber(conta1);//<teste de construtor
		
		//----------------teste de calculo de valores-------
		System.out.println(hR.calculaValor());
		hR.setContas(conta2);//<teste de adição
		System.out.println(hR.calculaValor());
		
		//----------------teste de existencia---------------
		System.out.println(hR.verificaExistencia(conta2));
		hR.removeConta(conta2);//<teste de remoção
		System.out.println(hR.verificaExistencia(conta2));
		
		//----------------teste de adição-------------------
		hR.setContas(conta3);
		System.out.println(hR.verificaExistencia(conta3));
		System.out.println("\n");
		//------------------fim de teste--------------------
		
		
		
		//----------------teste de HistoricoPagar---------
		HistoricoPagar hP = new HistoricoPagar(contaP1);//<teste de construtor
		
		//----------------teste de calculo de valores-------
		System.out.println(hP.calculaValor());
		hP.setContas(contaP2);//<teste de adição
		System.out.println(hP.calculaValor());
		
		//----------------teste de existencia---------------
		System.out.println(hP.verificaExistencia(contaP2));
		hP.removeConta(contaP2);//<teste de remoção
		System.out.println(hP.verificaExistencia(contaP2));
		
		//----------------teste de adição-------------------
		hP.setContas(contaP3);
		System.out.println(hP.verificaExistencia(contaP3));
		System.out.println("\n");
		//------------------fim de teste--------------------
		
	
		
		//---------teste IdentificadorDeConta---------------
		Conta nova = new ContaAReceber(LocalDate.of(2015, 12, 29), "compra fictícia", "Bradesco", c1, 340.99);
		System.out.println(IdentificadorDeConta.identificarConta(nova));
		Conta novanova = new ContaAPagar(LocalDate.of(2017, 9, 03), "compra fictícia", "Nubank", f1, 7200.65);
		System.out.println(IdentificadorDeConta.identificarConta(novanova));
	}
	
}

