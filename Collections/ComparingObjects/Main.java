package Collections.ComparingObjects;

public class Main {
    public static void main(String[] args){
        ComparingObject teja=new ComparingObject(10, 90.09f);
        ComparingObject hemanth=new ComparingObject(11, 80.96f);
        if(teja.compareTo(hemanth)>0){
            System.out.println(teja.compareTo(hemanth));
            System.out.println("Hemanth has more marks ");
        }
    }
}
