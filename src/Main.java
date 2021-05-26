import java.util.ArrayList;
import java.util.Collection;

public class Main {
    public static void main(String[] args) {
        Main.run();
    }

    private static void run() {
        RandomFactory random = new RandomFactory();
        try {
            Student student = random.randomStudent();
            double brokeMain =  Math.random();
            if (brokeMain>0.5) student.setName(null);
        } catch (IllegalArgumentException e){
            e.printStackTrace();
        }
        try {
            deserialize("");
        } catch (MyDomainException e) {
           // e.printStackTrace();
        }

        try {
            deserialize("");
            changeException("");
        } catch (Exception e)  {
            e.printStackTrace();
        } catch (Error error){
            error.printStackTrace();
        } finally {
            System.out.println("Good");
        }



    }

    private static Student deserialize(String s) throws MyDomainException {
        throw new MyDomainException();
    }


    private static Student changeException  (String s) throws Error {

        try {
           return deserialize(s);
        } catch (MyDomainException e) {
            throw new Error();
        }
    }

}
