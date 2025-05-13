public class KhoaHoc {
    private String maKhoaHoc;
    private String tenKhoaHoc;
    private int soTinChi;
    private String giangVien;

    public KhoaHoc(String maKhoaHoc, String tenKhoaHoc, int soTinChi, String giangVien) {
        this.maKhoaHoc = maKhoaHoc;
        this.tenKhoaHoc = tenKhoaHoc;
        this.soTinChi = soTinChi;
        this.giangVien = giangVien;
    }

    public String getMaKhoaHoc() { return maKhoaHoc; }
    public String getTenKhoaHoc() { return tenKhoaHoc; }
    public int getSoTinChi() { return soTinChi; }
    public String getGiangVien() { return giangVien; }

    public void setMaKhoaHoc(String maKhoaHoc) { this.maKhoaHoc = maKhoaHoc; }
    public void setTenKhoaHoc(String tenKhoaHoc) { this.tenKhoaHoc = tenKhoaHoc; }
    public void setSoTinChi(int soTinChi) { this.soTinChi = soTinChi; }
    public void setGiangVien(String giangVien) { this.giangVien = giangVien; }
}
