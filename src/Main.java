import items.DanhSachVatPham;
import items.Item;

import java.util.Scanner;

public class Main {
    final static double dobenCanhCong = 200;
    public static void main(String[] args) {
        DanhSachVatPham ds = new DanhSachVatPham();
        ds.xuatDanhSachVatPham();
        ds.timVatPhamTieuThuLonNhat();
        ds.sucCongPhaSponCo(dobenCanhCong);
    }
}