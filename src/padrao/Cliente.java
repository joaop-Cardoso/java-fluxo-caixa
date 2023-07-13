package padrao;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Cliente extends Entidade {
	
	private String cpf;
	private static int codigo = 0;
	private String codigoCliente;

	public Cliente(String nome, String email, String sexo, String cpf) 
	{
		super(nome, email, sexo);
		setCpf(cpf);
		codigo++;
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
	
	//getters
	
	public String getTitulo(Cliente cliente)
	{
		String titulo = new String();
		
		if(cliente.getSexo().equals("m") || cliente.getSexo().equals("M"))
		{
			titulo = "Prezado Senhor Cliente";
		}
		else if(cliente.getSexo().equals("f")|| cliente.getSexo().equals("F"))
		{
			titulo = "Prezada Senhora Cliente";
		}

		return new String(titulo);		
	}
	
	public String getDescricao()

	{
		String descricao = "Nome do cliente: " + getTitulo(this) + " " + this.getNome() + "\nEmail do cliente: " + this.getEmail() + 
				"\nCPF do cliente: " + this.cpf + "\nCódigo do cliente: " + this.getCodigo();	
		
		return new String(descricao);
	}
	
	public String getCodigo() {
		this.codigoCliente = "C" + codigo;
		return new String(codigoCliente);
	}
}
