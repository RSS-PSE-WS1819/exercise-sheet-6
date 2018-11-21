import de.unistuttgart.iste.rss.oo.hamstersimulator.datatypes.Location;
import de.unistuttgart.iste.rss.oo.hamstersimulator.external.model.Territory;
/**
 * Beschreiben Sie hier die Klasse MyFirstSimpleHamster.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class HamsterGame extends SimpleHamsterGame
{ 
    protected final Territory territory;
    
    HamsterGame(String territoryPath){
        game.initialize(territoryPath);
        game.displayInNewGameWindow();  
        territory = game.getTerritory();
    }
    
    HamsterGame(){
        game.initialize();
        game.displayInNewGameWindow();  
        territory = game.getTerritory();
    }

}
