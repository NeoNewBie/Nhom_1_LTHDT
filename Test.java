public class Test {
    public static void main(String[] args) {
        BookManager ql = new BookManager();

        Textbook sgk1 = new Textbook(
            "GT001",
            "Cau truc du lieu & gia thuat",
            "Nguyen Duc Tai",
            2025,
            50,
            "Cau truc du lieu",
            "Dai hoc"
        );

        Textbook sgk2 = new Textbook(
            "GT002",
            "Co so du lieu 1",
            "Le Anh Quoc",
            2025,
            30,
            "Co so du lieu",
            "Dai hoc"
        );
        Novel novel1 = new Novel(
            "TT001",
            "Harry Potter",
            "J.K. Rowling",
            1997,
            100,
            "Ky ao",
            true
        );

        Novel novel2 = new Novel(
            "TT002",
            "Doraemon",
            "Fujiko F. Fujio",
            1990,
            200,
            "Thieu nhi",
            true
        );


        ql.themSach(sgk1);
        ql.themSach(sgk2);
        ql.themSach(novel1);
        ql.themSach(novel2);


        System.out.println("=== DANH SACH BAN DAU ===");
        ql.hienThiDanhSach();

        
        ql.capNhatSach("GT002", 45);

        Book tim = ql.timKiemTheoMa("TT001");
        if (tim != null) {
            System.out.println("\n=== KET QUA TIM KIEM ===");
            System.out.println(tim);
        }
        ql.xoaSach("GT001");
        System.out.println("\n=== DANH SACH SAU KHI XOA ===");
        ql.hienThiDanhSach();
    }
}
