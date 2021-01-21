
package newpackage1;
public class Square {
    public float edge;
	
	public void displayEdgeLength() {
		System.out.println("Square have edge equal: " + this.edge);
	}
	
	public void displayPerimeter() {
		float perimeter = this.edge * 4;
		System.out.println("Square have perimeter equal: " + perimeter);
	}
	
	public void displayAcreage() {
		float acreage = this.edge * this.edge;
		System.out.println("Square have perimeter equal: " + acreage);
	}

	public void displayAll() {
		displayEdgeLength();
		displayPerimeter();
		displayAcreage();
	}   
}

