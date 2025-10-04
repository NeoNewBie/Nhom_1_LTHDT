public class Book 
{
    private String maSach;
    public String tieuDe;
    public String tacGia;
    public int namXuatBan;
    public int soLuong;
    public Book(){
    }
    public Book(String maSach, String tieuDe, String tacGia, int namXuatBan, int soLuong){
        this.maSach=maSach;
        this.tieuDe=tieuDe;
        this.tacGia=tacGia;
        this.namXuatBan=namXuatBan;
        this.soLuong=soLuong;
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
        this.namXuatBan = namXuatBan;
    }
    public int getSoLuong() {
        return soLuong;
    }
    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }
        public void hienThiThongTin()
    {
        System.out.println("Ma sach: "+maSach);
        System.out.println("Tieu de: "+tieuDe);
        System.out.println("Tac gia: "+tacGia);
        System.out.println("Nam xuat ban: "+namXuatBan);
        System.out.println("So luong: "+soLuong);
    }
}