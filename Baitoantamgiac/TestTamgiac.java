package Baitoantangiac;
import static org.junit.Assert.*;
import org.junit.Test;
public class TestTamgiac {
	@Test
	public void Tamgiacdeu(){
		tamgiac tamgiac=new tamgiac(2,2,2);
		String Test=tamgiac.LoaiTamGiac();
		assertEquals("Tam giac deu",Test);
	}
	@Test
	public void Tamgiacvuong(){
		tamgiac tamgiac=new tamgiac(3,4,5);
		String Test=tamgiac.LoaiTamGiac();
		assertEquals("Tam giac vuong",Test);
	}
	@Test
	public void Tamgiaccan(){
		tamgiac tamgiac=new tamgiac(6,4,4);
		String Test=tamgiac.LoaiTamGiac();
		assertEquals("Tam giac can",Test);
	}
	@Test 
	public void Tamgiacthuong(){
		tamgiac tamgiac=new tamgiac(2,3,4);
		String Test=tamgiac.LoaiTamGiac();
		assertEquals("Tam giac thuong",Test);
	}
	@Test
	public void khongphaitamgiac(){
		tamgiac tamgiac=new tamgiac(1,3,4);
		String Test=tamgiac.LoaiTamGiac();
		assertEquals("Khong la tam giac",Test);
	}
}
