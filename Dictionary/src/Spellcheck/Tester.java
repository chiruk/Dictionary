package Spellcheck;

import java.io.File;
import java.io.FileNotFoundException;


public class Tester {
public static void main(String[] args) throws FileNotFoundException{
	SpellCheck spell=new SpellCheck(new File(args[0]));

	
	System.out.println(spell.checkSpelling("Hello i am sadas sfefdsaa"));
	}
}		 