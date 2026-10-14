package adventureGames.locations;

import adventureGames.Player;
import adventureGames.enemies.Vampire;

public class Forest extends BattleLoc{
    public Forest(Player player){
        super(player,"Orman", new Vampire(), "Firewood");
    }
}
