package cn.zr.test;
import org.junit.Test;
import cn.zr.beans.BlackPrinter;
import cn.zr.beans.ColorPrinter;
import cn.zr.beans.Printer;

public class TestPrint {
	//Printer printer = new Printer();
	
	//对象交给容器创建
	private Printer printer;
	
	//接口类型的属性
	private Printer blackPrinter;
	private Printer colorPrinter;
	
	//构造方法注入
	public TestPrint() {
		super();
	}
	
	public TestPrint(Printer blackPrinter, Printer colorPrinter) {
		super();
		this.blackPrinter = blackPrinter;
		this.colorPrinter = colorPrinter;
	}
	

	//getter/setter方法
	public Printer getBlackPrinter() {
		return blackPrinter;
	}

	public void setBlackPrinter(Printer blackPrinter) {
		this.blackPrinter = blackPrinter;
	}

	public Printer getColorPrinter() {
		return colorPrinter;
	}

	public void setColorPrinter(Printer colorPrinter) {
		this.colorPrinter = colorPrinter;
	}


	//创建调用IoC容器
	//ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
	
	/*@Test
	public void test(){
		//从IoC容器中获取需要的bean，根据bean 定义的id获取
		printer = (Printer) ac.getBean("printer");
		
		//printer.setContent("打印我的成绩！");
		printer.print();
	}*/
	
	
	
	@Test
	public void testPrinter(){
		//通过多态特性实现对数据的访问
		printer = new BlackPrinter();
		this.printer(printer, "黑白");
		
		printer = new ColorPrinter();
		this.printer(printer, "彩色");
		
		//使用IoC注入的方式实现对数据的访问
		/*printer = (Printer) ac.getBean("blackPrinter");
		this.printer(printer, "黑白");
		printer = (Printer) ac.getBean("colorPrinter");
		this.printer(printer, "彩色");*/
		
		this.printer(blackPrinter, "黑白");
		this.printer(colorPrinter, "彩色");
		System.out.println(((ColorPrinter)colorPrinter).getPrice());
	}
	
	//打印机打印内容的方法
	public void printer(Printer printer,String content){
		printer.print(content);
	}
	
}
