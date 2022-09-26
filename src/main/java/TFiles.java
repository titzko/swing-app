package tools;


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 * Einfach Textdateien lesen und schreiben.
 *
 * @version 1.0
 * @author rla
 */
public class TFiles {

	/**
 	* Liest eine Textdatei zeilenweise in ein String-Array ein.
 	*
 	* @param fullPath Pfad auf die Textdatei
 	* @return Feld aus den Zeilen der Textdatei
 	*/
	public static String[] readTextFile(String fullPath) {
    	String[] lines = {};
    	Path path = new File(fullPath).toPath();

    	try {
        	lines = Files.readAllLines(path).toArray(lines);
    	} catch (IOException ex) {
        	System.err.println(ex + "\nCan't read file " + fullPath);
    	}
    	return lines;
	}

	/**
 	* Schreibt eine Zeichenkette in eine Textdatei. Falls die Datei schon
 	* vorhanden ist, wird sie ueberschrieben.
 	*
 	* @param fullPath Pfadname auf die Textdatei
 	* @param line Zeichenkette die geschrieben wird
 	* @return true, wenn der Schreibvorgang erfolgreich war
 	*/
	public static boolean writeTextFile(String fullPath, String line) {
    	boolean ok = true;
    	try (BufferedWriter bw = new BufferedWriter(new FileWriter(fullPath))) {
        	bw.write(line);
    	} catch (IOException ex) {
        	System.err.println(ex + "\nCan't write file " + fullPath);
        	ok = false;
    	}
    	return ok;
	}

	/**
 	* Schreibt ein Feld aus Zeichenketten in eine Textdatei. Falls die Datei
 	* schon vorhanden ist, wird sie ueberschrieben.
 	*
 	* @param fullPath Pfadname auf die Textdatei
 	* @param lines Zeichenketten die geschrieben werde
 	* @return true, wenn der Schreibvorgang erfolgreich war
 	*/
	public static boolean writeTextFile(String fullPath, String[] lines) {
    	boolean ok = true;
    	try (BufferedWriter bw = new BufferedWriter(new FileWriter(fullPath))) {
        	for (String line : lines) {
            	bw.write(line);
            	bw.write("\n");
        	}
    	} catch (IOException ex) {
        	System.err.println(ex + "\nCan't write file " + fullPath);
        	ok = false;
    	}
    	return ok;
	}

	// Demoprogramm zum Lesen und Schreiben von Dateien
	public static void main(String... notUsed) {
    	String[] text = {"1. Zeile", "2. Zeile", "3. (letzte) Zeile."};

    	// Text in Datei schreiben
    	boolean ok = TFiles.writeTextFile("src/TestText.txt", text);
    	System.out.println("Testtext wurde geschrieben: " + ok);

    	// Text aus Datei lesen
    	String[] lines = TFiles.readTextFile("src/TestText.txt");
    	for (String line : lines) {
        	System.out.println(line);
    	}
	}
}

