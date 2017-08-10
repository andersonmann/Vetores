package jogodavelha;

public class JogoDaVelha {

	private char[][] tab;

	public JogoDaVelha() {
		tab = new char[3][3];
		for (int i = 0; i < 3; i++)
			for (int j = 0; j < 3; j++)
				tab[i][j] = ' '; // vazio
	}

	public String vencedor() {
		char[] jog = { 'X', 'O' };
		for (int j = 0; j < 2; j++) // Testa X, depois O
		{
			for (int y = 0; y < 3; y++) {
				if (tab[y][0] == jog[j] && tab[y][1] == jog[j] && tab[y][2] == jog[j])
					return "" + jog[j];
				if (tab[0][y] == jog[j] && tab[1][y] == jog[j] && tab[2][y] == jog[j])
					return "" + jog[j];
			}
			if (tab[0][0] == jog[j] && tab[1][1] == jog[j] && tab[2][2] == jog[j])
				return "" + jog[j];
			if (tab[0][2] == jog[j] && tab[1][1] == jog[j] && tab[2][0] == jog[j])
				return "" + jog[j];
		}
		return "Empate";
	}

	public boolean set(int i, int j, char peca) {
		if (tab[i][j] != ' ')
			return false; // posição já ocupada!
		tab[i][j] = peca;
		return true;
	}

	public char get(int i, int j) {
		return tab[i][j];
	}

	public String toString() {
		String aux = "";
		int lin = 0;
		for (char[] linha : tab) {
			int col = 0;
			for (char celula : linha) {
				aux += celula;
				if (col < 2)
					aux += " | ";
				col++;
			}
			aux += "\n";
			if (lin < 2)
				aux += "---------\n";
			lin++;
		}
		return aux;
	}
}
