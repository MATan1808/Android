package Model;

public class SinhVien {
    private String masv;
    private String tensv;
    private String gt;
    private String anhsv;

    public SinhVien(String masv, String tensv, String gt, String anhsv) {
        this.masv = masv;
        this.tensv = tensv;
        this.gt = gt;
        this.anhsv=anhsv;
    }

    public String getAnhsv() {
        return anhsv;
    }

    public void setAnhsv(String anhsv) {
        this.anhsv = anhsv;
    }

    public String getMasv() {
        return masv;
    }

    public void setMasv(String masv) {
        this.masv = masv;
    }

    public String getTensv() {
        return tensv;
    }

    public void setTensv(String tensv) {
        this.tensv = tensv;
    }

    public String getGt() {
        return gt;
    }

    public void setGt(String gt) {
        this.gt = gt;
    }
    public String GetAnhsv(){
        return anhsv;
    }

}
