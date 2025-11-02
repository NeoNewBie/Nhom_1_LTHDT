// File: BookManager.java
import java.util.ArrayList;

// Triển khai IQuanLySach
public class BookManager implements IBookManager {
    private ArrayList<Book> danhSachSach = new ArrayList<>();

    @Override
    public void themSach(Book sach) {
        danhSachSach.add(sach);
    }

    @Override
    public boolean xoaSach(String maSach) {
        return danhSachSach.removeIf(s -> s.getMaSach().equalsIgnoreCase(maSach));
    }

    @Override
    public Book timKiemSach(String maSach) {
        for (Book s : danhSachSach) {
            if (s.getMaSach().equalsIgnoreCase(maSach)) return s;
        }
        return null;
    }

    @Override
    public boolean capNhatSoLuong(String maSach, int soLuongMoi) {
        Book s = timKiemSach(maSach);
        if (s != null) {
            s.setSoLuong(soLuongMoi);
            return true;
        }
        return false;
    }

    @Override
    public void hienThiDanhSach() {
        if (danhSachSach.isEmpty())
            System.out.println("Danh sách trống!");
        else
            danhSachSach.forEach(System.out::println);
    }
}