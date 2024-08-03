import java.util.List;

public class TinhTrungBinh {
    public double tinhTrungBinh(List<Integer> danhSach) {
        if (danhSach == null || danhSach.isEmpty()) {
            throw new IllegalArgumentException("Danh sách trống hoặc null");
        }
        return danhSach.stream().mapToInt(Integer::intValue).average().orElse(0.0);
    }
}
