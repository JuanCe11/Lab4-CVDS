package hangman.model;

public class OriginalScore implements GameScore{

	@Override
	/**
	 * @pre se inicia el puntaje con 100 puntos  
	 * @pos el puntaje minimo es 0
	 * @param correctCount letras correctas
	 * @param incorrectCount letras incorrectas
	 */
	public int calculateScore(int correctCount, int incorrectCount) {
		int puntaje = 100;
		puntaje -= 10 * incorrectCount;
		puntaje = (puntaje<0)?0:puntaje;
		return puntaje;
	}

}
