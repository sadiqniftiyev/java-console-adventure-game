package adventureGames.locations;

import adventureGames.Player;

public class SafeHouse extends NormalLoc{

    public SafeHouse(Player player){
        super(player, "Guvenli ev");
    }
    @Override
    public boolean getLocation(){
        player.setHealthy(player.getrHealthy());
        System.out.println("Iyilesdiniz");
        System.out.println("Suan guvenli Ev adli yerdesiniz.");
        return true;
    }
}
