import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class EnemyB here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EnemyB extends Obstacles
{
    /**
     * Act - do whatever the EnemyB wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        move();
        remove();
    }    
    public void move()
    {
        setLocation(getX() - 5, getY());
    }
    public void remove()
    {
        if (getX() == 0)
        {
            getWorld().removeObject(this);
        }
    }
}
