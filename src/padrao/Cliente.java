package padrao;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Cliente extends Entidade {
	
	private String cpf;
	private String titulo;
	private static int codigo = 0;

	public Cliente(String nome, String email, String sexo, String cpf) 
	{
		super(nome, email, sexo);
		setCpf(cpf);
		codigo++;
		setTitulo(getSexo());
	}
	
	//setters

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
	
	public void setTitulo(String sexo)
	{
		if(sexo.equals("m") || sexo.equals("M"))
		{
			this.titulo = "Prezado Senhor Cliente";
		}
		else if(sexo.equals("f") || sexo.equals("F"))
		{
			this.titulo = "Prezada Senhora Cliente";
		}
		else
		{
			System.out.println("Entrada inválida.");
		}
	}
	//getters
	
	public String getDescricao()

	{
		String descricao = "Nome do cliente: " + this.titulo + " " + this.getNome() + "\nEmail do cliente: " + this.getEmail() + 
				"\nCPF do cliente: " + this.cpf + "\nCódigo do cliente: " + this.getCodigo();	
		
		return new String(descricao);
	}
	
	public String getCodigo() {
		String codigoFormatado = "C" + codigo;
		return codigoFormatado;
	}
}
