package Collections.ComparingObjects;
import java.util.*;
public class ComparingObject implements Comparable<ComparingObject>{
    int rollno;
    float marks;

    public ComparingObject(int rollno,float marks){
        this.rollno=rollno;
        this.marks=marks;
    }
    @Override
    public int compareTo(ComparingObject o){
        int diff=(int)(this.marks-o.marks);
        return diff;
    }
}
