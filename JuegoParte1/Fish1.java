import greenfoot.*;  

public class Fish1 extends Actor
{
    public int speed;
    public Fish1()
    {
        speed=Greenfoot.getRandomNumber(4)+1;
    }
    /**
     * Act - do whatever the Fish1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
         setLocation(getX()-speed,getY());
         if (getX()==0)
         {
             MyWorld.puntaje.add(0);
             getWorld().removeObject(this);
         }
    }
}
