package padrao;

public abstract class IdentificadorDeConta {

	 public static String identificarConta(Conta conta)
	 {
		 return new String(conta.getTipo());
	 }
}
