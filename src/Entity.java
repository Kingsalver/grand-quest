
public class Entity {


    private String name;
    private int HP;
    private int power;

    public Entity (String name, int HP, int power){
        this.name=name;
        this.HP=HP;
        this.power=power;
    }
    public Entity (){
        name = null;
        HP = 0;
        power=0;

    }




    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHP(){
        return HP;
    }

    public void setHP(int HP){
        this.HP = HP;
    }

    public int getPower(){
        return power;
    }

    public void setPower(int power){
        this.power = power;
    }


}
