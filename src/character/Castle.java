package character;

import java.io.Serializable;


/**
 * Created by Dustin on 12/11/2016.
 *
 * Castle holds all relevant data about the Castle Class.
 *
 * Methods:
 * - private
 *      void damage_castle(int amount)
 *      void upgrade_base_hp(int amount)
 *      void upgrade_material(mat material)
 *      private void repair(int amount)
 *      public int get_hp()
 *      public int get_base_hp()
 *
 */
public class Castle implements Serializable{

    public enum mat {   // List of all materials
        WOOD,
        STONE,
        METAL;
    }

    int base_hp;
    int hp;
    mat material;
    String name;


    Castle()
    {
        name = "DEFAULT";
        material = mat.WOOD;
        base_hp = 1;
        hp = 1;
    }

    /**
     * @param name Player input castle name
     * New Castle Creation
     */
    Castle(String name)
    {
        this.name = name;
        material = mat.WOOD;
        base_hp = 1000;
        hp = 1000;
    }

    // **********************************************************************************************************
    //                                          PRIVATE METHODS
    //***********************************************************************************************************

    /**
     * @param amount
     * Decrease hp by amount
     * Castle HP can never be less than 0
     */
    private void damage_castle(int amount)
    {
        if (material == mat.WOOD) {
            hp = hp - amount;
            if(hp <= 0)
            {
                hp = 0;
            }

        } else if (material == mat.STONE) {
            amount = (int) Math.floor(amount / 1.5);
            hp = hp - amount;
            if(hp <= 0)
            {
                hp = 0;
            }

        } else if (material == mat.METAL) {
            amount = (int) Math.floor(amount / 3);
            hp = hp - amount;
            if(hp <= 0)
            {
                hp = 0;
            }
        }
        System.out.println("Caste took " + amount + " damage.");

    }

    /**
     * @param amount
     * Increases Base HP by amount
     */
    private void upgrade_base_hp(int amount)
    {
        System.out.println("Castle HP went from " + base_hp + " to " + base_hp + amount);
        base_hp = base_hp + amount;
    }

    /**
     * @param material
     * Upgrades castle material to material
     */
    private void upgrade_material(mat material)
    {
        System.out.println("Castle material upgraded from " + this.material + " to " + material);
        this.material = material;
    }

    /**
     * @param amount
     * Increases castle HP by amount
     */
    private void repair(int amount)
    {
        System.out.println("Castle HP went from " + hp + " to " + hp + amount);
        hp = hp + amount;
    }

    /**
     * Gets current castle HP
     * @return int HP
     */
    private int get_hp()
    {
        System.out.println("Castle has " + hp + " hp.");
        return hp;
    }

    /**
     * Gets base HP
     * @return int base_hp
     */
    public int get_base_hp()
    {
        System.out.println("Castle has " + base_hp + " base HP");
        return base_hp;
    }






}
