import java.util.ArrayList;

public class BookManager {
    private ArrayList<Book> danhSachSach = new ArrayList<>();

    public void themSach(Book sach) {
        danhSachSach.add(sach);
    }

    public boolean xoaSach(String maSach) {
        return danhSachSach.removeIf(s -> s.getMaSach().equalsIgnoreCase(maSach));
    }

    public Book timKiemSach(String maSach) {
        for (Book s : danhSachSach) {
            if (s.getMaSach().equalsIgnoreCase(maSach)) return s;
        }
        return null;
    }

    public boolean capNhatSoLuong(String maSach, int soLuongMoi) {
        Book s = timKiemSach(maSach);
        if (s != null) {
            s.setSoLuong(soLuongMoi);
            return true;
        }
        return false;
    }

    public void hienThiDanhSach() {
        if (danhSachSach.isEmpty()) 
            System.out.println("Danh sách trống!");
        else 
            danhSachSach.forEach(System.out::println);
    }
}
