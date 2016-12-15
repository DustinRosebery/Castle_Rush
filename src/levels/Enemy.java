package levels;

/**
 * Parent class for enemy minions
 * Created by Dustin on 12/15/2016.
 */
public class Enemy {

    public enum enemy_type
    {
        PEON,
        GRUNT,
        RAIDER,
        OGRE;
    }
    /******************************************
                     Enemy Stats
     ******************************************/
    // PEON
    private final int peon_base_hp = 100;
    private final int peon_speed = 10;
    private final int peon_damage = 10;
    private final double peon_attack_speed = 2.0;
    // GRUNT
    private final int grunt_base_hp = 200;
    private final int grunt_speed = 15;
    private final int grunt_damage = 20;
    private final double grunt_attack_speed = 2.25;
    // RAIDER
    private final int raider_base_hp = 50;
    private final int raider_speed = 25;
    private final int raider_damage = 12;
    private final double raider_attack_speed = 1.75;
    // OGRE
    private final int ogre_base_hp = 500;
    private final int ogre_speed = 2;
    private final int ogre_damage = 50;
    private final double ogre_attack_speed = 3.5;


    private enum enemy_ability
    {
        PIERCE,
        BOMB,
        REGEN,
        AOE_BUFF;
    }

    private String name;
    private int base_hp;
    private int hp;
    private int speed;
    private int damage;
    private double attack_speed;

    Enemy(enemy_type type){
        switch(type)
        {
            case PEON:
                name = "Peon";
                base_hp = peon_base_hp;
                hp = base_hp;
                speed = peon_speed;
                damage = peon_damage;
                attack_speed = peon_attack_speed;
                break;
            case GRUNT:
                name = "Grunt";
                base_hp = grunt_base_hp;
                hp = base_hp;
                speed = grunt_speed;
                damage = grunt_damage;
                attack_speed = grunt_attack_speed;
                break;
            case RAIDER:
                name = "Raider";
                base_hp = raider_base_hp;
                hp = base_hp;
                speed = raider_speed;
                damage = raider_damage;
                attack_speed = raider_attack_speed;
                break;
            case OGRE:
                name = "Ogre";
                base_hp = ogre_base_hp;
                hp = base_hp;
                speed = ogre_speed;
                damage = ogre_damage;
                attack_speed = ogre_attack_speed;
                break;
            default:
                System.out.println("Missed Enemy Type: caught " + type);
                break;
        }
    }

    /**
     * Decreases HP to enemy by
     * @param amount
     * @return current hp if still alive, or 0
     */
    private int takeDamage(int amount)
    {
        System.out.println(name + " took " + amount + " damage");
        hp = hp - amount;
        int result = hp;
        if(hp <= 0)
        {
            result = 0;
        }
        return result;
    }

}
