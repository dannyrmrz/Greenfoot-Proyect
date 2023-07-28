import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Fish3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Fish3 extends Actor
{
    private int speed;
    public Fish3()
    {
        speed=Greenfoot.getRandomNumber(3)+1;
    }
    public void act()
    {
         setLocation(getX()-speed,getY());
         if (getX()==0)
         {
             Level2.puntaje.add(0);
             getWorld().removeObject(this);
         }
    }
}

