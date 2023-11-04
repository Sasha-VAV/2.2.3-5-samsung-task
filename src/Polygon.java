public class Polygon {
    float[] x, y;
    public Polygon(float[] x, float[] y) {
        this.x=x;
        this.y=y;
    }
    public Polygon(Polygon a){
        this.x=a.x;
        this.y=a.y;
    }
    public void draw() {
        System.out.println("x={"+x[0]+","+x[1]+","+x[2]+","+x[3]+"},"+"y={"+y[0]+","+y[1]+","+y[2]+","+y[3]+"}");
    }
    public void rotate(float deg) {
        for (int i=0;i<4;i++){
            x[i]+=deg;
            y[i]+=deg;
        }
    }
}