public class Test {
    public static void main(String[] args) {
        Book sach1 = new Book("B001", "Lap Trinh Java", "Nguyen Duc Tai", 2025, 100);
        Book sach2 = new Book();
        sach2.setMaSach("B002");
        sach2.setTieuDe("Co So Du Lieu");
        sach2.setTacGia("Le Anh Quoc");
        sach2.setNamXuatBan(2025);
        sach2.setSoLuong(500);
        System.out.println("Danh Sach Sach Trong Thu Vien");
        sach1.hienThiThongTin();
        sach2.hienThiThongTin();
    }
}
