import java.util.Scanner;
public class Test {
    public static void main(String[] args) {
        IQuanLySach quanLy = new BookManager();
        Scanner sc = new Scanner(System.in);
        int chon;

        do {
            System.out.println("\n===== MENU QUAN LY SACH =====");
            System.out.println("1. Them giao trinh sach");
            System.out.println("2. Them sach tieu thuyet");
            System.out.println("3. Hien thi danh sach sach");
            System.out.println("4. Tim kiem sach");
            System.out.println("5. Xoa sach");
            System.out.println("0. Thoat");
            System.out.print("Chon: ");
            chon = sc.nextInt();
            sc.nextLine();

            switch (chon) {
                case 1:
                    System.out.print("Ma sach: "); String ma1 = sc.nextLine();
                    System.out.print("Tieu de: "); String td1 = sc.nextLine();
                    System.out.print("Tac gia: "); String tg1 = sc.nextLine();
                    System.out.print("Nam XB: "); int nam1 = sc.nextInt();
                    System.out.print("So luong: "); int sl1 = sc.nextInt();
                    System.out.print("Gia co ban: "); double g1 = sc.nextDouble(); sc.nextLine();
                    System.out.print("Mon hoc: "); String mh = sc.nextLine();
                    System.out.print("Cap do: "); String cd = sc.nextLine();
                    quanLy.themSach(new Textbook(ma1, td1, tg1, nam1, sl1, mh, cd, g1));
                    break;

                case 2:
                    System.out.print("Ma sach: "); String ma2 = sc.nextLine();
                    System.out.print("Tieu de: "); String td2 = sc.nextLine();
                    System.out.print("Tac gia: "); String tg2 = sc.nextLine();
                    System.out.print("Nam XB: "); int nam2 = sc.nextInt();
                    System.out.print("So luong: "); int sl2 = sc.nextInt();
                    System.out.print("Gia co ban: "); double g2 = sc.nextDouble(); sc.nextLine();
                    System.out.print("The loai: "); String tl = sc.nextLine();
                    System.out.print("Co phai series (true/false): "); boolean sr = sc.nextBoolean();
                    quanLy.themSach(new Novel(ma2, td2, tg2, nam2, sl2, tl, sr, g2));
                    break;

                case 3:
                    quanLy.hienThiDanhSachSach();
                    break;

                case 4:
                    System.out.print("Nhap ma sach can tim: ");
                    String maTim = sc.nextLine();
                    Book kq = quanLy.timKiemSach(maTim);
                    System.out.println(kq != null ? kq : "Khong tim thay!");
                    break;

                case 5:
                    System.out.print("hap ma sach can xoa: ");
                    String maXoa = sc.nextLine();
                    if (quanLy.xoaSach(maXoa))
                        System.out.println("Xoa thanh cong!");
                    else
                        System.out.println("Khong tim thay sach!");
                    break;

                case 0:
                    System.out.println("Ket thuc chuong trinh.");
                    break;

                default:
                    System.out.println("Lua chon khong hop le!");
            }

        } while (chon != 0);
    }
}
