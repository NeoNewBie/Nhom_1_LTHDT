// File: Test.java

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {

        // Khởi tạo đối tượng quản lý theo kiểu Interface IBookManager
        IBookManager ql = new BookManager();
        Scanner scanner = new Scanner(System.in);
        int luaChon;

        // Thêm một vài cuốn sách mẫu để kiểm tra
        ql.themSach(new Textbook("GT01", "Giải tích 1", "Nguyễn Văn A", 2021, 10, 50000, "Toán", "Đại học"));
        ql.themSach(new Novel("TT01", "Doraemon", "Fujiko Fujio", 1995, 50, 75000, "Thiếu nhi", true));

        do {
            System.out.println("\n--- MENU QUẢN LÝ SÁCH ---");
            System.out.println("1. Thêm sách mới (Giáo trình/Tiểu thuyết)");
            System.out.println("2. Hiển thị danh sách sách");
            System.out.println("3. Tìm kiếm sách theo Mã Sách");
            System.out.println("4. Cập nhật Số lượng sách");
            System.out.println("5. Xóa sách theo Mã Sách");
            System.out.println("6. Kiểm tra tồn kho và Cập nhật vị trí (IKiemKe)");
            System.out.println("0. Thoát chương trình");
            System.out.print("Nhập lựa chọn của bạn: ");

            // Xử lý Input
            try {
                luaChon = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                luaChon = -1; // Đặt giá trị không hợp lệ để hiển thị menu lại
            }


            switch (luaChon) {
                case 1:
                    themSachMoi(ql, scanner);
                    break;
                case 2:
                    System.out.println("\n=== HIỂN THỊ DANH SÁCH TẤT CẢ SÁCH ===");
                    ql.hienThiDanhSach();
                    break;
                case 3:
                    timKiemSach(ql, scanner);
                    break;
                case 4:
                    capNhatSoLuong(ql, scanner);
                    break;
                case 5:
                    xoaSach(ql, scanner);
                    break;
                case 6:
                    kiemKeSach(ql, scanner);
                    break;
                case 0:
                    System.out.println("Đã thoát chương trình. Tạm biệt!");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
            }
        } while (luaChon != 0);

        scanner.close();
    }

    // --- CÁC HÀM HỖ TRỢ CHO MENU ---

    private static void themSachMoi(IBookManager ql, Scanner scanner) {
        System.out.println("\n--- THÊM SÁCH MỚI ---");
        System.out.print("Chọn loại sách (1: Giáo trình, 2: Tiểu thuyết): ");
        String loai = scanner.nextLine();

        System.out.print("Mã sách: ");
        String maSach = scanner.nextLine();
        System.out.print("Tiêu đề: ");
        String tieuDe = scanner.nextLine();
        System.out.print("Tác giả: ");
        String tacGia = scanner.nextLine();
        System.out.print("Năm xuất bản: ");
        int namXB = Integer.parseInt(scanner.nextLine());
        System.out.print("Số lượng: ");
        int soLuong = Integer.parseInt(scanner.nextLine());
        System.out.print("Giá cơ bản: ");
        double giaCB = Double.parseDouble(scanner.nextLine());

        if (loai.equals("1")) {
            System.out.print("Môn học: ");
            String monHoc = scanner.nextLine();
            System.out.print("Cấp độ: ");
            String capDo = scanner.nextLine();
            ql.themSach(new Textbook(maSach, tieuDe, tacGia, namXB, soLuong, giaCB, monHoc, capDo));
            System.out.println("Đã thêm Sách Giáo Trình thành công!");
        } else if (loai.equals("2")) {
            System.out.print("Thể loại: ");
            String theLoai = scanner.nextLine();
            System.out.print("Là sách Series (true/false): ");
            boolean laSeries = Boolean.parseBoolean(scanner.nextLine());
            ql.themSach(new Novel(maSach, tieuDe, tacGia, namXB, soLuong, giaCB, theLoai, laSeries));
            System.out.println("Đã thêm Sách Tiểu Thuyết thành công!");
        } else {
            System.out.println("Lựa chọn loại sách không hợp lệ.");
        }
    }

    private static void timKiemSach(IBookManager ql, Scanner scanner) {
        System.out.print("Nhập Mã sách cần tìm: ");
        String maSach = scanner.nextLine();
        Book sach = ql.timKiemSach(maSach);
        System.out.println("\n=== KẾT QUẢ TÌM KIẾM ===");
        if (sach != null) {
            System.out.println(sach);
        } else {
            System.out.println("Không tìm thấy sách với mã: " + maSach);
        }
    }

    private static void capNhatSoLuong(IBookManager ql, Scanner scanner) {
        System.out.print("Nhập Mã sách cần cập nhật số lượng: ");
        String maSach = scanner.nextLine();
        Book sach = ql.timKiemSach(maSach);

        if (sach != null) {
            System.out.print("Nhập Số lượng mới: ");
            int soLuongMoi = Integer.parseInt(scanner.nextLine());
            if (ql.capNhatSoLuong(maSach, soLuongMoi)) {
                System.out.println("Cập nhật số lượng thành công cho sách: " + sach.getTieuDe());
            } else {
                 // Không bao giờ xảy ra nếu sach != null, nhưng để an toàn.
                 System.out.println("Cập nhật số lượng thất bại.");
            }
        } else {
            System.out.println("Không tìm thấy sách để cập nhật.");
        }
    }

    private static void xoaSach(IBookManager ql, Scanner scanner) {
        System.out.print("Nhập Mã sách cần xóa: ");
        String maSach = scanner.nextLine();
        if (ql.xoaSach(maSach)) {
            System.out.println("Đã xóa sách có mã " + maSach + " thành công.");
        } else {
            System.out.println("Không tìm thấy sách để xóa.");
        }
    }
    
    private static void kiemKeSach(IBookManager ql, Scanner scanner) {
        System.out.print("Nhập Mã sách cần kiểm kê/cập nhật vị trí: ");
        String maSach = scanner.nextLine();
        Book sach = ql.timKiemSach(maSach);

        if (sach != null) {
            // 1. kiemTraTonKho
            System.out.print("Nhập số lượng tối thiểu để kiểm tra tồn kho: ");
            int slToiThieu = Integer.parseInt(scanner.nextLine());
            boolean duTonKho = sach.kiemTraTonKho(slToiThieu);
            System.out.println("-> Kiểm tra tồn kho (" + sach.getSoLuong() + " cuốn): " + 
                                (duTonKho ? "Đủ số lượng (" + slToiThieu + ")." : "Không đủ số lượng (" + slToiThieu + ")."));

            // 2. capNhatViTri
            System.out.print("Nhập vị trí mới cho sách: ");
            String viTriMoi = scanner.nextLine();
            sach.capNhatViTri(viTriMoi);
            
        } else {
            System.out.println("Không tìm thấy sách.");
        }
    }
}