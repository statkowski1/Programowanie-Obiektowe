package pl.imiajd.tatkowski;

public class NazwanyPunkt extends Punkt{

    private String name;

    public NazwanyPunkt(int x, int y) {
        super(x, y);
        this.name = name;
    }

    public void show()
    {
        System.out.println(this.name + ":<" + this.x() + ", " + this.y() + ">");
    }
}
