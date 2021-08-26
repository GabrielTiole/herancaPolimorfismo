package application.abstrato;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.abstrato.Circle;
import entities.abstrato.Rectangle;
import entities.abstrato.Shape;
import entities.abstrato.enums.Color;

public class Program {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		List<Shape> list = new ArrayList<>();

		System.out.print("Enter the number of shapes: ");
		int n = entrada.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println("Shape #" + i + " data:");
			
			System.out.print("Rectangle or Circle (r/c)? ");
			char ch = entrada.next().charAt(0);
			
			System.out.print("Color (BLACK/BLUE/RED): ");
			Color color = Color.valueOf(entrada.next());
			
			if (ch == 'r') {
				System.out.print("Width: ");
				double width = entrada.nextDouble();
				
				System.out.print("Height: ");
				double height = entrada.nextDouble();
				list.add(new Rectangle(color, width, height));
			} else {
				System.out.print("Radius: ");
				double radius = entrada.nextDouble();
				list.add(new Circle(color, radius));
			}
		}

		System.out.println();
		System.out.println("SHAPE AREAS:");
		
		for (Shape shape : list) {
			System.out.println(String.format("%.2f", shape.area()));
		}

		entrada.close();
	}
}
