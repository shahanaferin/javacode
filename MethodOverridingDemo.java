class Vehicle{
void run(){
System.out.println("Vehicle is running");
}
}
class Car extends Vehicle{
@Override
void run(){
System.out.println("Car is running safely");
}
}
public class
MethodOverridingDemo{
public static void main(String[] args){
Vehicle v = new Vehicle();
v.run();
Car a = new Car();
a.run();
Vehicle obj = new Car();
obj.run();
}
}
