import java.util.ArrayList;

public class BookManager implements IQuanLySach {
    private ArrayList<Book> danhSachSach;

    public BookManager() {
        this.danhSachSach = new ArrayList<>();
    }

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
        for (Book sach : danhSachSach) {
            if (sach.getMaSach().equalsIgnoreCase(maSach)) {
                return sach;
            }
        }
        return null;
    }

    @Override
    public boolean capNhatSoLuong(String maSach, int soLuongMoi) {
        Book sach = timKiemSach(maSach);
        if (sach != null) {
            sach.setSoLuong(soLuongMoi);
            return true;
        }
        return false;
    }

    @Override
    public void hienThiDanhSachSach() {
        if (danhSachSach.isEmpty()) {
            System.out.println("Danh sách trống!");
        } else {
            danhSachSach.forEach(System.out::println);
        }
    }
}
