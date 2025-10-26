public class Novel extends Book {
    private String theLoai;
    private boolean laSachSeries;

    public Novel (String maSach, String tieuDe, String tacGia, int namXuatBan, int soLuong, String theLoai, boolean laSachSeries, double giaCoBan){
        super(maSach, tieuDe, tacGia, namXuatBan, soLuong, giaCoBan);
        this.theLoai = theLoai;
        this.laSachSeries = laSachSeries;
    }
    public String getTheLoai() { 
        return theLoai; 
    }
    public void setMonHoc(String theLoai) { 
        this.theLoai = theLoai; 
    }
    @Override
    public double tinhGiaBan() {
        return giaCoBan + (laSachSeries ? 15000 : 0);
    }
    @Override
    public boolean kiemTraTonKho(int soLuongToiThieu) {
        return soLuong >= soLuongToiThieu;
    }
    @Override
    public void capNhatViTri(String viTriMoi) {
        System.out.println("Da chuyen sach \"" + tieuDe + "\" den khu vuc: " + viTriMoi);
    }
    @Override
    public String toString() {
        return super.toString() + 
        "\nThe loai: " + theLoai + 
        "\nSach series : " + (laSachSeries ? "Có" : "Không")+
        "\nGia ban: " + tinhGiaBan();
    }
}