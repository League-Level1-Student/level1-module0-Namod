package _11_spinning_record;

import java.util.Set;

public class spinningrecord {
	public static void main(String[] args) {
		int x = 0;
		int y = 0;
		
		PImage pictureOfRecord;     //as member variable
		size(600,600);     //in setup method
		pictureOfRecord= loadImage("record.jpg");
		image(pictureOfRecord, x, y);     //in draw method
		
	}
}
