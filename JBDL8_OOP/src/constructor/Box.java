package constructor;

public class Box {
    int height;
    int width;

    // access modifier, return type, method name with arguments

    public Box(int height, int width){
        this.height = height;
        this.width = width;
    }

    public Box(){
        this(3,4);
    }
}