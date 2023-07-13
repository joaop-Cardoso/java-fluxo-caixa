package padrao;

import java.util.List;
import java.util.ArrayList;


public class ListaGenerica<E> {
	
	private List<E> lista;
	
	ListaGenerica()
	{
		if(lista==null)
		{
			lista = new ArrayList<E>(); 
		}
	}
	
	ListaGenerica(E e)
	{
		if(lista==null)
		{
			lista = new ArrayList<E>(); 
		}
		
		add(e);
	}
	
	
	public void add(E e)
	{
		lista.add(e);
	}
	
	public E get(E e)
	{
		if(lista.contains(e))
			{
				return e;
			}
		return null;
	}
	
	public E get(int i)
	{
		return lista.get(i);
	}
	
	public int size()
	{
		return lista.size();
	}
	
	public boolean contains(E e)
	{
		return lista.contains(e);
	}
	
	public void remove (E e)
	{
		lista.remove(e);
	}
	
	public void remove (int i)
	{
		lista.remove(i);
	}

}

