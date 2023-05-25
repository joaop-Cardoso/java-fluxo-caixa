package padrao;

public abstract class IdentificadorDeConta {

	 public static String identificarConta(Conta conta)
	 {
	        if (conta instanceof ContaAReceber) 
	        {
	            return "Conta a receber";
	        } else if (conta instanceof ContaAPagar) 
	        {
	            return "Conta a pagar";
	        } else 
	        {
	            return "Outro tipo de conta";
	        }
	    }
}
