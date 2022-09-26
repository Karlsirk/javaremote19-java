package example.Objects;

public class ObjectExample {
    public String name;

    //Normal constructor
    public ObjectExample(){
        System.out.println("Constructing Object Example");
        name = "Karl Sirkas";
    }

    //Parameterized Constructor
    public static void main(String[] args) {
        ObjectExample2 objectExample2 = new ObjectExample2();


    }
}
