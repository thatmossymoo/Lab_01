import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;
import static java.nio.file.StandardOpenOption.CREATE;

void main()
/*
ID (a String)
FirstName
LastName
Title (a string like Mr., Mrs., Ms., Dr., etc.)
YearOfBirth (an int)
 */
{
    File workingDirectory = new File(System.getProperty("user.dir"));
    Path file = Paths.get(workingDirectory.getPath() + "\\src\\PersonTestData.txt");

    ArrayList<Product> folks = new ArrayList<>();
    Scanner in = new Scanner(System.in);

    boolean done = false;
    String personRec = "";
    String name = "";
    String description = "";
    String ID = "";
    double cost = 0.0;

    do {
        name = SafeInput.getNonZeroLenString(in, "Enter product name");
        description = SafeInput.getNonZeroLenString(in, "Enter product description");
        ID = SafeInput.getNonZeroLenString(in, "Enter product ID");
        cost = SafeInput.getDouble(in, "Enter product price");

        Product product = new Product(cost,name,description,ID);
        folks.add(product);

        done = SafeInput.getYNConfirm(in, "Are you done?");
    }while(!done);

    for(Product p: folks)
        System.out.println(p);

    try
    {
        // Typical java pattern of inherited classes
        // we wrap a BufferedWriter around a lower level BufferedOutputStream
        OutputStream out =
                new BufferedOutputStream(Files.newOutputStream(file, CREATE));
        BufferedWriter writer =
                new BufferedWriter(new OutputStreamWriter(out));

        // Finally can write the file LOL!

        for(Product rec : folks)
        {
            writer.write(rec.toCSV());  // stupid syntax for write rec
            // 0 is where to start (1st char) the write
            // rec. length() is how many chars to write (all)
            writer.newLine();  // adds the new line

        }
        writer.close(); // must close the file to seal it and flush buffer
        System.out.println("Data file written!");
    }
    catch (IOException e)
    {
        e.printStackTrace();
    }
}


