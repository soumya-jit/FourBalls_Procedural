import processing.core.PApplet;

public class FourBallsProcedural extends PApplet{
    public static final int WIDTH = 640;
    public static final int HEIGHT = 500;
    public static final int DIAMETER = 10;
    public static int x1 = 0, y1 = (int)(HEIGHT * ((float)1 / 5));
    public static int x2 = 0, y2 = (int)(HEIGHT * ((float)2 / 5));
    public static int x3 = 0, y3 = (int)(HEIGHT * ((float)3 / 5));
    public static int x4 = 0, y4 = (int)(HEIGHT * ((float)4 / 5));

    public static void main(String[] args) {
        PApplet.main("FourBallsProcedural", args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void draw() {

        //Ball-1
        ellipse(x1, y1, DIAMETER, DIAMETER);
        x1 += 1;

        //Ball-2
        ellipse(x2, y2, DIAMETER, DIAMETER);
        x2 += 2;

        //Ball-3
        ellipse(x3, y3, DIAMETER, DIAMETER);
        x3 += 3;

        //Ball-4
        ellipse(x4, y4, DIAMETER, DIAMETER);
        x4 += 4;
    }
}
