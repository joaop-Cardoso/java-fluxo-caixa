package padrao;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Fornecedor extends Entidade{
	
	private String cnpj;
	private static int codigo= 0;
	private String codigoFornecedor;
	
	public Fornecedor(String nome, String email, String sexo, String cnpj)
	{
		super(nome, email, sexo);
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
	
	public String getTitulo(Fornecedor fornecedor)
	{
		String titulo = new String();
		
		if(fornecedor.getSexo().equals("m") || fornecedor.getSexo().equals("M"))
		{
			titulo = "Prezado Senhor Fornecedor";
		}
		else if(fornecedor.getSexo().equals("f")|| fornecedor.getSexo().equals("F"))
		{
			titulo = "Prezada Senhora Fornecedora";
		}

		return new String(titulo);		
	}
	
	public String getDescricao()

	{
		String descricao = "Nome do fornecedor: " + getTitulo(this) +" "+ this.getNome() + "\nEmail do fornecedor: " + this.getEmail() + 
				"\nCNPJ do fornecedor: " + this.cnpj + "\nCódigo do fornecedor: " + this.getCodigo();	
		
		return new String(descricao);
	}
	
	public String getCodigo() {
		this.codigoFornecedor = "F" + codigo;
		return codigoFornecedor;
	}
}
