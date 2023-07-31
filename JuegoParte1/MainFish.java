import greenfoot.*;  


public class MainFish extends Actor
{
    public void act()
    {
        checkKeyPress();
        checkCollision();
        
    }
    private void checkKeyPress(){
        if( ( Greenfoot.isKeyDown("w") ) || (Greenfoot.isKeyDown("up") )  ){
            setLocation(getX(),getY()-6);
        }
        if( (Greenfoot.isKeyDown("s")) || ( Greenfoot.isKeyDown("down") )  ){
            setLocation(getX(),getY()+6);
        }
        if( (Greenfoot.isKeyDown("a") ) || (Greenfoot.isKeyDown("left") )  ){
            setLocation(getX()-4,getY());
        }
        if( ( Greenfoot.isKeyDown("d")) || (Greenfoot.isKeyDown("right") )  ){
            setLocation(getX()+4,getY());
        }
    }
    private void checkCollision(){
        if(isTouching(Fish1.class)){
            removeTouching(Fish1.class);
            MyWorld.puntaje.add(2);
            Level2.puntaje.add(3);
        }
        if(isTouching(Fish2.class)){
            removeTouching(Fish2.class);
            MyWorld.puntaje.add(4);
            Level2.puntaje.add(5);
        }
        if(isTouching(Fish3.class)){
            removeTouching(Fish3.class);
            Level2.puntaje.add(6); 
        }
        if (isTouching(Predator1.class))
        {
            MyWorld.vida.add(-1);
            removeTouching(Predator1.class);
            if (MyWorld.vida.getValue() == 0)
            {
                Greenfoot.setWorld(new OverPage());
            }
        }
        if (isTouching(Predator1.class))
        {
            Level2.vida.add(-1);
            removeTouching(Predator1.class);
            if (Level2.vida.getValue() == 0||Level2.vida.getValue() < 0)
            {
                Greenfoot.setWorld(new OverPage());
            }
        }
        if (isTouching(Predator2.class))
        {
            MyWorld.vida.add(-2);
            removeTouching(Predator2.class);
            if (Level2.vida.getValue() == 0 ||Level2.vida.getValue() < 0)
            {
                Greenfoot.setWorld(new OverPage());
            }
        }
    }
        
}
