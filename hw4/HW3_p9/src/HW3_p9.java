
public class HW3_p9 
{
	public static void main (String[] args)
	{
		Car car1;
		car1=new Car();
		
		car1.num = 1324;
		car1.gas = 21.5;
		
	}
}


class Car
{
	int num;
	double gas;
	
	void show()
	{
		System.out.println("�����O"+num);
		System.out.println("�T�o�q�O"+gas);
	}

}

