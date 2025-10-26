public class Novel extends Book {
    private String theLoai;
    private boolean laSachSeries;
    public Novel(String maSach, String tieuDe, String tacGia, int namXuatBan, int soLuong, double giaCoBan, String theLoai, boolean laSachSeries) {
        super(maSach, tieuDe, tacGia, namXuatBan, soLuong, giaCoBan);
        this.theLoai = theLoai;
        this.laSachSeries = laSachSeries;
    }

    public String getTheLoai() { 
        return theLoai; 
    }

    public void setTheLoai(String theLoai) { 
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
        System.out.println("Đã chuyển sách \"" + tieuDe + "\" đến khu vực: " + viTriMoi);
    }

    @Override
    public String toString() {
        return "Tiểu thuyết --> " + super.toString() +
               "\nThể loại: " + theLoai + 
               "\nSách series: " + (laSachSeries ? "Có" : "Không") +
               "\nGiá bán: " + tinhGiaBan();
    }
}
