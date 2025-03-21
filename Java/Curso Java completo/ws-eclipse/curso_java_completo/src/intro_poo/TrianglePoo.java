package intro_poo;

public class TrianglePoo {
	public double a,b,c;
	
	public double areaTriangulo() {
		double p = (a+b+c)/2;
		double area = Math.sqrt(p*(p-a)*(p-b)*(p-c));
		return area;
	}

}






