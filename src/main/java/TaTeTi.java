package main.java;

public class TaTeTi {
	private String x = "X", o = "O", jActual = x, tablero[][] = new String[3][3];

	public TaTeTi() {
		estadoInicial();
		dibujar();
	}

	/**
	 * Verificar si hubo ganador
	 * 
	 * @return boolean
	 */
	public boolean huboGanador() {
		boolean gano = false;
		if (tablero[0][0] == jActual && tablero[0][1] == jActual && tablero[0][2] == jActual
				|| tablero[0][0] == jActual && tablero[0][1] == jActual && tablero[0][2] == jActual
				|| tablero[1][0] == jActual && tablero[1][1] == jActual && tablero[1][2] == jActual
				|| tablero[2][0] == jActual && tablero[2][1] == jActual && tablero[2][2] == jActual
				|| tablero[0][0] == jActual && tablero[1][0] == jActual && tablero[2][0] == jActual
				|| tablero[0][1] == jActual && tablero[1][1] == jActual && tablero[2][1] == jActual
				|| tablero[0][2] == jActual && tablero[1][2] == jActual && tablero[2][2] == jActual
				|| tablero[0][0] == jActual && tablero[1][1] == jActual && tablero[2][2] == jActual
				|| tablero[0][2] == jActual && tablero[1][1] == jActual && tablero[2][0] == jActual) {
			gano = true;
		}
		return gano;
	}

	/**
	 * Verficar si hay movimiento posible
	 * 
	 * @return boolean
	 */
	private boolean todoOcupado() {
		boolean todoOcupado = true;
		for (int i = 0; i < this.tablero.length; i++) {
			for (int j = 0; j < this.tablero[i].length && todoOcupado; j++) {
				if (this.tablero[i][j] == "-") {
					todoOcupado = false;
				}
			}
		}
		return todoOcupado;
	}

	/**
	 * Consultar que hay en una posicion
	 * 
	 * @return String
	 * 
	 */
	public String getCasillero(int x, int y) {
		return this.tablero[x][y];
	}

	/**
	 * Insertar en casillero elegido, si puede. Muestra y actualiza estados.
	 * Verifica si termino el juego y si hubo ganador. 
	 * (x >= 0 && x < 3) && (y >= 0 && y < 3)
	 * 
	 */
	public void marcar(int x, int y) {
		if (!todoOcupado() && !huboGanador()) {
			if (tablero[x][y] == "-") {
				tablero[x][y] = obtenerJugadorActual();
				dibujar();
				cambiarTurno();
			} else {
				System.out.println("Espacio ocupado por: " + tablero[x][y]);
			}
		}

	}

	/**
	 * Obtener nombre del jugador actual
	 * 
	 * @return String
	 */
	public String obtenerJugadorActual() {
		return jActual;
	}

	/**
	 * Cambiar de turno
	 */
	private void cambiarTurno() {
		if (this.jActual == x && !huboGanador() && !todoOcupado()) {
			this.jActual = o;
		} else if (this.jActual == o && !huboGanador() && !todoOcupado()) {
			this.jActual = x;
		}
	}

	/**
	 * Dibuja tablero
	 */
	public void dibujar() {
		for (int i = 0; i < this.tablero.length; i++) {
			for (int j = 0; j < this.tablero[i].length; j++) {
				System.out.print(this.tablero[i][j]);
			}
			System.out.println();
		}

		if (huboGanador()) {
			System.out.println("\nGanó: " + this.jActual);
		}

		if (!huboGanador() && todoOcupado()) {
			System.out.println("\nTerminó el juego y no hubo ganador.");
		}
		System.out.println("\n\n\n");
	}

	/**
	 * Tablero al iniciar
	 */
	public void estadoInicial() {
		this.tablero[0][0] = "-";
		this.tablero[0][1] = "-";
		this.tablero[0][2] = "-";
		this.tablero[1][0] = "-";
		this.tablero[1][1] = "-";
		this.tablero[1][2] = "-";
		this.tablero[2][0] = "-";
		this.tablero[2][1] = "-";
		this.tablero[2][2] = "-";
	}
}
