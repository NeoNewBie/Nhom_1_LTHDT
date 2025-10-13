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
        ql.themSach(new Textbook("GT01", "Giải tích 1", "Nguyễn Văn A", 2021, 10, "Toán", "Đại học"));
        ql.themSach(new Novel("TT01", "Doraemon", "Fujiko Fujio", 1995, 50, "Thiếu nhi", true));

        // Hiển thị
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
        ql.hienThiDanhSach();
    }
}
