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
             MyWorld.puntaje.add(0);
             Level2.puntaje.add(-2);
             getWorld().removeObject(this);
         }
    }
}
