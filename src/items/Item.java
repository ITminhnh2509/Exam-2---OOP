package items;

public class Item {
    protected String tenVatPham;
    protected double csSucManh;
    protected double hsSucManh;
    protected int slXu;

    public Item() {
    }

    public Item(String tenVatPham, double csSucManh, double hsSucManh, int slXu) {
        this.tenVatPham = tenVatPham;
        this.csSucManh = csSucManh;
        this.hsSucManh = hsSucManh;
        this.slXu = slXu;
    }

    public String getTenVatPham() {
        return tenVatPham;
    }

    public void setTenVatPham(String tenVatPham) {
        this.tenVatPham = tenVatPham;
    }

    public double getCsSucManh() {
        return csSucManh;
    }

    public void setCsSucManh(double csSucManh) {
        this.csSucManh = csSucManh;
    }

    public double getHsSucManh() {
        return hsSucManh;
    }

    public void setHsSucManh(double hsSucManh) {
        this.hsSucManh = hsSucManh;
    }

    public int getSlXu() {
        return slXu;
    }

    public void setSlXu(int slXu) {
        this.slXu = slXu;
    }
    public double tinhSucCongPha(){
        return this.csSucManh * this.hsSucManh;
    }
    public int luongxuTieuThu(){
        return (int)tinhSucCongPha() * this.slXu;
    }

    public void Xuat(){
        System.out.println("=================");
        System.out.println("Tên vật phẩm: " + this.tenVatPham
                + "\nChỉ số sức mạnh: " + this.csSucManh
                + "\nHệ số sức mạnh: " + this.hsSucManh
                + "\nSố vàng quy đổi trên 1 sức công phá: " + this.slXu + " xu"
                + "\nSức công phá: " + tinhSucCongPha()
        );
    }

}
