package overs;

public class Overs {
public void f1(int k) {
System.out.println("f1_a");
}
private int f1(double k) {
System.out.println("f1_b");
return 1;
}
public static void main(String[] args) {
Overs t=new Overs();
t.f1(12);
t.f1(1+3.0);
t.f1('a');
t.f1(8.9);
t.f1(8);
}
}