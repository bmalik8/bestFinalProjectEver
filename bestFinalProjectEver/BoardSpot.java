
/**
 * Each position in the Array for game board
 * 
 * @Basit Malik 
 * v0.0.1
 */
public class BoardSpot
{
    private boolean containsShip;
    private Ship battleShip;
    public BoardSpot(boolean contains, Ship ship)
    {
        containsShip=contains;
        battleShip=ship;
    }
    public Ship getBattleShip()
    {
        return battleShip;
    }
    public boolean getContainsShip()
    {
        return containsShip;
    }
}
