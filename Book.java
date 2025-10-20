public abstract class Book {
    protected String maSach;
    protected String tieuDe;
    protected String tacGia;
    protected int namXuatBan;
    protected int soLuong;
    protected double giaCoBan;
    
    public Book() {
    }
    public Book(String maSach, String tieuDe, String tacGia, int namXuatBan, int soLuong, double giaCoBan) {
        this.maSach = maSach;
        this.tieuDe = tieuDe;
        this.tacGia = tacGia;
        if (namXuatBan > 0) {
            this.namXuatBan = namXuatBan;
        } else {
            System.out.println("Nam xuat ban khong hop le!");
            this.namXuatBan = 0;
        }
        if (soLuong >= 0) {
            this.soLuong = soLuong;
        } else {
            System.out.println("So luong khong hop le!");
            this.soLuong = 0;
        }
        if (giaCoBan > 0) {
            this.giaCoBan = giaCoBan;
        } else {
            System.out.println("Giá cơ bản không hợp lệ.");
            this.giaCoBan = 0;
        }
    }


    public String getMaSach() {
        return maSach;
    }
    public void setMaSach(String maSach) {
        this.maSach = maSach;
    }
    public String getTieuDe() {
        return tieuDe;
    }
    public void setTieuDe(String tieuDe) {
        this.tieuDe = tieuDe;
    }
    public String getTacGia() {
        return tacGia;
    }
    public void setTacGia(String tacGia) {
        this.tacGia = tacGia;
    }
    public int getNamXuatBan() {
        return namXuatBan;
    }
    public void setNamXuatBan(int namXuatBan) {
        if (namXuatBan > 0) {
            this.namXuatBan = namXuatBan;
        } else {
            System.out.println("Nam xuat ban khong hop le!");
            this.namXuatBan = 0;
        }
    }
    public int getSoLuong() {
        return soLuong;
    }
    public void setSoLuong(int soLuong) {
        if (soLuong >= 0) {
            this.soLuong = soLuong;
        } else {
            System.out.println("So luong khong hop le!");
            this.soLuong = 0;
        }
    }
    public double getGiaCoBan(){
        return giaCoBan;
    }
    public void setGiaCoBan(double giaCoBan){
        if (giaCoBan > 0) {
            this.giaCoBan = giaCoBan;
        } else {
            System.out.println("Giá cơ bản không hợp lệ.");
        }
    }
    /*public void hienThiThongTin() {
        System.out.println("Ma sach: " + maSach);
        System.out.println("Tieu de: " + tieuDe);
        System.out.println("Tac gia: " + tacGia);
        System.out.println("Nam xuat ban: " + namXuatBan);
        System.out.println("So luong: " + soLuong);
        System.out.println("---------------------------");
    }*/

    public abstract double tinhGiaBan();

    @Override
    public String toString() {
        return "Mã sách: " + maSach +
               "\nTiêu đề: " + tieuDe +
               "\nTác giả: " + tacGia +
               "\nNăm XB: " + namXuatBan +
               "\nSố lượng: " + soLuong +
               "\nGiá cơ bản: " + giaCoBan;
    }
}
