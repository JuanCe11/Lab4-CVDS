package hangman.model;

public class BonusScore implements GameScore{
	
	@Override
	/**
	 * @pre se inicia el puntaje con 0 puntos  
	 * @pos el puntaje minimo es 0
	 * @param correctCount letras correctas
	 * @param incorrectCount letras incorrectas
	 */
	public int calculateScore(int correctCount, int incorrectCount) {
		int puntaje = 0;
		puntaje += 10 * correctCount;
		puntaje -= 5 * incorrectCount;
		puntaje = (puntaje<0)?0:puntaje;
		return puntaje;
	}

}
