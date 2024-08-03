import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SinhvienpolyTest_Find {
    Sinhvienpoly svPoly = new Sinhvienpoly();

    @BeforeEach
    void setUp() {
        svPoly.addSinhvien(new Sinhvien("1", "Nguyen Van A", "L01", "Lop 1", "SV01"));
        svPoly.addSinhvien(new Sinhvien("2", "Nguyen Van B", "L02", "Lop 2", "SV02"));
        svPoly.addSinhvien(new Sinhvien("3", "Nguyen Van C", "L03", "Lop 3", "SV03"));
        // Thêm dữ liệu mẫu bổ sung cho các test cases mới
        svPoly.addSinhvien(new Sinhvien("4", "Nguyen Van D", "L04", "Lop 4", "SV04"));
        svPoly.addSinhvien(new Sinhvien("5", "Nguyen Van E", "L05", "Lop 5", "SV05"));
    }

    @Test
    void testFindByMasv_ExistingMasv() {
        Sinhvien sv = svPoly.findByMasv("SV01");
        assertNotNull(sv, "Sinh viên với mã SV01 không được null");
        assertEquals("Nguyen Van A", sv.getHoten(), "Tên sinh viên không đúng");
    }

    @Test
    void testFindByMasv_NonExistingMasv() {
        Sinhvien sv = svPoly.findByMasv("SV99");
        assertNull(sv, "Sinh viên với mã SV99 phải null");
    }

    @Test
    void testFindByMasv_EmptyMasv() {
        Sinhvien sv = svPoly.findByMasv("");
        assertNull(sv, "Sinh viên với mã trống phải null");
    }

    @Test
    void testFindByMasv_NullMasv() {
        Sinhvien sv = svPoly.findByMasv(null);
        assertNull(sv, "Sinh viên với mã null phải null");
    }

    @Test
    void testFindByMasv_ValidBoundaryMasv() {
        Sinhvien sv = svPoly.findByMasv("SV03");
        assertNotNull(sv, "Sinh viên với mã SV03 không được null");
        assertEquals("Nguyen Van C", sv.getHoten(), "Tên sinh viên không đúng");
    }

    @Test
    void testFindByMasv_ValidMasvWithDifferentLength() {
        Sinhvien sv = svPoly.findByMasv("SV05");
        assertNotNull(sv, "Sinh viên với mã SV05 không được null");
        assertEquals("Nguyen Van E", sv.getHoten(), "Tên sinh viên không đúng");
    }

    @Test
    void testFindByMasv_InvalidFormatMasv() {
        Sinhvien sv = svPoly.findByMasv("12345"); // Mã không hợp lệ
        assertNull(sv, "Sinh viên với mã 12345 phải null");
    }

    @Test
    void testFindByMasv_ValidMasvWithLeadingTrailingSpaces() {
        Sinhvien sv = svPoly.findByMasv(" SV02 "); // Có khoảng trắng ở đầu và cuối
        assertNull(sv, "Sinh viên với mã SV02 có khoảng trắng phải null");
    }

    @Test
    void testFindByMasv_MasvWithSpecialCharacters() {
        Sinhvien sv = svPoly.findByMasv("SV#02"); // Mã có ký tự đặc biệt
        assertNull(sv, "Sinh viên với mã SV#02 phải null");
    }

    @Test
    void testFindByMasv_CaseSensitiveMasv() {
        Sinhvien sv = svPoly.findByMasv("sv01"); // Mã không phân biệt chữ hoa chữ thường
        assertNull(sv, "Sinh viên với mã sv01 phải null");
    }
}
