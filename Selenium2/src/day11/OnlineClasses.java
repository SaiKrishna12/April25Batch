package day11;

public class OnlineClasses {

	int fee;
	String course;
	public void courseDetails(int fee,String course)
	{
		this.fee=fee;
		this.course=course;
	}
	public static void main(String[] args) {
		OnlineClasses oc=new OnlineClasses();
		oc.courseDetails(15000,"Selenium");
		System.out.println(oc.fee+"--"+oc.course);
	}

}
