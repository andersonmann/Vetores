package jogodavelha;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		JogoDaVelha jogo = new JogoDaVelha();

		jogo.set(0, 0, 'X');
		jogo.set(0, 1, 'O');
		jogo.set(0, 2, 'X');
		jogo.set(1, 0, 'X');
		jogo.set(1, 1, 'X');
		jogo.set(1, 2, 'O');
		jogo.set(2, 0, 'O');
		jogo.set(2, 1, 'X');
		jogo.set(2, 2, 'X');
		System.out.println(jogo);
		System.out.println(jogo.vencedor());
	}

}
