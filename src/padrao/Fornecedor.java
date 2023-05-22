package padrao;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Fornecedor {//herança com classe Cliente

	private String nomeEmpresa;
	private String email;
	private String cnpj;
	
	Fornecedor(String nomeEmpresa, String email, String cnpj)
	{
		this.nomeEmpresa = nomeEmpresa; //nome de empresa pode ser literalmente qualquer coisa, por isso não necessita verificaçao
		setEmail(email); //herança-atributo repetido
		setCnpj(cnpj);
	}
	
	
	public void setNome(String nomeEmpresa) {
			this.nomeEmpresa = nomeEmpresa;
		}
	public void setEmail(String email)//herança-atributo repetido
	{
		String regex = "^[\\w\\.-]+@([\\w\\-]+\\.)+[A-Z]{1,20}$";
		Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
		Matcher matcher = pattern.matcher(email);
		
		if(matcher.matches())
		{
			this.email = email;
		}
	}
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
	public String getDescricao()//herança com override

	{
		String descricao = "Nome do cliente: " + this.nomeEmpresa + "\nEmail do cliente: " + this.email + 
				"\nCPF do cliente: " + this.cnpj;	
		
		return new String(descricao);
	}
}

