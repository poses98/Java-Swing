package Tema_2;

public class MatTicTacToe {
	private Integer[][] matriz;

	public MatTicTacToe() {
		matriz = new Integer[3][3];
		for(int i = 0;i < matriz.length;i++) {
			for (int j = 0; j < matriz.length; j++) {
				matriz[i][j] = 0;
			}
		}
	}
	public boolean setPos(int posX,int posY,int jug) {
		boolean check = false;
		if(matriz[posX][posY] == 0) {
			matriz[posX][posY] = jug;
			check = true;
		}
		return check;
	}
	public Integer[][] getMatriz() {
		return matriz;
	}
	public void clear() {
		for(int i = 0;i < matriz.length;i++) {
			for (int j = 0; j < matriz.length; j++) {
				matriz[i][j] = 0;
			}
		}
		
	}
	
	
	
}
