import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import de.unistuttgart.iste.rss.oo.hamstersimulator.datatypes.Location;
import de.unistuttgart.iste.rss.oo.hamstersimulator.external.model.Territory;

/**
 * Beschreiben Sie hier die Klasse MyFirstSimpleHamster.
 * 
 * @author (Ihr Name)
 * @version (eine Versionsnummer oder ein Datum)
 */
public class HamsterGame extends SimpleHamsterGame {
	protected final Territory territory;

	HamsterGame(String territoryPath) {
		File terFile = new File(territoryPath);
		try (InputStream targetStream = new FileInputStream(terFile);) {
			game.initialize(targetStream);
		} catch (IOException ex) {
			throw new RuntimeException(ex);
		}
		game.displayInNewGameWindow();
		territory = game.getTerritory();
	}

	HamsterGame() {
		game.initialize();
		game.displayInNewGameWindow();
		territory = game.getTerritory();
	}

	protected final void testGame() {
		try {
			this.run();
		} catch (final RuntimeException e) {
			this.game.getInputInterface().showAlert(e);
		}
		game.stopGame();
	}

}
