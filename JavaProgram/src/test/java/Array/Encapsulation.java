package Array;

public class Encapsulation {


	String Ename,Edesg;
	int EmpId;
	float Esal;
	//String Edesg;


	public void work() {
		System.out.println(this.Ename +"is working");
	}

	Encapsulation(String Ename, int EmpId,Float Esal, String Edesg)
	{

		this.Ename=Ename;
		this.EmpId=EmpId;
		this.Esal=Esal;
		this.Edesg=Edesg;
	}

}

class Drivercls{
	public static void main(String [] args) {

		//Drivercls obj=new Drivercls("dinga",12,25000,"SDET");
		//System.out.println("ename =" +obj.Ename);
	}



}


