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
        for (Book sach : danhSachSach) {
            if (sach.getMaSach().equals(maSach)) {
                danhSachSach.remove(sach);
                return true;
            }
        }
        return false;
    }

    @Override
    public Book timKiemSach(String maSach) {
        for (Book sach : danhSachSach) {
            if (sach.getMaSach().equals(maSach)) {
                return sach;
            }
        }
        return null;
    }

    @Override
    public boolean capNhatSoLuong(String maSach, int soLuongMoi) {
        for (Book sach : danhSachSach) {
            if (sach.getMaSach().equals(maSach)) {
                sach.setSoLuong(soLuongMoi);
                return true;
            }
        }
        return false;
    }

    @Override
    public void hienThiDanhSachSach() {
        for (Book sach : danhSachSach) {
            System.out.println(sach);
        }
    }
}   
