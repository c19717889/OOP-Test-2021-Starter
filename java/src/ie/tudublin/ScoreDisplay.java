/*
Name - Alan Murphy
Student Number - C19717889
OOP Labtest - 21/04/21
Lecturer - Dr Bryan Duggan
*/

package ie.tudublin;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.*;

import processing.core.PApplet;
//import processing.data.Table;
//import processing.data.TableRow;

public class ScoreDisplay extends PApplet
{
	//Creating/declaring a new ArrayList that will hold instances of Note class
	//ArrayList<Note> notes = new ArrayList<Note>();


	String score = "DEFGABcd";
	//String str[] = score.split(" , ");
	
	//String score = "D2E2F2G2A2B2c2d2";
	//String score = "DEF2F2F2EFA2A2B2AFD2E2D2D2D2";
	
	public void settings()
	{
		size(1000, 500);

		// How to convert a character to a number
		char c = '7'; // c holds the character 7 (55)
		int i = c - '0'; // i holds the number 7 (55 - 48) 
		println(i);
	}
	

	void loadScore()
	{
	ArrayList<Note> dynamicArray = new ArrayList<Note>(20);
	String[] names = {"A", "B", "C", "D", "E", "F"};
	dynamicArray.addAll("A");
	//dynamicStringArray.addAll(Arrays.asList(names));
	System.out.println("Contents of the dynamicStringArray: " + dynamicArray.toString());
		
		String str[] = score.split("");
		for(int n = 0; n < score.length(); n++)
		{
			System.out.println(str[n]);
		}
	}


	public void setup() 
	{
		colorMode(RGB);
		
		
	}

	public void draw()
	{
		background(255);
		float right = 950;
		float x = 50;
		float y = 250;

		/*stroke(0);
		line(x, y, right, y);
		line(x, y + drop, right, y + drop);
		line(x, y + (drop * 2), right, y + (drop * 2));
		line(x, y + (drop * 3), right, y + (drop * 3));
		line(x, y + (drop * 4), right, y + (drop * 4));*/

		for(int i = 0; i <= 5; i++) {
			stroke(0);
			line(x, (i * x) + y, right, (i * x) + y);
		}

		for(int i = 0; i <= 7; i++)
		{
			
			stroke(0);
			fill(0);
			circle(x + (i* x), y, 20);
			line(x + 10 + (i * x), y, x + 10 + (i * x), 200);
		
		}

		
	}

	void drawNotes()
	{

	}
}
