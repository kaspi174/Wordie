import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.FileReader;

public class Wordie{

public static void main(String args[]){

     String line;
     int count = 0;

       try {
        File myObj = new File("filename.txt");
        Scanner myReader = new Scanner(myObj);
        while (myReader.hasNextLine()){
            String data = myReader.nextLine();
            System.out.println(data);
        }
        myReader.close();
         }catch(FileNotFoundException e){
        System.out.println("An error occurred.");
        e.printStackTrace();
         }


        //run word count

        //count characters

        //store chracters in 3d array

        //display results

        //create txt file with results

    }

}