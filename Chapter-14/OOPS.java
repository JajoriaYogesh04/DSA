public class OOPS {
    public static void main(String args[]){
        Pen p1 = new Pen();
        p1.setColor("Red");
        // System.out.println(p1.color);
        System.out.println(p1.getColor());
        p1.setTip(7);
        // System.out.println(p1.tip);
        System.out.println(p1.getTip());
        // p1.tip= 4;
        // System.out.println(p1.tip);
        p1.setTip(4);
        System.out.println(p1.getTip());
    }
}

class Pen{
    private String color;
    private int tip;
    String getColor(){
        return this.color;
    }
    int getTip(){
        return this.tip;
    }
    void setColor(String newColor){
        color= newColor;
    }
    void setTip(int newTip){
        tip= newTip;
    }
}
