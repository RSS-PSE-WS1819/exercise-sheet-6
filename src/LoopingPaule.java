import de.unistuttgart.iste.rss.oo.hamstersimulator.external.model.Hamster;

import java.io.IOException;

import de.unistuttgart.iste.rss.oo.hamstersimulator.datatypes.Direction;
import de.unistuttgart.iste.rss.oo.hamstersimulator.datatypes.Location;
import de.unistuttgart.iste.rss.oo.hamstersimulator.external.model.Territory;

/**
 * Beschreiben Sie hier die Klasse LoopingPaule.
 * 
 * @author (Ihr Name)
 * @version (eine Versionsnummer oder ein Datum)
 */
public class LoopingPaule extends HamsterGame {

	LoopingPaule() {
		super("territories/territory-ub6.ter");
	}

	@Override
	protected void run() {
		// Your code for testing should be here
		// For example, for walking two steps:
		// this.multiMove(2);
	}

	void multiMove(int numberOfSteps) {

	}

	void spreadGrainsInCurrentDirection() {

	}

	void moveToNextWall() {

	}

	// ignore
	public static void main(String[] args) {
		(new LoopingPaule()).testGame();
	}

}
