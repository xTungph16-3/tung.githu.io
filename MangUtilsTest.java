import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MangUtilsTest {

    MangUtils mangUtils = new MangUtils();

    @Test
    public void testLayPhanTuTaiChiSo() {
        int[] mang = {10, 20, 30};
        assertEquals(20, mangUtils.layPhanTuTaiChiSo(mang, 1));
    }

    @Test
    public void testLayPhanTuTaiChiSoVuotNgoai() {
        int[] mang = {10, 20, 30};
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> mangUtils.layPhanTuTaiChiSo(mang, 3));
    }

    @Test
    public void testLayPhanTuTaiChiSo0() {
        int[] mang = {10, 20, 30};
        assertEquals(10, mangUtils.layPhanTuTaiChiSo(mang, 0));
    }

    @Test
    public void testLayPhanTuTaiChiSoMax() {
        int[] mang = {10, 20, 30};
        assertEquals(30, mangUtils.layPhanTuTaiChiSo(mang, 2));
    }

    @Test
    public void testLayPhanTuTaiChiSoNhoHon() {
        int[] mang = {10, 20, 30, 40, 50};
        assertEquals(40, mangUtils.layPhanTuTaiChiSo(mang, 3));
    }

    // New test cases

    @Test
    public void testLayPhanTuTaiChiSoAm() {
        int[] mang = {10, 20, 30};
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> mangUtils.layPhanTuTaiChiSo(mang, -1));
    }

    @Test
    public void testLayPhanTuTaiChiSoTrongMangRong() {
        int[] mang = {};
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> mangUtils.layPhanTuTaiChiSo(mang, 0));
    }

    @Test
    public void testLayPhanTuTaiChiSoLonHonDoDaiMang() {
        int[] mang = {10, 20, 30};
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> mangUtils.layPhanTuTaiChiSo(mang, 5));
    }

    @Test
    public void testLayPhanTuTaiChiSoCuoiCung() {
        int[] mang = {10, 20, 30, 40, 50};
        assertEquals(50, mangUtils.layPhanTuTaiChiSo(mang, 4));
    }

    @Test
    public void testLayPhanTuTaiChiSoDauTien() {
        int[] mang = {10, 20, 30, 40, 50};
        assertEquals(10, mangUtils.layPhanTuTaiChiSo(mang, 0));
    }
}
