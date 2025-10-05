import java.util.Scanner;

public class TestSach {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Nhập thông tin sách từ bàn phím
        System.out.print("Nhập mã sách: ");
        String maSach = sc.nextLine();

        System.out.print("Nhập tiêu đề: ");
        String tieuDe = sc.nextLine();

        System.out.print("Nhập tác giả: ");
        String tacGia = sc.nextLine();

        System.out.print("Nhập năm xuất bản: ");
        int namXuatBan = sc.nextInt();

        System.out.print("Nhập số lượng: ");
        int soLuong = sc.nextInt();

        // Tạo đối tượng sách bằng constructor có tham số
        Sach sach1 = new Sach(maSach, tieuDe, tacGia, namXuatBan, soLuong);

        // Hiển thị thông tin sách
        sach1.hienThiThongTin();

        // Tạo thêm sách bằng constructor không tham số + setter
        Sach sach2 = new Sach();
        sach2.setMaSach("B002");
        sach2.setTieuDe("Java OOP");
        sach2.setTacGia("Nguyễn Văn A");
        sach2.setNamXuatBan(2024);
        sach2.setSoLuong(5);

        // Hiển thị sách thứ 2
        sach2.hienThiThongTin();

        sc.close();
    }
}
