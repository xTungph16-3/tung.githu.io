import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MayTinh2Test {

    MayTinh2 mayTinh = new MayTinh2();

    // Trường hợp hợp lệ
    @Test
    public void testHieuSoDuong() {
        assertEquals(1, mayTinh.tinhHieu(5, 4));
    }

    @Test
    public void testHieuSoAm() {
        assertEquals(1, mayTinh.tinhHieu(-4, -5));
    }

    @Test
    public void testHieuSoDuongVaAm() {
        assertEquals(9, mayTinh.tinhHieu(5, -4));
    }

    // Trường hợp biên
    @Test
    public void testHieuVoiSo0() {
        assertEquals(5, mayTinh.tinhHieu(5, 0));
    }

    @Test
    public void testHieuMinIntVaMaxInt() {
        assertEquals(0, mayTinh.tinhHieu(Integer.MIN_VALUE, Integer.MIN_VALUE));
    }

    // Phân vùng tương đương
    @Test
    public void testHieuSoDuongLon() {
        assertEquals(1000000, mayTinh.tinhHieu(1000000, 0));
    }

    @Test
    public void testHieuSoAmLon() {
        assertEquals(-1000000, mayTinh.tinhHieu(0, 1000000));
    }

    // Kiểm tra hiệu khi hai số bằng nhau
    @Test
    public void testHieuHaiSoBangNhau() {
        assertEquals(0, mayTinh.tinhHieu(100, 100));
    }

    // Kiểm tra hiệu khi a lớn hơn b
    @Test
    public void testHieuALonHonB() {
        assertEquals(3, mayTinh.tinhHieu(7, 4));
    }

    // Kiểm tra hiệu khi a nhỏ hơn b
    @Test
    public void testHieuANhoHonB() {
        assertEquals(-3, mayTinh.tinhHieu(4, 7));
    }
}
