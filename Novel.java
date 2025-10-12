public class Novel extends Book{
    String theLoai;
    boolean laSachSeries;

    public Novel (String maSach, String tieuDe, String tacGia, int namXuatBan, int soLuong, String theLoai, boolean laSachSeries){
        super(maSach, tieuDe, tacGia, namXuatBan, soLuong);
        this.theLoai = theLoai;
        this.laSachSeries = laSachSeries;
    }

    @Override
    public String toString() {
        return super.toString() + ", Thể loại: " + theLoai + ", Sách series : " + laSachSeries;
    }
}
