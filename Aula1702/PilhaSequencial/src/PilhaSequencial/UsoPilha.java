package PilhaSequencial;

public class UsoPilha {

	public static void main(String[] args) {
		PilhaInt pilha = new PilhaInt();
		
		pilha.init();
		
		pilha.push(10);
		pilha.push(12);
		pilha.push(22);
		pilha.push(33);
		pilha.push(44);
		pilha.push(55);
		pilha.push(66);
		pilha.push(77);
		pilha.push(77);
		
		System.out.println("Valor retirado: " + pilha.pop());
		System.out.println("Valor retirado: " + pilha.pop());
	}

}
