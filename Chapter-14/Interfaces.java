public class Interfaces {
    public static void main(String args[]){
        Queen q1= new Queen();
        q1.moves();

        Bear b1= new Bear();
        b1.grass();
        b1.meat();
    }
}

interface ChessPlayer{
    void moves();
}
class Queen implements ChessPlayer{
    public void moves(){
        System.out.println("Left, Right, Up, Down, Diagonal");
    }
}
class Rook implements ChessPlayer{
    public void moves(){
        System.out.println("Left, Right, Up, Down");
    }
}
class King implements ChessPlayer{
    public void moves(){
        System.out.println("Left, Right, Up, Down (By 1 Step)");
    }
}

interface Herbivore{
    void grass();
}
interface Carnivore{
    void meat();
}
class Bear implements Herbivore, Carnivore{
    public void grass(){
        System.out.println("Bear Eat Grass");
    }
    public void meat(){
        System.out.println("Bear Eat Meat");
    }
}