import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class HomePage extends World
{

    /**
     * Constructor for objects of class HomePage.
     * 
     */
    public HomePage()
    {    
        super(950, 550, 1);
        prepare();
    }
    
    private void prepare(){
        Play play = new Play();
        addObject(play, 475, 397);
        //Greenfoot.playSound("water");
    }
}
