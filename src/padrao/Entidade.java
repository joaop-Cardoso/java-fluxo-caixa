package padrao;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class Entidade {

	private String nome;
	private String email;
	
	public Entidade(String nome, String email)
	{
		setNome(nome);
		setEmail(email);
	}
	
	//setters
	
	public void setNome(String nome) 
	{
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
	
	public void setEmail(String email) {

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


	//getters
	
	public String getNome()
	{
		return new String(nome);
	}
	public String getEmail()
	{
		return new String(email);
	}
	
	// abstracts 
	
	public abstract String getCodigo();
	public abstract String getDescricao();
}
