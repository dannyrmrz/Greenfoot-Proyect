import greenfoot.*;  

public class Fish1 extends Actor
{
    public int speed;
    public Fish1()
    {
        speed=Greenfoot.getRandomNumber(4)+1;
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
