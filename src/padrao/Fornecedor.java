package padrao;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Fornecedor extends Entidade{
	
	private String cnpj;
	private static int codigo= 0;
	
	public Fornecedor(String nome, String email, String cnpj)
	{
		super(nome, email);
		setCnpj(cnpj);
		codigo++;
	}
	
	//setters
	
	public void setCnpj(String cnpj)
	{
		String regex = "[0-9]{14}";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(cnpj);
				
		if(matcher.matches())
		{
			StringBuilder sb = new StringBuilder(cnpj);
			sb.insert(sb.length() - 2, '-');
			sb.insert(sb.length() - 7, '/');
			sb.insert(sb.length() - 11, '.');
			sb.insert(sb.length() - 15, '.');
			this.cnpj = sb.toString();
		}
		else
		{
			System.out.println("Cnpj inválido.");
		}
	}

	//getters
	
	public String getDescricao()

	{
		String descricao = "Nome do fornecedor: " + this.getNome() + "\nEmail do fornecedor: " + this.getEmail() + 
				"\nCNPJ do fornecedor: " + this.cnpj + "\nCódigo do fornecedor: " + this.getCodigo();	
		
		return new String(descricao);
	}
	public String getCodigo() {
		String codigoFormatado = "F" + codigo;
		return codigoFormatado;
	}
}
