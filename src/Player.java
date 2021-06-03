import javax.naming.Name;
import java.lang.management.PlatformLoggingMXBean;

public class Player extends Entity {
    private String weapon;
    private String armor;


    public Player (String name, int HP, int power, String weapon, String armor){
        super(name, HP, power);
        this.weapon = weapon;
        this.armor = armor;
    }

    public Player (String name){
        super (name, 10, 5);
        weapon = "wood_sword";
        armor = "wood_armor";

    }





    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public String getArmor() {
        return armor;
    }

    public void setArmor(String armor) {
        this.armor = armor;
    }

     @Override public String toString (){
        return "Name: "+ Player.super.getName() + "\nHP: "+ Player.super.getHP() + "\nPower: " + Player.super.getPower()
                + "\nWeapon: "+ weapon + "\nArmor: " + armor;
     }


    public static void main (String [] args){
        Player John = new Player("John");
        Player buff = new Player("Buff", 20, 25, "gold_sword", "diamond_armor");
        System.out.println(John.toString());
        System.out.println(buff.toString());


    }

}
