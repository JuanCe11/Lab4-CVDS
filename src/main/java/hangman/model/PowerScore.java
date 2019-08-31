package hangman.model;

public class PowerScore implements GameScore{

	@Override
	/**
	 * @pre se inicia el puntaje con 0 puntos  
	 * @pos el puntaje minimo es 0 y como maximo es 500
	 * @param correctCount letras correctas
	 * @param incorrectCount letras incorrectas
	 */
	public int calculateScore(int correctCount, int incorrectCount) {
		int puntaje = 0;
		for (int i = 1; i < correctCount+1; i++) {
			puntaje += Math.pow(5, i);
		}
		puntaje -= 8 * incorrectCount;
		puntaje = (puntaje<0)?0:puntaje;
		puntaje = (puntaje>500)?500:puntaje;
		return puntaje;
	}
	
}
