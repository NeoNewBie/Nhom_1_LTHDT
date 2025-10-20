public class Novel extends Book{
    private String theLoai;
    private boolean laSachSeries;

    public Novel (String maSach, String tieuDe, String tacGia, int namXuatBan, int soLuong, double giaCoBan, String theLoai, boolean laSachSeries){
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
    public double tinhGiaBan(){
        return giaCoBan + (laSachSeries ? 15000 : 0);
    }

    @Override
    public String toString() {
        return super.toString() + 
        "\nThể loại: " + theLoai + 
        "\nSách series : " + (laSachSeries ? "Có" : "Không") +
        "\nGía bán: " + tinhGiaBan();
    }
}
