package Bai2;

public class Dog {
	private String name;
	private int MP=100;
	public void InputName(String name)
	{
		this.name=name;
	}
	public void ShowMP()
	{
		System.out.println("MP còn lại: "+MP);
	}
	public void Bark()
	{
		if(name=="")
			System.out.println("Xin lỗi bạn chưa nhập tên!");
		else
		{
			System.out.println(name+" sủa");
			MP=MP-20;
		}
	}
}
