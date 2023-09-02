import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Wordie{
/**
 * Fucntion to read in file given by user. 
 */
void inputFile(){   

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

}

/**
 * Function to count words in document.
 */
int wordCount(){

    return 0;
}

/**
 * Counting and storing characters in a 3d array.
 */
int charCount(){
    
    return 0;
}

/**
 * Function to display the results of the program.
 */
void displayResults(){
  
}

/**
 * Function to create a txt file with results
 */
void createResults(){

}




public static void main(String args[]){

        //take in file
        inputFile();

        //run word count

        //count characters

        //store chracters in 3d array

        //display results

        //create txt file with results

    }

}