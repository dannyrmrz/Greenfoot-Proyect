import greenfoot.*;  

public class Predator1 extends Actor
{
    public void act()
    {
        setLocation(getX()-4,getY());
        if(isTouching(MainFish.class)){
            MyWorld.vida.add(-1);
            removeTouching(Predator1.class);
            if (MyWorld.vida.getValue()==0)
            {
                Greenfoot.setWorld(new OverPage());
            }
        }
        if(isTouching(MainFish.class)){
            Level2.vida.add(-1);
            removeTouching(Predator1.class);
            if (Level2.vida.getValue()==0||Level2.vida.getValue() < 0)
            {
                Greenfoot.setWorld(new OverPage());
            }
        }
        if(getX()<5)
        getWorld().removeObject(this);
    }
}

