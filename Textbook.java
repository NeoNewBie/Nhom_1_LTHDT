public class Textbook extends Book {
    private String monHoc;
    private String capDo;

    public Textbook(String maSach, String tieuDe, String tacGia, int namXuatBan, int soLuong, String monHoc, String capDo) {
        super(maSach, tieuDe, tacGia, namXuatBan, soLuong);
        this.monHoc = monHoc;
        this.capDo = capDo;
    }

    @Override
    public String toString() {
        return super.toString() +
               "\nMon hoc: " + monHoc +
               "\nCap do: " + capDo +
               "\n----------------------------";
    }
}
