import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Class for player (paddle) which draws in player and controls movement .
 * 
 * @author Ian Sabourin 
 * @version 1.0
 */
public class Player extends Actor
{
    public Player() {
        getImage().setColor(Color.RED);
        getImage().fillRect(0,0,100,20);
    }
    
    /**
     * Act - do whatever the Player wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        movePlayer();
    }
    
    public void movePlayer()  
    {   
        if (Greenfoot.isKeyDown("left") && this.getX() >= 50)
        {
            move(-4);
        }
        if (Greenfoot.isKeyDown("right") && this.getX() <= 550)
        {
            move(4);
        }
    }
}
