/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Monster;

/**
 *
 * @author muel2767 && plusfort
 */
public class Monster 
{
    float strength, strengthMax, health, healthMax, speed, speedMax;
    
    /**
     * default monster constructor
     */
    public Monster()
    {
        setDefaultMaxStats();
        strength = strengthMax;
        health = healthMax;
        speed = speedMax;
    }
    
    public Monster(float strength, float health, float speed)
    {
        setDefaultMaxStats();
        this.strength = strength;
        this.health = health;
        this.speed = speed;
    }
    
    /**
     * Set the max stat values for the monster
     */
    public void setDefaultMaxStats()
    {
        strengthMax = 10;
        healthMax = 100;
        speedMax = 5;                
    }
}
