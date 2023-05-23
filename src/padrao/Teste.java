package padrao;

import java.time.LocalDate;

public class Teste {

	public static void main(String[] args) {
		Cliente c1 = new Cliente("Joãozim", "joaozim@hotmail.com", "11223344556");
		System.out.println(c1.getDescricao());
		
		Fornecedor f1 = new Fornecedor("Empresa Massa 123", "empresamasa123@gmail.com", "12345678901234");
		System.out.println(f1.getDescricao());
		
		ContaAReceber conta1 = new ContaAReceber (LocalDate.of(2000, 05, 22), "Compra de materiais", "Banco do Brasil", c1, 20.5);
		System.out.println(conta1.toString());
		System.out.println("teste de id:" + conta1.getId());
		
		ContaAReceber conta2 = new ContaAReceber (LocalDate.of(2000, 05, 22), "Compra de materiais", "Banco do Brasil", c1, 20.5);
		System.out.println("teste de incremento de id com objeto 2 com data anual igual ao objeto 1:" + conta2.getId());
		
		ContaAReceber conta3 = new ContaAReceber (LocalDate.of(2001, 05, 22), "Compra de materiais", "Banco do Brasil", c1, 20.5);
		System.out.println("teste de reset de id com objeto 3 com data anual diferente aos objetos anteriores:" + conta3.getId());
		
		HistoricoReceber historico = new HistoricoReceber(conta1);
		historico.setContas(conta2);
		
		System.out.println(historico.getInfo(conta1));
		System.out.println("o valo total é:" + historico.calculaValor());
		System.out.println(historico.verificaExistencia(conta2));
		historico.removeConta(conta2);
		System.out.println(historico.verificaExistencia(conta2));
		
		
		
	}

}
