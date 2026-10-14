package adventureGames.locations;

import adventureGames.Player;
import adventureGames.enemies.Bear;

public class River extends BattleLoc{
    public River(Player player){
        super(player,"River", new Bear(), "Water");
    }
}
