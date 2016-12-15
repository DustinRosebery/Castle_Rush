package character;

import java.io.Serializable;

/**
 * Player Methods
 * - boolean hasGold(int amount)
 * - private void spend(int amount)
 * - private void addGold(int amount)
 *
 * Created by Dustin on 12/11/2016.
 */
public class Player implements Serializable{

    private String name;
    private int gold;
    private int highest_level;
    private Castle my_castle;

    Player()
    {
        name = "DEFAULT";
        gold = 0;
        highest_level = 0;
        my_castle = null;
    }

    Player(String name, String castle_name)
    {
        this.name = name;
        gold = 100;
        highest_level = 1;
        my_castle = new Castle(castle_name);
    }

    /**
     * checks if the player has enough gold
     * @param amount
     * @return true if player has enough gold
     */
    boolean hasGold(int amount)
    {
        boolean result = true;
        if(gold - amount < 0)
        {
            result = false;
        }
        return result;
    }

    /**
     * decreases player gold by
     * @param amount
     */
    private void spend(int amount)
    {
        System.out.println("Gold decreased from " + gold + " to " + (gold-amount) );
        gold = gold - amount;
    }

    /**
     * Increases player gold by
     * @param amount
     */
    private void addGold(int amount)
    {
        System.out.println("Gold increased from " + gold + " to " + (gold+amount) );
        gold = gold + amount;
    }
}
