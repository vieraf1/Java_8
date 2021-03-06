package adapter;

public class GuardadorObject {
	
	private Object[] elementos;
	private int posicao = 0;
	
	public GuardadorObject() {
		elementos = new Object[10];
	}
	
	public void adiciona(Object o) {
		elementos[posicao] = o;
		posicao++;
	}
	
	public int getQuantidadeElementos() {
		return posicao;
	}
	
	public Object getElemento(int pos) {
		if(pos >= posicao) {
			throw new ArrayIndexOutOfBoundsException(pos);
		}
		return elementos[pos];
	}

}
