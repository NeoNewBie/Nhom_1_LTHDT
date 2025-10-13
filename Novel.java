public class Novel extends Book{
    private String theLoai;
    private boolean laSachSeries;

    public Novel (String maSach, String tieuDe, String tacGia, int namXuatBan, int soLuong, String theLoai, boolean laSachSeries){
        super(maSach, tieuDe, tacGia, namXuatBan, soLuong);
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
    public String toString() {
        return super.toString() + 
        "\nThể loại: " + theLoai + 
        "\nSách series : " + (laSachSeries ? "Có" : "Không");
    }
}
