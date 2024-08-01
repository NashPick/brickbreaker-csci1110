import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Ball here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ball extends Actor
{   
    // instance variables
    private int dx = 0;
    private int dy = 5;
    
    public Ball(){
        getImage().setColor(Color.RED);
        getImage().fillOval(0,0,15,15);
    }
    /**
     * Act - do whatever the Ball wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        move();
        
        // Always checking to see if the ball is touching the player, a side or a brick
        checkPlayerHit();
        checkBrickHit();
        
    }
    
    private void move(){
        setLocation(getX() + dx, getY() + dx);
    }
    
    private void checkPlayerHit(){
        if (isTouching(Player.class)){
            dy = -dy;
        }
    }
    
    private void checkBrickHit(){
        Brick brick = new Brick();
        
        if (isTouching(Brick.class)){
            dy = -dy;
            getWorld().removeObject(brick);
        }
    }
    
}
