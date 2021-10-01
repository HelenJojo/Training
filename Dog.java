package Training;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Dog {

    String name;
    int age;
    double weight;

    public Dog(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                '}';
    }
    public void show(){
        System.out.println(name +" is waging their tail!!");
    }

    public void show(int levelOfExcitement){
        System.out.println(name+" is wagging their tail! Excitement level: "+levelOfExcitement);
    }

    public void eating(){
        System.out.println(name+" is eating");

    }
    public void eating (String eating){
        System.out.println(name +" is eating "+ eating);
    }

}
class DogTest{
    public static void main(String[] args) {
        Dog d1 = new Dog("Tom",3,20.98);
        Dog d2 = new Dog("GR",37,7);

        System.out.println(d1);
        System.out.println(d2);

        d1.show();
        d1.show(12);

        d1.eating();
        d1.eating("Bone");
    }
}