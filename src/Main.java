public class Main {
    public static void main(String[] args) {
        float[] x={100,200,200,100},y={100,100,200,200};
        Polygon a = new Polygon(x, y);
        Polygon b = new Polygon(a);
        b.rotate(90.0F);
        a.draw(); b.draw();
    }
}