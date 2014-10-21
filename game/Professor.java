import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Professor here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Professor extends Characters
{
    // Professor Controls
    //Code contributed by Michael Tornatta
    private boolean isJumping;
    private int vSpeed = 0;
    private int jumpingStrength = 16;
    private int acceleration = 1;
    private int frame = 1;
    private int animationCounter = 0;
    //Change the imgae of the profesor to the illustrated one
    //-StephanieLascola
    private GreenfootImage profframe1 = new GreenfootImage("Professor.png");
    private GreenfootImage profframe2 = new GreenfootImage("Professor2.png");
     
    /**
     * Act - do whatever the Professor wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if((Greenfoot.isKeyDown("up") || Greenfoot.isKeyDown("space")) && isJumping == false)
        {
            jump();
        }
        checkIfFalling();
        animation();
        remove();
    } 
    
    public void jump()
    {
        vSpeed = vSpeed - jumpingStrength;
        isJumping = true;
        fall();
    }
    public void checkIfFalling()
    {
        if(onGround())
        {
            vSpeed = 0;
        }
        else
        {
            fall();
        }
    }
    public void fall()
    {
        setLocation(getX(), getY() + vSpeed);
        if(vSpeed <=9)
        {
            vSpeed = vSpeed + acceleration;
        }
        isJumping = true;
    }
    public boolean onGround()
    {
        int spriteHeight = getImage().getHeight();
        int yDistance = (int)(spriteHeight/2) + 5;
        Actor ground = getOneObjectAtOffset(0, getImage().getHeight()/2, Platforms.class);
        if(ground == null)
        {
            isJumping = true;
            return false;
        }
        else
        {
            moveToGround(ground);
            return true;
        }
    }
    public void moveToGround(Actor ground)
    {
        int groundHeight = ground.getImage().getHeight();
        int newY = ground.getY() - (groundHeight + getImage().getHeight())/2;
        setLocation(getX(), newY);
        isJumping = false;
    }
    public void animation()
    {
        if(frame == 1)
        {
            setImage(profframe1);
        }
        else if(frame == 2)
        {
            setImage(profframe2);
            frame = 1;
            return;
        }
        frame ++;
    }
    /**
     * This is being used so when the professor touches the currency, he collects it.
     * In other words, it is being removed from the screen as if he is actually collecting it.
     * -Stephanie Lascola
     */
    public void remove()
    {
    Actor Currency;
    Currency = getOneObjectAtOffset (0, 0, Currency.class);
    if (Currency!=null)
    {
      World world;
      world = getWorld();
      world.removeObject(Currency);
      
    }  
    }
}
