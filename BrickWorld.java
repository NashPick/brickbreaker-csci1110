import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Class for the size of the window for Brick Breaker game.
 * 
 * @author Mitchell Haydar, Ian Sabourin
 * @version 1.1
 */
public class BrickWorld extends World
{

    /**
     * Constructor for objects of class BrickWorld.
     * 
     */
    public BrickWorld()
    {    
        super(600, 600, 1);
        prepare();
    }
    
    
    public void prepare(){
        getBackground().setColor(Color.GRAY);
        getBackground().fill();
        createBrickLayout();
        addObject(new Ball(), 300, 300);
        addObject(new Player(), 300, 550);
    }
    
    public void createBrickLayout(){
        int brickWidth = 50;
        int brickHeight = 20;
        int padding = 12;
        int rows = 10;
        int cols = 7;
        
        for(int i = 0; i < rows;  i++){
            for(int j = 0; j < cols; j++){
                Brick brick = new Brick();
                int x = i * (brickWidth + padding) + (brickWidth /2);
                int y = j * (brickHeight + padding) + (brickHeight / 2);
                addObject(brick, x, y);
            }
        }
    }
}
