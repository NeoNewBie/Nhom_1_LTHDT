public class Textbook extends Book{
    private String monHoc;
    private String capDo;

    public Textbook(String maSach, String tieuDe, String tacGia, int namXuatBan, int soLuong,double giaCoBan, String monHoc, String capDo)
    {
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
    public double tinhGiaBan(){
        return (giaCoBan + ((2025 - namXuatBan) * 5000));
    }
    @Override
    public String toString() {
        return "Sách giáo trình --> " + super.toString() + 
        "\nMôn học: " + monHoc + 
        "\nCấp độ: " + capDo + 
        "\nGiá bán: " + tinhGiaBan();
    }
}


