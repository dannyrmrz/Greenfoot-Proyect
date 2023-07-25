import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MainFish here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MainFish extends Actor
{
    /**
     * Act - do whatever the MainFish wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
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
