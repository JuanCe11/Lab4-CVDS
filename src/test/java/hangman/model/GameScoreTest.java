package hangman.model;
import org.junit.*;
import org.junit.Test;

public class GameScoreTest {
	
	@Test
	public void originalScorePuntajeMayor0() {
		GameScore ans=new OriginalScore();
		Assert.assertTrue(ans.calculateScore(0, 1)==90);
	}
	
	@Test
	public void originalScorePuntajeIgual0() {
		GameScore ans=new OriginalScore();
		Assert.assertTrue(ans.calculateScore(0, 10)==0);
	}
	
	@Test
	public void originalScorePuntajeMenor0() {
		GameScore ans=new OriginalScore();
		Assert.assertTrue(ans.calculateScore(0, 15)==0);
	}
	
	@Test
	public void bonusScorePuntajeMayor0() {
		GameScore ans=new BonusScore();
		Assert.assertTrue(ans.calculateScore(5, 1) == 45);
	}
	
	@Test
	public void bonusScorePuntajeIgual0() {
		GameScore ans=new BonusScore();
		Assert.assertTrue(ans.calculateScore(5, 10)==0);
	}

	@Test
	public void bonusScorePuntajeMenor0() {
		GameScore ans=new BonusScore();
		Assert.assertTrue(ans.calculateScore(15, 30)==0);
	}
	
	@Test
	public void powerScorePuntajeMenor0() {
		GameScore ans=new PowerScore();
		Assert.assertTrue(ans.calculateScore(2, 10)==0);
	}
	
	@Test
	public void powerScorePuntajeIgual0() {
		GameScore ans=new PowerScore();
		Assert.assertTrue(ans.calculateScore(0, 0)==0);
	}
	
	@Test
	public void powerScorePuntajeEntre0Y500() {
		GameScore ans=new PowerScore();
		Assert.assertTrue(ans.calculateScore(3, 4)==123);
	}
	
	@Test
	public void powerScorePuntajeIgual500() {
		GameScore ans=new PowerScore();
		Assert.assertTrue(ans.calculateScore(4, 35)==500);
	}
	
	@Test
	public void powerScorePuntajeMayor500() {
		GameScore ans=new PowerScore();
		Assert.assertTrue(ans.calculateScore(5, 10)==500);
	}
}