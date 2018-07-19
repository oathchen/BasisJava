package learn.jvm;



 class SSClass{
	
	static {
		System.out.println("SSClass class load");
	}
	
	public static String value = "SSClass_Value";
	
	public SSClass() {
		System.out.println("SSClass instance init");
	}
	
}


 class SClass extends SSClass{
	static {
		System.out.println("SClass class load");
	}
	
	public static String value = "SClass_Value";
	
	public SClass() {
		System.out.println("SClass instance init");
	}
}

class SubClass extends SClass{
	static {
		System.out.println("SubClass class load");
	}

	public static String value = "SubClass_Value";
	
	public SubClass() {
		System.out.println("SubClass instance init");
	}
}



public class TestClassLoad {

	public static void main(String args[]) {
//		SubClass subClass = new SubClass();
//		System.out.println(SubClass.value);
		SubClass[] ss = new SubClass[10];
		
	}
}
