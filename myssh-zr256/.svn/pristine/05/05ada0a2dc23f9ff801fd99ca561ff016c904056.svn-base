package cn.zr.beans;

public class ColorPrinter implements Printer {

	private String color;
	private Double price;
	
	//构造方法注入（有参+无参）
	public ColorPrinter() {
		super();
	}


	/*public ColorPrinter(String color) {
		super();
		this.color = color;
	}*/

	

	public ColorPrinter(String color, Double price) {
		super();
		this.color = color;
		this.price = price;
	}


	//get/set方法
	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public Double getPrice() {
		return price;
	}


	public void setPrice(Double price) {
		this.price = price;
	}


	//重写接口中的方法
	@Override
	public void print(String content) {
		System.out.println(color+"打印机"+content);
	}

}
