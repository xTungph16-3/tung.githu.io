import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TinhTrungBinhTest {

    TinhTrungBinh tinhTrungBinh = new TinhTrungBinh();

    @Test
    public void testTrungBinhCong() {
        List<Integer> danhSach = Arrays.asList(1, 2, 3, 4, 5);
        assertEquals(3.0, tinhTrungBinh.tinhTrungBinh(danhSach));
    }

    @Test
    public void testTrungBinhCongMotPhanTu() {
        List<Integer> danhSach = Collections.singletonList(10);
        assertEquals(10.0, tinhTrungBinh.tinhTrungBinh(danhSach));
    }

    @Test
    public void testTrungBinhCongDanhSachTrong() {
        assertThrows(IllegalArgumentException.class, () -> tinhTrungBinh.tinhTrungBinh(Collections.emptyList()));
    }

    @Test
    public void testTrungBinhCongDanhSachNull() {
        assertThrows(IllegalArgumentException.class, () -> tinhTrungBinh.tinhTrungBinh(null));
    }

    @Test
    public void testTrungBinhCongSoAm() {
        List<Integer> danhSach = Arrays.asList(-1, -2, -3, -4, -5);
        assertEquals(-3.0, tinhTrungBinh.tinhTrungBinh(danhSach));
    }

    @Test
    public void testTrungBinhCongSoLon() {
        List<Integer> danhSach = Arrays.asList(1000000, 2000000, 3000000);
        assertEquals(2000000.0, tinhTrungBinh.tinhTrungBinh(danhSach));
    }

    @Test
    public void testTrungBinhCongSoAmVaDuong() {
        List<Integer> danhSach = Arrays.asList(-1, -2, 3, 4);
        assertEquals(1.0, tinhTrungBinh.tinhTrungBinh(danhSach));
    }

    @Test
    public void testTrungBinhCongSoKhong() {
        List<Integer> danhSach = Arrays.asList(0, 0, 0, 0, 0);
        assertEquals(0.0, tinhTrungBinh.tinhTrungBinh(danhSach));
    }

    @Test
    public void testTrungBinhCongSoLapLai() {
        List<Integer> danhSach = Arrays.asList(5, 5, 5, 5, 5);
        assertEquals(5.0, tinhTrungBinh.tinhTrungBinh(danhSach));
    }

    @Test
    public void testTrungBinhCongSoDuongAmKhong() {
        List<Integer> danhSach = Arrays.asList(-5, 0, 5);
        assertEquals(0.0, tinhTrungBinh.tinhTrungBinh(danhSach));
    }
}
