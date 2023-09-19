import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Student[] arr;
        arr = new Student[5];
        arr[0] = new Student(1, "aman");
        arr[1] = new Student(2, "vaibhav");

        // so on...
        arr[2] = new Student(3, "shikar");
        arr[3] = new Student(4, "dharmesh");
        arr[4] = new Student(5, "mohit");

        // accessing the elements of the specified array
        for (int i = 0; i < arr.length; i++)
            System.out.println("Element at " + i + " : "
                    + arr[i].roll_no + " "
                    + arr[i].name);

    }
}