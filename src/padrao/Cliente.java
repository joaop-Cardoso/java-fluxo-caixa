package padrao;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Cliente {//Fazer herança depois junto com a classe Fornecedor

	private String nome;
	private String email;
	private String cpf;
	private String codigoCliente = "C" + codigoClienteEstatico;
	private static int codigoClienteEstatico = 1;
	
	Cliente(String nome, String email, String cpf)
	{
	 setNome(nome);
	 setEmail(email); //herança-atributo repetido
	 setCpf(cpf);
	 codigoClienteEstatico ++;
	}
	
	public void setNome(String nome) {

		int naoLetra = 0;
		int espaco = 0;

		char[] vetornome = nome.toCharArray();

		for (int i = 0; i < nome.length(); i++) {
			if (!Character.isLetter(vetornome[i])) {
				naoLetra++;
			} 

			if (Character.isWhitespace(vetornome[i])) {
				espaco++;
			}

			if (Character.isWhitespace(vetornome[i]) && Character.isWhitespace(vetornome[i + 1])) {
				naoLetra++;
			}
		}

		if (naoLetra == espaco) {
			this.nome = nome;
		} else {
			System.out.println("Nome inválido.");
		}

	}
	public void setEmail(String email) {//herança-atributo repetido

		String regex = "^[\\w\\.-]+@([\\w\\-]+\\.)+[A-Z]{1,20}$";
		Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
		Matcher matcher = pattern.matcher(email);
		
		if(matcher.matches())
		{
			this.email = email;
		}
		else
		{
			System.out.println("Email inválido.");
		}
	}
	public void setCpf(String cpf)
	{
		String regex = "\\d{11}";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(cpf);
				
		if(matcher.matches())
		{
			StringBuilder sb = new StringBuilder(cpf);
			sb.insert(sb.length() - 2, '-');
			sb.insert(sb.length() - 6, '.');
			sb.insert(sb.length() - 10, '.');
			this.cpf = sb.toString();
		}
		else
		{
			System.out.println("Cpf inválido.");
		}
	}
	public String getNome()
	{
		return new String(nome);
	}
	
	public String getCodigo() {
		return new String(codigoCliente);
	}
	
	public String getDescricao()//herança com override

	{
		String descricao = "Nome do cliente: " + this.nome + "\nEmail do cliente: " + this.email + 
				"\nCPF do cliente: " + this.cpf;	
		
		return new String(descricao);
	}

}

