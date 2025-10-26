public class Textbook extends Book {
    private String monHoc;
    private String capDo;
    public Textbook(String maSach, String tieuDe, String tacGia, int namXuatBan, int soLuong, double giaCoBan, String monHoc, String capDo) {
        super(maSach, tieuDe, tacGia, namXuatBan, soLuong, giaCoBan);
        this.monHoc = monHoc;
        this.capDo = capDo;
    }

    public String getMonHoc() { 
        return monHoc; 
    }

    public void setMonHoc(String monHoc) { 
        this.monHoc = monHoc; 
    }

    public String getCapDo() { 
        return capDo;
    }

    public void setCapDo(String capDo) { 
        this.capDo = capDo; 
    }

    @Override 
    public double tinhGiaBan() {
        int soNamXuatBan = 2025 - namXuatBan;
        return giaCoBan + (soNamXuatBan * 5000);
    }

    @Override
    public boolean kiemTraTonKho(int soLuongToiThieu) {
        return soLuong >= soLuongToiThieu;
    }

    @Override
    public void capNhatViTri(String viTriMoi) {
        System.out.println("Đã chuyển sách \"" + tieuDe + "\" đến khu vực: " + viTriMoi);
    }

    @Override
    public String toString() {
        return "Sách giáo trình --> " + super.toString() + 
               "\nMôn học: " + monHoc + 
               "\nCấp độ: " + capDo + 
               "\nGiá bán: " + tinhGiaBan();
    }
}
