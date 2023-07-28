import greenfoot.*;  

public class OverPage extends World
{

    public OverPage()
    {    
        super(950, 550, 1); 
        prepare();
    }
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Exit exit = new Exit();
        addObject(exit,272,362);
        Replay replay = new Replay();
        addObject(replay,624,392);
        exit.setLocation(334,393);
        showText("Haz sido comido por el depredador   :(", 475, 280);
        showText("TU PUNTAJE FUE: "+MyWorld.puntaje.getValue()+" puntos", 475, 305);
        //Greenfoot.playSound("");
    }
}
