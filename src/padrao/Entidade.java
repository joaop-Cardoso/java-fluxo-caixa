package padrao;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class Entidade {

	private String nome;
	private String email;
	private String sexo;
	
	public Entidade(String nome, String email, String sexo)
	{
		setNome(nome);
		setEmail(email);
		setSexo(sexo);
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
	
	public void setSexo(String sexo)
	{
		if(sexo.contentEquals("m") || sexo.contentEquals("M"))
		{
			this.sexo = sexo;
		}
		else if(sexo.contentEquals("f") || sexo.contentEquals("F"))
		{
			this.sexo = sexo;
		}
		else
		{
			System.out.println("Entrada inválida.");
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
	public String getSexo()
	{
		return new String(sexo);
	}
	
	// abstracts 
	
	public abstract String getCodigo();
	public abstract String getDescricao();
}
