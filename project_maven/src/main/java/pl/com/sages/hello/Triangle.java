package pl.com.sages.hello;

public class Triangle extends Shape {
    @Override
    void draw(){
        super.draw();
        System.out.println("Of a triangle.");
    }
}
