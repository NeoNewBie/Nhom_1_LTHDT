public interface IQuanLySach {
    void themSach(Book sach);
    boolean xoaSach(String maSach);
    Book timKiemSach(String maSach);
    boolean capNhatSoLuong(String maSach, int soLuongMoi);
    void hienThiDanhSachSach();
}