package hundirFlota;

import java.util.Arrays;

public class Tablero {
	private int tablero[][];
	private int barcos=10;
	private int intentos=0;
	
	
	
	
	public Tablero() {
		
		this.tablero=new int [10][10];
		this.barcos=10;
		this.intentos=0;
		this.rellenarTablero();
	}
	
	public void rellenarTablero() {
		int barcosPuestos=0;
		for(int fila=0;fila<10;fila++) {
			for(int columna=0;columna<10;columna++) {
				tablero[fila][columna]=0;
			}
		}
		
		while(barcosPuestos<barcos){
			int fila=(int)(Math.random()*10);
			int columna=(int)(Math.random()*10);
			
			if(tablero[fila][columna]==0) {
				barcosPuestos++;
				tablero[fila][columna]=1;
			}
		}
	}
	
	public int[][] getTablero() {
		return tablero;
	}
	public void setTablero(int[][] tablero) {
		this.tablero = tablero;
	}
	public int getBarcos() {
		return barcos;
	}
	public void setBarcos(int barcos) {
		this.barcos = barcos;
	}
	public int getIntentos() {
		return intentos;
	}
	public void setIntentos(int intentos) {
		this.intentos = intentos;
	}

	@Override
	public String toString() {
		return "Tablero [tablero=" + Arrays.toString(tablero) + ", barcos=" + barcos + ", intentos=" + intentos + "]";
	}
	
	
	
}
