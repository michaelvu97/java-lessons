  import java.util.*;

public class Main {
  public static void main(String[] args) {
    if (args.length < 1)
      throw new IllegalArgumentException("Must specify a lesson to run.");
    
    String lessonName = args[0];

    Main main = new Main();
    main.RunLesson(lessonName);
  }
  
  private void RunLesson(String name) {
    if (name.equals("lesson1")) {
      RunLesson1();
      return;
    }



    throw new IllegalArgumentException("Lesson " + name + " not found");
  }

  private static void RunLesson1(){
    System.out.println("hello World!");
  }
}
