import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class WinPage here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WinPage extends World
{

    public WinPage()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(950, 550, 1); 
        prepare();
    }
    private void prepare()
    {
        Exit exit = new Exit();
        addObject(exit,487,347);
    }
}
