public class SinhVien {
    private String maSV;
    private String hoTen;
    private int namSinh;
    private String lop;

    public SinhVien(String maSV, String hoTen, int namSinh, String lop) {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.namSinh = namSinh;
        this.lop = lop;
    }

    public String getMaSV() { return maSV; }
    public String getHoTen() { return hoTen; }
    public int getNamSinh() { return namSinh; }
    public String getLop() { return lop; }

    public void setMaSV(String maSV) { this.maSV = maSV; }
    public void setHoTen(String hoTen) { this.hoTen = hoTen; }
    public void setNamSinh(int namSinh) { this.namSinh = namSinh; }
    public void setLop(String lop) { this.lop = lop; }
}
