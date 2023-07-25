import greenfoot.*;  


public class MainFish extends Actor
{
    public void act()
    {
        checkKeyPress();
        checkCollision();
    }
    private void checkKeyPress(){
        if(Greenfoot.isKeyDown("up")){
            setLocation(getX(),getY()-6);
        }
        if(Greenfoot.isKeyDown("down")){
            setLocation(getX(),getY()+6);
        }
        if(Greenfoot.isKeyDown("left")){
            setLocation(getX()-4,getY());
        }
        if(Greenfoot.isKeyDown("right")){
            setLocation(getX()+4,getY());
        }
    }
    private void checkCollision(){
        if(isTouching(Fish1.class)){
            removeTouching(Fish1.class);
            MyWorld.puntaje.add(2);
        }
        if(isTouching(Fish2.class)){
            removeTouching(Fish2.class);
            MyWorld.puntaje.add(4);
        }
    }
        
}
