package fileio;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException{
	// vars
        int productNum;
        int productQty;
        String productName;
        double productCost;
        String sourcePath = "C:\\Users\\leram\\Java\\WriteBinaryFileExercise\\src\\fileio\\products.dat";
        File fIn = new File( sourcePath );
        DataInputStream input = new DataInputStream( new BufferedInputStream( new FileInputStream( fIn ) ) );

        System.out.printf("%-14s\t%-14s\t%-8s\t%-8s%n", "Product Number", "Name", "Quantity", "Cost" );
        while(input.available() > 0)
        {
            productNum = input.readInt();
            productName = input.readUTF();
            productQty = input.readInt();
            productCost = input.readDouble();
            System.out.printf("%-14d\t%-14s\t%-8d\t$%-8.2f%n", productNum, productName, productQty, productCost  );
        }
        input.close();
    }
}
