package pl.imiajd.tatkowski;
import java.awt.*;

public class BetterRectangle extends Rectangle {
    public BetterRectangle(int a, int b, int c, int d)
    {
        super();
        this.setLocation(a, b);
        this.setSize(c, d);
    }

    public double getPerimeter()
    {
        return 2*(this.height + this.width);
    }

    public double getArea()
    {
        return this.height * this.width;
    }
}
