package operacoes;

public class OperacoesApp {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		OperacoesVetores op = new OperacoesVetores();

		int[] vet = { 2, 4, 7, 6, 12, 3 };
		System.out.println("Tem elementos distintos? " + op.temElementosDistintos(vet));
		System.out.println("Tem par cujo produto seja ímpar? " + op.temParProdutoImpar(vet));
		System.out.println("Tem par cujo produto seja ímpar (v2)? " + op.temParProdutoImparV2(vet));

		int[][] mat = { { 1, 0, 0, 0 }, { 1, 2, 0, 0 }, { 1, 2, 4, 0 }, { 1, 2, 4, 8 } };
		System.out.println("Soma diag. principal: " + op.getSomaDiagonal(mat));
	}

}
