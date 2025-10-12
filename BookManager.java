import java.util.ArrayList;

public class BookManager {
    private ArrayList<Book> danhSachSach = new ArrayList<>();
    public void themSach(Book book) {
        danhSachSach.add(book);
    }
    public void xoaSach(String maSach) {
        danhSachSach.removeIf(s -> s.getMaSach().equalsIgnoreCase(maSach));
    }
    public void capNhatSach(String maSach, int soLuongMoi) {
        for (Book s : danhSachSach) {
            if (s.getMaSach().equalsIgnoreCase(maSach)) {
                s.setSoLuong(soLuongMoi);
                System.out.println("Da cap nhat so luong sach " + maSach);
                return;
            }
        }
        System.out.println("Khong tim thay sach " + maSach);
    }
    public Book timKiemTheoMa(String maSach) {
        for (Book s : danhSachSach) {
            if (s.getMaSach().equalsIgnoreCase(maSach)) {
                return s;
            }
        }
        return null;
    }
    public void hienThiDanhSach() {
        if (danhSachSach.isEmpty()) {
            System.out.println("Danh sach sach trong!");
        } else {
            System.out.println("=== DANH SACH SACH TRONG THU VIEN ===");
            for (Book s : danhSachSach) {
                System.out.println(s.toString());
            }
        }
    }
}
