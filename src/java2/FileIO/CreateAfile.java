package java2.FileIO;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;
import java.util.Scanner;

/**
 * Created by bichtran on 5/25/17.
 */
public class CreateAfile {
    public static void main(String[] args) throws IOException {
        String userInput = null;
        Path dataFile;
        Scanner keyBoard = new Scanner(System.in);
        int menuOption;
        String directory = "data";
        String filename = "contact.txt";
        Path dataDirectory = Paths.get(directory);
        dataFile = Paths.get(directory, filename);

        if (Files.notExists(dataDirectory)) {
            Files.createDirectories(dataDirectory);
            System.out.println("Directory data created!");

        }
        if (!Files.exists(dataFile)) {
            Files.createFile(dataFile);
            System.out.println("Empty file contact.txt created!");
        }


            List<String> lines = Files.readAllLines(dataFile);  //lines contains info from the contact.txt
            do {
            /* Menu option */
                System.out.printf("menu:\n1. View contact \n2. Add a new contact \n3. Search a contact by name\n" +
                        "4. Delete an existing contact\n 5. Exit\n");
                System.out.println("Enter Option (1,2,3,4,,or 5)");
                menuOption = keyBoard.nextInt();
                keyBoard.nextLine();

                switch (menuOption) {
                    case 1: viewContact(lines);

                        break;
                    case 2:   //Add a new contat
                        System.out.println("Please enter first and last name & Phone number ");
                        userInput = keyBoard.nextLine();
                        lines.add(userInput);

                        break;
//                Search for user in the list
                    case 3:
                    searchContact(keyBoard,lines);
                 break;
                    case 4:
                        int toRemove = 0;
                        System.out.println("Contact to remove from your contact.");
                        userInput = keyBoard.nextLine();
                        for (String line : lines) {
                            if (line.contains(userInput)) {
                                System.out.println(line);
                                toRemove = lines.indexOf(line);
                            }
                        }
                        System.out.println("Index:  " + toRemove);
                        lines.remove(toRemove);

                        break;
                    case 5:
//The options parameter specifies how the the file is created or opened. If no options are present then this method
// works as if the CREATE, TRUNCATE_EXISTING, and WRITE options are present. In other words,
// it opens the file for writing, creating the file if it doesn't exist, or initially truncating an existing
// regular-file to a size of 0
                        Files.write(dataFile, lines);
                              //  StandardOpenOption.CREATE,
                              //  StandardOpenOption.TRUNCATE_EXISTING );
                       // Files.write(dataFile,lines, StandardOpenOption.APPEND);

                        System.exit(0);
                }

            } while (true);


        }

    private static void searchContact(Scanner keyBoard, List<String> lines) {

        System.out.println("Enter the name or phone number to search");
        String userInput = keyBoard.nextLine();
        //iterate >> array: lines
        for (String line : lines) {
            System.out.println(line);
            if (line.contains(userInput)) {
                System.out.println("Contact name + number: " + line);
            }
        }

    }
    static void viewContact(List<String> lines){


        for (String line1 : lines) {
            String[] output = line1.split(",");
      //System.out.print("Longueur:   "+output.length+"...");
            System.out.printf("%-25s", output[0]);
            System.out.print("|");
            System.out.printf("%-15s\n", output[1]);
        }

    }

}
