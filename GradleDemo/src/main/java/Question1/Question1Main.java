
/*
Look up java plugin documentation. Make changes in manifest to make it executable with correct class.
 When run using java -jar JAR_NAME_HERE the output should be text "Hello World" on the console.
*/
package Question1;
import Question2.Question2Main;
import Question4.Question4Main;

public class Question1Main {

    public static void main(String[] args)
    {
        System.out.println("hello world");
        Question2Main.DisplayContentQuestion2();
        Question4Main.StringUtils();
    }
}
