public class Main {
    public static void main(String[] args) {
        Student student1 = new Student(); // create Object with - New
        student1.name = "Avi";
        student1.age = 35;
        System.out.println(student1.name);
        System.out.println(student1.age);
        student1.hello();
    }

    //Create class LapTop:
    // that includes arg:
    // String color
    // float Size
    // String chargerType
    // int butterySize
    // and will include functions:
    // turnOn()  --> print laptop turned on
    // turnOff() --> print laptop turned off
}