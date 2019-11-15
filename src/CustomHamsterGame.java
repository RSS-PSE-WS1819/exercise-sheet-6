import de.unistuttgart.iste.rss.oo.hamstersimulator.external.model.Hamster;
import de.unistuttgart.iste.rss.oo.hamstersimulator.datatypes.Location;
import de.unistuttgart.iste.rss.oo.hamstersimulator.external.model.Territory;
import de.unistuttgart.iste.rss.oo.hamstersimulator.datatypes.Direction;

/**
 * Beschreiben Sie hier die Klasse CustomHamsterGame.
 * 
 * @author (Ihr Name)
 * @version (eine Versionsnummer oder ein Datum)
 */
public class CustomHamsterGame extends HamsterGame {

	static String TERRITORY_EMPTY = "territories/empty.ter";

	@Override
	void run() {
	}

	// ignore
	public static void main(String[] args) {
		(new CustomHamsterGame()).testGame();
	}

}
