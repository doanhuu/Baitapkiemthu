package BaitoanNgayketiep;
import static org.junit.Assert.*;
import org.junit.Test;
public class NextDayTest {
	@Test
	public void testThangHai(){
		ngayketiep KhongNhuan=new ngayketiep(2014,2,28);
		ngayketiep Nhuan=new ngayketiep(2000,2,29);
		String Test1=KhongNhuan.nextday();
		String Test2=Nhuan.nextday();
		assertEquals("Ngay ke tiep la ngay:1/3/2014",Test1);
		assertEquals("Ngay ke tiep la ngay:1/3/2000",Test2);
	}
	@Test
	public void testThangMuoiHai(){
		ngayketiep nextday=new ngayketiep(2014,12,31);
		String Test=nextday.nextday();
		assertEquals("Ngay ke tiep la ngay:1/1/2015",Test);
	}
	
}
