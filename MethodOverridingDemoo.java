class Departement{
void run(){
System.out.println("Bca is a computer science Departement");
}
}
class Css extends Departement{
@Override
void run(){
System.out.println("Css is another Departement");
}
}
public class
MethodOverridingDemoo{
public static void main(String[] args){
Departement d = new Departement();
d.run();
Css a = new Css();
a.run();
Departement obj = new Css();
obj.run();
}
}
