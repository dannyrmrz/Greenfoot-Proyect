import greenfoot.*; 

public class Fish2 extends Actor
{
    public int speed;
    public Fish2()
    {
        speed=Greenfoot.getRandomNumber(3)+1;
    }
    public void act()
    {
        setLocation(getX()-speed,getY());
         if (getX()==0)
         {
             MyWorld.score.add(0);
             getWorld().removeObject(this);
         }
    }
}
