import greenfoot.*;  

public class Predator1 extends Actor
{
    public void act()
    {
        setLocation(getX()-4,getY());
        if(isTouching(MainFish.class)){
            removeTouching(MainFish.class);
            Greenfoot.setWorld(new OverPage());
        }
        if(getX()<5)
        getWorld().removeObject(this);
    }
}
