import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Predator2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Predator2 extends Actor
{
    public void act()
    {
        setLocation(getX()-3,getY());
        if(isTouching(MainFish.class)){
            removeTouching(MainFish.class);
            Greenfoot.setWorld(new OverPage());
        }
        if(getX()<5)
        getWorld().removeObject(this);
    }
}
