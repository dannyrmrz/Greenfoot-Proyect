import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Predator2 extends Actor
{
    public void act()
    {
        setLocation(getX()-4,getY());
        if(isTouching(MainFish.class)){
            Level2.vida.add(-2);
            removeTouching(Predator2.class);
            if (Level2.vida.getValue()==0||Level2.vida.getValue() < 0)
            {
                Greenfoot.setWorld(new OverPage());
            }
        }
        if(getX()<5)
        getWorld().removeObject(this);
    }
}
