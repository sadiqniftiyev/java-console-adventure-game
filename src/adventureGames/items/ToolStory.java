package adventureGames.items;

import adventureGames.Player;
import adventureGames.locations.NormalLoc;

public class ToolStory extends NormalLoc {

    public ToolStory(Player player) {
        super(player, "Magaza");
    }

    public boolean getLocation() {

        System.out.println("Para :" + player.getMoney());
        System.out.println("1. Silahlar");
        System.out.println("2. Zirhlar");
        System.out.println("3. Cikis");
        System.out.println("Seciminiz :");

        int selTool = scan.nextInt();
        int selItemID;

        switch (selTool) {
            case 1:
                selItemID = weaponMenu();
                buyWeapon(selItemID);
                break;

            case 2:
                selItemID = armorMenu();
                buyArmor(selItemID);
                break;

            default:
                break;
        }

        return true;
    }

    public int armorMenu() {
        System.out.println("1. Hahif zirh\t <Para 15: - Hasar yansitma : 1>");
        System.out.println("2. Orta zirh\t <Para 25:  - Hasar yansitma: 3>");
        System.out.println("3. Agir zirh\t <Para 40:  - Hasar yansitma: 5>");
        System.out.println("4. Cikis");
        System.out.println("Zirh seciniz");

        int selArmorID = scan.nextInt();

        return selArmorID;
    }

    public void buyArmor(int selItemID) {
        int avoid = 0, price = 0;
        String aName = null;

        switch (selItemID) {
            case 1:
                avoid = 1;
                aName = "Hafif zirh";
                price = 15;
                break;

            case 2:
                avoid = 3;
                aName = "Orta zirh";
                price = 25;
                break;

            case 3:
                avoid = 5;
                aName = "Agir zirh";
                price = 40;
                break;
            case 4:
                System.out.println("Cikis yapiliyor");
                break;

            default:
                System.out.println("Seciminizi duzeldin !");
                break;
        }

        if(price > 0){
            if (player.getMoney() >= price) {

                player.getInv().setArmor(avoid);
                player.getInv().setaName(aName);
                player.setMoney(player.getMoney() - price);

                System.out.println(aName + " satin aldiniz, Engellenen hasar :"
                        + player.getInv().getArmor());

                System.out.println("Kalan Para : " + player.getMoney());

            } else {
                System.out.println("Bakiye yetersiz. !");
            }
        }
    }

    public int weaponMenu() {

        System.out.println("1. Tapanca\t <Para : 25 - Hasar : 2>");
        System.out.println("1. Kilic\t <Para : 35 - Hasar : 3>");
        System.out.println("1. Tufek\t <Para : 45 - Hasar : 7>");
        System.out.println("4. Cikis");
        System.out.println("Silah Seciniz");

        int selWeaponID = scan.nextInt();

        return selWeaponID;
    }

    public void buyWeapon(int itemID) {

        int damage = 0, price = 0;
        String wName = null;

        switch (itemID) {
            case 1:
                damage = 2;
                wName = "Tapanca";
                price = 25;
                break;

            case 2:
                damage = 3;
                wName = "Kilic";
                price = 35;
                break;

            case 3:
                damage = 7;
                wName = "Tufek";
                price = 45;
                break;
            case 4:
                System.out.println("Cikis yapiliyor");
                break;

            default:
                System.out.println("Seciminizi duzeldin !");
                break;
        }

       if(price > 0){
           if (player.getMoney() >= price) {

               player.getInv().setDamage(damage);
               player.getInv().setwName(wName);
               player.setMoney(player.getMoney() - price);

               System.out.println(wName + " satin aldiniz, Onceki Hasar :"
                       + player.getDamage() + player.getTotalDamage());

               System.out.println("Kalan Para : " + player.getMoney());

           } else {
               System.out.println("Bakiye yetersiz. !");
           }
       }
    }
}