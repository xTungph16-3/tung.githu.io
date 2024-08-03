import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MayTinhTest {

    MayTinh mayTinh = new MayTinh();

    // Trường hợp hợp lệ
    @Test
    public void testTongSoDuong() {
        assertEquals(5, mayTinh.tinhTong(2, 3));
    }

    @Test
    public void testTongSoAm() {
        assertEquals(-5, mayTinh.tinhTong(-2, -3));
    }

    @Test
    public void testTongSoDuongVaAm() {
        assertEquals(1, mayTinh.tinhTong(3, -2));
    }

    // Trường hợp biên
    @Test
    public void testTongVoiSo0() {
        assertEquals(3, mayTinh.tinhTong(3, 0));
    }

    @Test
    public void testTongVoiSoMinInt() {
        assertEquals(Integer.MIN_VALUE + 1, mayTinh.tinhTong(Integer.MIN_VALUE, 1));
    }

    @Test
    public void testTongVoiSoMaxInt() {
        assertEquals(Integer.MAX_VALUE, mayTinh.tinhTong(Integer.MAX_VALUE - 1, 1));
    }

    @Test
    public void testTongMinIntVaMaxInt() {
        assertEquals(-1, mayTinh.tinhTong(Integer.MIN_VALUE, Integer.MAX_VALUE));
    }

    // Phân vùng tương đương
    @Test
    public void testTongSoDuongLon() {
        assertEquals(1000000000, mayTinh.tinhTong(500000000, 500000000));
    }

    @Test
    public void testTongSoAmLon() {
        assertEquals(-1000000000, mayTinh.tinhTong(-500000000, -500000000));
    }

    // Trường hợp tổng cả hai số bằng 0
    @Test
    public void testTongCuaHaiSoKhong() {
        assertEquals(0, mayTinh.tinhTong(0, 0));
    }
}
