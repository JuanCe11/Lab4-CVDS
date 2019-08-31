package hangman.setup.factoryMethod;

import hangman.model.BonusScore;
import hangman.model.English;
import hangman.model.Language;
import hangman.model.OriginalScore;
import hangman.model.PowerScore;
import hangman.model.ScoreType;
import hangman.model.dictionary.EnglishDictionaryDataSource;
import hangman.model.dictionary.HangmanDictionary;
import hangman.view.HangmanPanel;
import hangman.view.HangmanStickmanPanel;
import hangman.model.GameModel;
import hangman.model.GameScore;

public class HangmanDefaultFactoryMethod extends HangmanFactoryMethod {
    @Override
    public Language createLanguage() {
        return new English();
    }

    @Override
    public HangmanDictionary createDictionary() {
        return new EnglishDictionaryDataSource();
    }

    @Override
    public HangmanPanel createHangmanPanel() {
        return new HangmanStickmanPanel();
    }

	@Override
	public GameModel createModel(HangmanDictionary dict, GameScore score) {
		return new GameModel(dict,score);
	}

	@Override
	public GameScore createScore(ScoreType tipo) {
		switch (tipo) {
			case BonusScore:
				return new BonusScore();
			case PowerScore:
				return new PowerScore();
			default:
				return new OriginalScore();
		}
	}

	


	
	
}
