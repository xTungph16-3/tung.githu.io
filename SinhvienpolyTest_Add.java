import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class SinhvienpolyTest_Add {
    Sinhvienpoly svPoly = new Sinhvienpoly();

    @Test
    void testAddSinhvien_ValidData() {
        Sinhvien sv = new Sinhvien("1", "Nguyen Van A", "L01", "Lop 1", "SV01");
        svPoly.addSinhvien(sv);
        assertEquals(1, svPoly.getSinhviens().size(), "Danh sách sinh viên nên có 1 phần tử");
    }

    @Test
    void testAddSinhvien_InvalidTenlop() {
        Exception exception = assertThrows(IllegalArgumentException.class, () ->
                svPoly.addSinhvien(new Sinhvien("2", "Nguyen Van B", "L02", "Lop@2", "SV02")));
        assertEquals("Tên lớp không chứa ký tự đặc biệt", exception.getMessage());
    }

    @Test
    void testAddSinhvien_EmptyTenlop() {
        Exception exception = assertThrows(IllegalArgumentException.class, () ->
                svPoly.addSinhvien(new Sinhvien("3", "Nguyen Van C", "L03", "", "SV03")));
        assertEquals("Tên lớp không chứa ký tự đặc biệt", exception.getMessage());
    }

    @Test
    void testAddSinhvien_SpecialCharacterInTenlop() {
        Exception exception = assertThrows(IllegalArgumentException.class, () ->
                svPoly.addSinhvien(new Sinhvien("4", "Nguyen Van D", "L04", "Lop*4", "SV04")));
        assertEquals("Tên lớp không chứa ký tự đặc biệt", exception.getMessage());
    }

    @Test
    void testAddSinhvien_NullTenlop() {
        Exception exception = assertThrows(IllegalArgumentException.class, () ->
                svPoly.addSinhvien(new Sinhvien("5", "Nguyen Van E", "L05", null, "SV05")));
        assertEquals("Tên lớp không chứa ký tự đặc biệt", exception.getMessage());
    }

    @Test
    void testAddSinhvien_MultipleValidEntries() {
        svPoly.addSinhvien(new Sinhvien("6", "Nguyen Van F", "L06", "Lop 6", "SV06"));
        svPoly.addSinhvien(new Sinhvien("7", "Nguyen Van G", "L07", "Lop 7", "SV07"));
        assertEquals(2, svPoly.getSinhviens().size(), "Danh sách sinh viên nên có 2 phần tử");
    }

    @Test
    void testAddSinhvien_ValidBoundaryData() {
        Sinhvien sv = new Sinhvien("8", "Nguyen Van H", "L08", "Lop 8", "SV08");
        svPoly.addSinhvien(sv);
        assertEquals(1, svPoly.getSinhviens().size(), "Danh sách sinh viên nên có 1 phần tử");
        assertEquals("SV08", svPoly.getSinhviens().get(0).getMasv(), "Mã sinh viên phải là SV08");
    }

    @Test
    void testAddSinhvien_ValidDataMultipleTimes() {
        for (int i = 1; i <= 10; i++) {
            svPoly.addSinhvien(new Sinhvien(String.valueOf(i), "Nguyen Van " + i, "L" + i, "Lop " + i, "SV" + String.format("%02d", i)));
        }
        assertEquals(10, svPoly.getSinhviens().size(), "Danh sách sinh viên nên có 10 phần tử sau khi thêm 10 sinh viên");
    }

    @Test
    void testAddSinhvien_SpecialCharactersInTenlop() {
        Exception exception = assertThrows(IllegalArgumentException.class, () ->
                svPoly.addSinhvien(new Sinhvien("9", "Nguyen Van I", "L09", "Lop #9", "SV09")));
        assertEquals("Tên lớp không chứa ký tự đặc biệt", exception.getMessage());
    }

    @Test
    void testAddSinhvien_ValidDataWithMaxLength() {
        Sinhvien sv = new Sinhvien("10", "Nguyen Van J", "L10", "Lop 10 with max length of class name", "SV10");
        svPoly.addSinhvien(sv);
        assertEquals(1, svPoly.getSinhviens().size(), "Danh sách sinh viên nên có 1 phần tử");
        assertEquals("SV10", svPoly.getSinhviens().get(0).getMasv(), "Mã sinh viên phải là SV10");
    }

}
