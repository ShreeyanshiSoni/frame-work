package TestNG;
import org.testng.annotations.Test;
public class ten_TC {
	@Test
	public void one(){
		System.out.println("inside one");
	}
	@Test
	public void two(){
		System.out.println(" inside two");
	}
	@Test
	public void three(){
		System.out.println("inside three");
	}
	@Test
	public void four(){
		System.out.println(" inside for");
	}
	@Test
	public void five(){
		System.out.println("inside five which is included");
	}
	@Test
	public void six(){
		System.out.println("inside six which is included");
	}
	@Test
	public void seven(){
		System.out.println("inside three");
	}
	@Test
	public void eight(){
		System.out.println("need to exclude inside three");
	}
	@Test
	public void nine(){
		System.out.println("inside three");
	}
	@Test
	public void ten(){
		System.out.println("need to exclude inside three");
	}
}
