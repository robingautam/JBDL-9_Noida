public class Building {
    int height;
    int area;
    int floors;
    int rooms;
    String address;

    static String staticField;


    public boolean equals(Object object){
        Building that = (Building) object;
        return this.height==that.height && this.area==that.area && this.floors==that.floors &&this.rooms==that.rooms;
    }

    public String toString(){
        String data = "Height = "+this.height+", area="+this.area+", floors="+this.floors;
        return data;
    }
}
