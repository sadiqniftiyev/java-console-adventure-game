package adventureGames;

import adventureGames.items.ToolStory;
import adventureGames.locations.*;

import java.util.Scanner;

public class Game {
    Player player;
    Location location;
    Scanner scan = new Scanner(System.in);

    public void login(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Adventure Gamese xos gelmisiniz !");
        System.out.println("Oyun baslamadan once adinizi qeyd edin :");
        String playerName = scan.nextLine();
        player = new Player("Player");
        player.selectCha();
        start();

    }

    public void start(){
        while(true){
            System.out.println();
            System.out.println("-------------------------");
            System.out.println();
            System.out.println("1. Guvenli Ev ---> Size aid guvenli bir mekan, dusman yox");
            System.out.println("2. Magara ---> Qarsiniza belke zombi cixa biler");
            System.out.println("3. Mese ---> Qarsiniz belke vampir cixa biler");
            System.out.println("4. Cay ---> Qarsiniza belke ayi cixa biler");
            System.out.println("5. Magaza");
            System.out.println("Getmek istediyiniz yer :");

            int selLoc = scan.nextInt();

            while(selLoc < 0 || selLoc > 5){
                System.out.println("Seciminizi duzeldin !");
                selLoc = scan.nextInt();
            }

            switch(selLoc){
                case 1:
                    location = new SafeHouse(player);
                    break;

                case 2:
                    location = new Cave(player);
                    break;

                case 3:
                    location = new Forest(player);
                    break;

                case 4:
                    location = new River(player);
                    break;

                case 5:
                    location = new ToolStory(player);
                    break;

                default:
                    location = new SafeHouse(player);
            }
if(location.getClass().getName().equals("SafeHouse")){
    if(player.getInv().isFirewood() && player.getInv().isFood() && player.getInv().isWater()){
        System.out.println("Oyun bitti !");
        break;
    }
}
            if(!location.getLocation()){
                System.out.println("Oyun bitti !");
                break;
            }

        }
    }
}