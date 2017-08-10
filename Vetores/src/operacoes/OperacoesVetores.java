package operacoes;

/* Exerc�cio 1
 * Crie uma classe OperacoesArray 
 * Na classe, implemente um m�todo que verifica se todos os 
 * n�meros de um array de inteiros recebido por par�metro s�o
 * diferentes uns dos outros (em outras palavras, se o array
 * cont�m elementos distintos)
 * 
 * public boolean temElementosDistintos(int[] array) { ...}
 * 
 * Exercicio 2
 * Na classe, implemente um m�todo que recebe por par�metro um
 * array de inteiros e determina se existe um par de n�meros em
 * que o produto seja um n�mero �mpar
 * 
 * public boolean temParProdutoImpar(int[] array) {... }
 * 
 * Exercicio 6
 * Na classe OperacoesArray, escreva um m�todo que recebe por 
 * par�metro uma matriz e retorna a soma dos elementos da sua 
 * diagonal principal
 * 
 * public int getSomaDiagonal(int[][] mat) {...} 
 * 
 */

public class OperacoesVetores {

	public boolean temElementosDistintos(int[] vet) {
		for (int pos1 = 0; pos1 < vet.length - 1; pos1++)
			for (int pos2 = pos1 + 1; pos2 < vet.length; pos2++)
				if (vet[pos1] == vet[pos2])
					return false;
		return true;
	}

	public boolean temParProdutoImpar(int[] vet) {
		for (int pos1 = 0; pos1 < vet.length - 1; pos1++)
			for (int pos2 = pos1 + 1; pos2 < vet.length; pos2++)
				if (vet[pos1] * vet[pos2] % 2 == 1)
					return true;
		return false;
	}

	public boolean temParProdutoImparV2(int[] vet) {
		int totalImpares = 0;
		for (int pos1 = 0; pos1 < vet.length; pos1++)
			if (vet[pos1] % 2 == 1)
				totalImpares++;
		if (totalImpares > 1)
			return true;
		return false;
	}

	public int getSomaDiagonal(int[][] mat) {
		int soma = 0;
		int numLinhas = mat.length;
		int numColunas = mat[0].length;
		int total = Math.min(numLinhas, numColunas);

		for (int pos = 0; pos < total; pos++)
			soma = soma + mat[pos][pos];
		return soma;
	}
}