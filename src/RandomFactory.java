public class  RandomFactory {

    private static final String[] names = {"vasia", "petya", "jake", "masha"};

public Student randomStudent  (){
    String name = names[(int) (Math.random()*names.length)];
    int age = (int) ((Math.random()*125)-25);
    return new Student(name,age);
}
}
