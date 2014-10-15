package Spellcheck;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;

public class Tester {
public static void main(String[] args) throws FileNotFoundException{
	SpellCheck spell=new SpellCheck(new File(args[0]));

	
	System.out.println(spell.checkSpelling("Hello i suchsasc at spewkwe"));
	}
}