import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GameWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameWorld extends World
{
    private int count = 0; //Holds values for

    /**
     * Constructor for objects of class GameWorld.
     * 
     */
    public GameWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 640, 1, false); 

        prepare();
    }

    public void act()
    {
        count++; //Increase counter for global synchronization
    }

    /**
     * Returns world synchronization count for actors to refer too.
     */
    public int getCount()
    {
        return count;
    }

    /**
     * Prepare the world for the start of the program. That is: create the initial
     * objects and add them to the world.
     */
    private void prepare()
    {
        LightGroundOne lightgroundone = new LightGroundOne();
        addObject(lightgroundone, 126, 583);
        LightGroundTwo lightgroundtwo = new LightGroundTwo();
        addObject(lightgroundtwo, 363, 590);
        lightgroundtwo.setLocation(355, 583);
        LightGroundOne lightgroundone2 = new LightGroundOne();
        addObject(lightgroundone2, 559, 591);
        lightgroundone2.setLocation(559, 584);
        LightGroundTwo lightgroundtwo2 = new LightGroundTwo();
        addObject(lightgroundtwo2, 787, 588);
        lightgroundtwo2.setLocation(738, 584);
        

        Ground g = new Ground();
        addObject(g, 900, 0);
        g.setLocation(900, 0);
        
        GrassSmall grasssmall = new GrassSmall();
        addObject(grasssmall, 213, 620);
        GrassLarge grasslarge = new GrassLarge();
        addObject(grasslarge, 672, 566);
        GrassLarge grasslarge2 = new GrassLarge();
        addObject(grasslarge2, 32, 603);
        GrassSmall grasssmall2 = new GrassSmall();
        addObject(grasssmall2, 770, 615);
        GrassLarge grasslarge3 = new GrassLarge();
        addObject(grasslarge3, 415, 597);
        GrassLarge grasslarge4 = new GrassLarge();
        addObject(grasslarge4, 830, 597);
        GrassSmall grasssmall3 = new GrassSmall();
        addObject(grasssmall3, 900, 568);
        GrassSmall grasssmall4 = new GrassSmall();
        addObject(grasssmall4, 1000, 615);
        
        Sky s = new Sky();
        addObject(s, 900, 0);
        s.setLocation(900, 0);
        
        Platforms p = new Platforms();
        addObject(p, 0, 590);
        
        Professor prof = new Professor();
        addObject(prof, 268, 480);

        setPaintOrder(GrassLarge.class, GrassSmall.class, Professor.class, LightGroundOne.class, LightGroundTwo.class);
     
    }
}
