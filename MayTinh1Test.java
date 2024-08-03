import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MayTinh1Test {

    MayTinh1 mayTinh = new MayTinh1();

    // Trường hợp hợp lệ
    @Test
    public void testTichSoDuong() {
        assertEquals(6, mayTinh.tinhTich(2, 3));
    }

    @Test
    public void testTichSoAm() {
        assertEquals(6, mayTinh.tinhTich(-2, -3));
    }

    @Test
    public void testTichSoDuongVaAm() {
        assertEquals(-6, mayTinh.tinhTich(2, -3));
    }

    // Trường hợp biên
    @Test
    public void testTichVoiSo0() {
        assertEquals(0, mayTinh.tinhTich(0, 5));
    }

    @Test
    public void testTichVoiSoMinInt() {
        assertEquals(Integer.MIN_VALUE, mayTinh.tinhTich(Integer.MIN_VALUE, 1));
    }

    @Test
    public void testTichVoiSoMaxInt() {
        assertEquals(Integer.MAX_VALUE, mayTinh.tinhTich(Integer.MAX_VALUE, 1));
    }

    @Test
    public void testTichMinIntVaMaxInt() {
        assertEquals(Integer.MIN_VALUE, mayTinh.tinhTich(Integer.MIN_VALUE, Integer.MAX_VALUE));
    }

    // Phân vùng tương đương
    @Test
    public void testTichSoDuongLon() {
        assertEquals(1000000000, mayTinh.tinhTich(1000000, 1000));
    }

    @Test
    public void testTichSoAmLon() {
        assertEquals(1000000000, mayTinh.tinhTich(-1000000, -1000));
    }

    // Thêm một test mới: Kiểm tra tich khi một trong các số là 1
    @Test
    public void testTichVoiSo1() {
        assertEquals(5, mayTinh.tinhTich(1, 5));
        assertEquals(-5, mayTinh.tinhTich(1, -5));
        assertEquals(5, mayTinh.tinhTich(5, 1));
        assertEquals(-5, mayTinh.tinhTich(-5, 1));
    }
}