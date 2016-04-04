import java.lang.*;

public class Cell   {

    public boolean isLive;

    public Cell(boolean isLive)   {
        this.isLive = isLive;
    }

    public void draw(int i, int j, int cellSize)    {
        UI.fillrect(i,j,cellSize,cellSize);
    }
}