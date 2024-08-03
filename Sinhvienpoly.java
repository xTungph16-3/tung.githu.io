import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class Sinhvienpoly {
    private List<Sinhvien> sinhviens = new ArrayList<>();

    // Thêm sinh viên
    public void addSinhvien(Sinhvien sv) {
        if (sv.getTenlop() == null || !Pattern.matches("[a-zA-Z0-9 ]+", sv.getTenlop())) {
            throw new IllegalArgumentException("Tên lớp không chứa ký tự đặc biệt");
        }
        sinhviens.add(sv);
    }

    // Tìm kiếm theo mã sinh viên
    public Sinhvien findByMasv(String masv) {
        for (Sinhvien sv : sinhviens) {
            if (sv.getMasv().equals(masv)) {
                return sv;
            }
        }
        return null;
    }

    // Lấy danh sách sinh viên
    public List<Sinhvien> getSinhviens() {
        return sinhviens;
    }
}
