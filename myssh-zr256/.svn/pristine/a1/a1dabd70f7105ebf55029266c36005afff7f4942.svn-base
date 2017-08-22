package cn.zr.beans;

public class BlackPrinter implements Printer{
	private String color;//颜色
	
	
	public BlackPrinter() {
		super();
	}

	
	public BlackPrinter(String color) {
		super();
		this.color = color;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	//重写接口中的方法
	@Override
	public void print(String content) {
		System.out.println(color+"打印机"+content);
	}
}
