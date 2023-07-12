package padrao;

public class CategoriaCliente {

	private char categoria;
	
	CategoriaCliente(char categoria)
	{
		setCategoria(categoria);
	}
	
	public void setCategoria(char categoria)
	{
		if(categoria=='A' || categoria=='B'|| categoria=='C')
		{
			this.categoria = categoria;
		}
		else 
		{
			throw new NullPointerException("Categoria inexistente. Apenas as categorias 'A', 'B' e 'C' são permitidas.");
		}
	}
	
	@Override
    public String toString() {
        return String.valueOf(categoria);
	}
	
}
