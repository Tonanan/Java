public class TaiKhoanNganHang {
    private String soTaiKhoan;
    private double soDu;
    private String lichSuGiaoDich;

    public TaiKhoanNganHang(String soTaiKhoan, double soDu, String lichSuGiaoDich) {
        this.soTaiKhoan = soTaiKhoan;
        this.soDu = soDu;
        this.lichSuGiaoDich = lichSuGiaoDich;
    }

    public String getSoTaiKhoan() { return soTaiKhoan; }
    public double getSoDu() { return soDu; }
    public String getLichSuGiaoDich() { return lichSuGiaoDich; }

    public void setSoTaiKhoan(String soTaiKhoan) { this.soTaiKhoan = soTaiKhoan; }
    public void setSoDu(double soDu) { this.soDu = soDu; }
    public void setLichSuGiaoDich(String lichSuGiaoDich) { this.lichSuGiaoDich = lichSuGiaoDich; }
}
