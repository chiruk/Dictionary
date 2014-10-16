package Spellcheck;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class SpellCheck {
	
		
		private ArrayList<String> dictionary;
		
		/**
		 * This is the constructor of the SpellCheck, it takes the dictionary file.
		 * @param file The dictionary file.
		 * @throws FileNotFoundException
		 */
		public SpellCheck(File file) throws FileNotFoundException{
			
			Scanner scan=new Scanner(file);
			dictionary=new ArrayList<String>();
			while(scan.hasNext())
				dictionary.add(scan.next());
			
			scan.close();
				
		}
		
		/**
		 * This is the method that actually does the spellchecking.
		 * @param check The string to check.
		 * @return The mispelled words.
		 */
		public ArrayList<String> checkSpelling(String check){
			
			Scanner scan=new Scanner(check);
			ArrayList<String> misspelledWords=new ArrayList<String>();
			
			checkSpelling(scan,misspelledWords);
			
			scan.close();
			
			return misspelledWords;
		}	
		/**
		 * Checks the spellign of a text file/
		 * @param file The text file
		 * @return mispelled words
		 * @throws FileNotFoundException
		 */
		public ArrayList<String> checkSpelling(File file) throws FileNotFoundException{
			Scanner scan=new Scanner(file);
			ArrayList<String> mis=new ArrayList<String>();

			checkSpelling(scan,mis);
			
			scan.close();
			return mis;
			
		}
		
		/**Checks the spelling
		 * @param scan The scanner to be used.
		 * @param arr The arraylist of mispelled words.
		 */ 
		private void checkSpelling(Scanner scan, ArrayList<String> arr){
			while(scan.hasNext()){
				String s=scan.next();
				if(dictionary.lastIndexOf(s.toLowerCase())==-1)
					if(!s.equals("i") && !s.equals("I"))
					arr.add(s);
			}

		}
}
