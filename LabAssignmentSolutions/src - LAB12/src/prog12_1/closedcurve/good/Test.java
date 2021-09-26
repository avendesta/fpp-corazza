package prog12_1.closedcurve.good;

public class Test {
	
	public static void main(String[] args) {

		ClosedCurve[] objects = new ClosedCurve[4];
		
		try {
			objects[0]=new Triangle(4,-5,6);
		} catch (IllegalTriangleException e) {
//			System.out.println("An IllegalTriangleException was thrown in a Triangle instance");
			System.out.println(e.getMessage());
		}catch(IllegalClosedCurveException e) {
			System.out.println(e.getMessage());
//			System.out.println("An IllegalClosedCurveException was thrown in a Triangle instance ");
		}
		
		
		try {
			objects[1]=new Square(-3);
		} catch (IllegalClosedCurveException e) {
			System.out.println(e.getMessage());
//			System.out.println("An IllegalClosedCurveException was thrown in a Square instance ");
		}
		
		try {
			objects[2]=new Rectangle(3,-7);
		} catch (IllegalClosedCurveException e) {
			System.out.println(e.getMessage());
//			System.out.println("An IllegalClosedCurveException was thrown in a Rectangle instance ");
		}
		
		try {
			objects[3]=new Circle(-3);
		} catch (IllegalClosedCurveException e) {
			System.out.println(e.getMessage());
//			System.out.println("An IllegalClosedCurveException was thrown in a Circle instance ");
		}
//			
//			{new Triangle(4,5,6),
//								 new Square(3),
//								 new Rectangle(3,7),
//								 new Circle(3)};
		//compute areas
		for(ClosedCurve cc : objects) {
			if(cc == null) continue;
			String nameOfCurve = getClassNameNoPackage(cc.getClass());

			System.out.println("The area of this "+
								nameOfCurve+ 
								" is "+
								cc.computeArea());
							
			}
		
	}
	public static String getClassNameNoPackage(Class aClass){ 
        String fullClassName = aClass.getName();
        int index = fullClassName.lastIndexOf('.');
        String className = null;
        String packageName = null;
        
        
        //in this case, there is no package name
        if(index==-1) {
            return fullClassName;
        }
        else {
				  //for other apps, may be useful to have this
            packageName = fullClassName.substring(0,index);

            className = fullClassName.substring(index+1);
            return className;
        }    
	    	

	}

}
