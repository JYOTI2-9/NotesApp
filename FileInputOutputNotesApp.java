
	
	
	
	
	package FileInputeOuputeNotesApp;

	import java.io.BufferedReader;
	import java.io.FileReader;
	import java.io.FileWriter; // import the correct FileWriter
	import java.io.IOException;

	public class FileInputOutputNotesApp {
	    public static void main(String[] args) {
	        String fileName = "program.txt";

	        // Writing to the file
	        try (FileWriter writer = new FileWriter(fileName)) {
	            writer.write("Java File I/O Example\n");
	            writer.write("1. This is my first note.\n");
	            writer.write("2. Learning Java File I/O.\n");
	            System.out.println("Notes written successfully!");
	        } catch (IOException e) {
	            System.out.println("An error occurred while writing to the file.");
	            e.printStackTrace();
	        }

	        // Reading from the file
	        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
	            String line;
	            System.out.println("\nReading notes from file:");
	            while ((line = reader.readLine()) != null) {
	                System.out.println(line);
	            }
	        } catch (IOException e) {
	            System.out.println("An error occurred while reading from the file.");
	            e.printStackTrace();
	        }
	    }
	}


