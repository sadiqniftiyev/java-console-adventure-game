package adventureGames.locations;

import adventureGames.Player;
import adventureGames.enemies.Zombie;

public class Cave extends BattleLoc{
    public Cave(Player player){
        super(player,"Cave", new Zombie(), "Food");
    }
}
