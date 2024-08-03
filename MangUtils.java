public class MangUtils {
    public int layPhanTuTaiChiSo(int[] mang, int chiSo) {
        if (chiSo < 0 || chiSo >= mang.length) {
            throw new ArrayIndexOutOfBoundsException("Chỉ số nằm ngoài phạm vi");
        }
        return mang[chiSo];
    }
}
