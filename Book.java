public abstract class Book implements IGiaBan, IKiemKe {
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
        this.giaCoBan = giaCoBan;
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
    }
    public double getGiaCoBan(){
        return giaCoBan;
    }
    public void setGiaCoBan(double giaCoBan){
        this.giaCoBan = giaCoBan;
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
    @Override
    public String toString() {
        return "Ma sach: " + maSach +
               "\nTieu de: " + tieuDe +
               "\nTac gia: " + tacGia +
               "\nNam XB: " + namXuatBan +
               "\nSo luong: " + soLuong;
    }
    // public abstract double tinhGiaBan();
}