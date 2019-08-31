package hangman.setup.factoryMethod;

import hangman.model.GameModel;
import hangman.model.GameScore;
import hangman.model.Language;
import hangman.model.ScoreType;
import hangman.model.dictionary.HangmanDictionary;
import hangman.view.HangmanPanel;

abstract public class HangmanFactoryMethod {
    abstract public Language createLanguage();
    abstract public HangmanDictionary createDictionary();
    abstract public HangmanPanel createHangmanPanel();
    abstract public GameModel createModel(HangmanDictionary dict,GameScore score);
    abstract public GameScore createScore(ScoreType tipo);
}
