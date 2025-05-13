public class NhanVien {
    private String maNV;
    private String hoTen;
    private double luongCoBan;
    private double phuCap;

    public NhanVien(String maNV, String hoTen, double luongCoBan, double phuCap) {
        this.maNV = maNV;
        this.hoTen = hoTen;
        this.luongCoBan = luongCoBan;
        this.phuCap = phuCap;
    }

    public String getMaNV() { return maNV; }
    public String getHoTen() { return hoTen; }
    public double getLuongCoBan() { return luongCoBan; }
    public double getPhuCap() { return phuCap; }

    public void setMaNV(String maNV) { this.maNV = maNV; }
    public void setHoTen(String hoTen) { this.hoTen = hoTen; }
    public void setLuongCoBan(double luongCoBan) { this.luongCoBan = luongCoBan; }
    public void setPhuCap(double phuCap) { this.phuCap = phuCap; }
}
