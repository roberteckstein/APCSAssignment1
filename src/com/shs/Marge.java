package com.shs;

public class Marge {
    private static int maxHealth = 20;
    private int health;
    private int age;
    private String name;
    private boolean alive;

    public int getHealth()
    {
        return health;
    }

    public int getAge()
    {
        return age;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public Marge(int age, String name)
    {
        this.health = Marge.maxHealth;
        this.alive = true;
        this.name = name;
        if(age < 0)
        {
            System.out.println(":(");
            return;
        }
        this.age = age;
    }

    public void heal(int amount)
    {
        if(amount < 0)
        {
            System.out.println("No");
            return;
        }
        this.health += amount;
    }

    public void onHit(int damage)
    {
        if(damage < 0)
        {
            System.out.println("No");
            return;
        }
        health -= damage;
        if (health <= 0)
        {
            alive = false;
        }
    }

    public void ageUp()
    {
        age++;
    }

    public void upgradeMarges(int amount)
    {
       Marge.maxHealth += amount;
    }
}
