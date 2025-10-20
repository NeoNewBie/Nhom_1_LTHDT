public class Test {
    public static void main(String[] args) {
        
        /*Book sach1 = new Book("B001", "Lap Trinh Java", "Nguyen Duc Tai", 2025, 100);
        Book sach2 = new Book();
        sach2.setMaSach("B002");
        sach2.setTieuDe("Co So Du Lieu");
        sach2.setTacGia("Le Anh Quoc");
        sach2.setNamXuatBan(2025);
        sach2.setSoLuong(500);
        System.out.println("Danh Sach Sach Trong Thu Vien");
        sach1.hienThiThongTin();
        sach2.hienThiThongTin();*/
        BookManager ql = new BookManager();
        // Thêm sách
        ql.themSach(new Textbook("LTHDT01", "Lap trinh huong doi tuong", "Nguyen Van A", 2021, 10, "Toan", "Dai hoc",100000));
        ql.themSach(new Novel("TT01", "Mat Biec", "Nguyen Nhat Anh", 1995, 50, "tieu thuyet", true,120000));
        /* // Hiển thị
        System.out.println("=== Danh sách sách ===");
        ql.hienThiDanhSach();
        // Tìm kiếm
        System.out.println("\n=== Find TT01 ===");
        System.out.println(ql.timKiemSach("TT01"));
        // Cập nhật
        ql.capNhatSoLuong("GT01", 20);
        System.out.println("\n=== Sau khi Update GT01 ===");
        ql.hienThiDanhSach();
        // Xóa
        ql.xoaSach("TT01");
        System.out.println("\n=== Sau khi xóa TT01 ===");
        ql.hienThiDanhSach();*/
        // Hiển thị danh sách sách và giá bán
        System.out.println("=== Danh sách sách ===");
        ql.hienThiDanhSachSach();
        // Kiểm thử giao diện IKiemKe
        System.out.println("=== Kiem thu giao dien IKiemKe ===");
        IKiemKe kiemKe = new Textbook("GT02", "Ly thuyet do thi", "Tran Van B", 2022, 200, "Tin học", "Cao học", 150000);
        System.out.println("Du ton kho ≥ 100 ? " + kiemKe.kiemTraTonKho(100));
        kiemKe.capNhatViTri("Kho A1 - Ke 5");
    }
}