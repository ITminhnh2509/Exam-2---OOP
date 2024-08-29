package items;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class DanhSachVatPham {
    List<Item> arr;

    public DanhSachVatPham() {
        arr = Arrays.asList(
                new BaoTaySamSet(), new CayRiuPhepThuat(), new CayGayChienThan(), new ChiecBuaThan(), new HonDaKichNo()
        );
    }

    public void xuatDanhSachVatPham(){
        System.out.println("Câu 2:");
        arr.stream()
                .forEach(Item::Xuat);
    }
    public int luongxuTieuThuLonNhat(){
        int xuTieuThuLonNhat = 0;
        for(Item i : arr){
            if(i.luongxuTieuThu() > xuTieuThuLonNhat){
                xuTieuThuLonNhat = i.luongxuTieuThu();
            }
        }
        return xuTieuThuLonNhat;
    }
    public int luongxuTieuThuNhoNhat(){
        int xuTieuThuNhoNhat = luongxuTieuThuLonNhat();
        for(Item i : arr){
            if(i.luongxuTieuThu() < xuTieuThuNhoNhat){
                xuTieuThuNhoNhat = i.luongxuTieuThu();
            }
        }
        return xuTieuThuNhoNhat;
    }
    public void timVatPhamTieuThuLonNhat(){
        System.out.println("Câu 3:==================");
        arr.stream()
                .filter(item -> item.luongxuTieuThu() == luongxuTieuThuLonNhat())
                .forEach(item -> {
                    System.out.println("Vật phẩm tiêu thụ xu lớn nhất là: "+ item.tenVatPham);
                    System.out.println("Với lượng xu tiêu thu là: "+ item.luongxuTieuThu());
                });
    }

    public void sucCongPhaSponCo(double dobenCanhCong){
        System.out.println("Câu 4:==================");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Hãy nhap số xu Spon đã thu tập được: ");
        int soxu = scanner.nextInt();
        int sucCongPha = 0;
        while (soxu>luongxuTieuThuNhoNhat()){
            System.out.println("=======================");
            System.out.println("----------Sức mạnh cần có để phá cổng: " + dobenCanhCong);
            System.out.println("----------Số xu của bạn hiện có: " + soxu);
            System.out.println("----------Số công phá của bạn hiện có: " + sucCongPha);
            System.out.println("Hãy chọn vật phẩm để đánh cổng: ");
            System.out.println("1. Bao tay sấm sét: giá 210 xu");
            System.out.println("2. Cây rìu phép thuật: giá 450 xu");
            System.out.println("3. Cây gậy chiến thần: giá 140 xu");
            System.out.println("4. Chiếc búa thần: giá 500 xu");
            System.out.println("5. Hòn đá kích nổ: giá 960 xu");
            int chon =0;
            boolean flag = false;
            while (!flag){
                System.out.print("Lựa chọn của bạn là: ");
                chon=scanner.nextInt();
                if(chon < 1 || chon >5){
                    System.out.println("Không đúng số thứ tự vật phẩm xin hãy chọn lại");
                    flag = false;
                } else {
                    flag = true;
                }
            }

            switch (chon){
                case 1 -> {
                    Item itemSpon = new BaoTaySamSet();
                    if(soxu >= itemSpon.luongxuTieuThu()){
                        System.out.println("Bạn đã chọn vật phẩm: " + itemSpon.getTenVatPham());
                        soxu -= itemSpon.luongxuTieuThu();
                        sucCongPha += itemSpon.tinhSucCongPha();
                    } else {
                        System.out.println("Bạn không đủ xu");
                    }
                }
                case 2 -> {
                    Item itemSpon = new CayRiuPhepThuat();
                    if(soxu >= itemSpon.luongxuTieuThu()){
                        System.out.println("Bạn đã chọn vật phẩm: " + itemSpon.getTenVatPham());
                        soxu -= itemSpon.luongxuTieuThu();
                        sucCongPha += itemSpon.tinhSucCongPha();
                    } else {
                        System.out.println("Bạn không đủ xu");
                    }
                }
                case 3 -> {
                    Item itemSpon = new CayGayChienThan();
                    if(soxu >= itemSpon.luongxuTieuThu()){
                        System.out.println("Bạn đã chọn vật phẩm: " + itemSpon.getTenVatPham());
                        soxu -= itemSpon.luongxuTieuThu();
                        sucCongPha += itemSpon.tinhSucCongPha();
                    } else {
                        System.out.println("Bạn không đủ xu");
                    }
                }
                case 4 -> {
                    Item itemSpon = new ChiecBuaThan();
                    if(soxu >= itemSpon.luongxuTieuThu()){
                        System.out.println("Bạn đã chọn vật phẩm: " + itemSpon.getTenVatPham());
                        soxu -= itemSpon.luongxuTieuThu();
                        sucCongPha += itemSpon.tinhSucCongPha();
                    } else {
                        System.out.println("Bạn không đủ xu");
                    }
                }
                case 5 -> {
                    Item itemSpon = new HonDaKichNo();
                    if(soxu >= itemSpon.luongxuTieuThu()){
                        System.out.println("Bạn đã chọn vật phẩm: " + itemSpon.getTenVatPham());
                        soxu -= itemSpon.luongxuTieuThu();
                        sucCongPha += itemSpon.tinhSucCongPha();
                    } else {
                        System.out.println("Bạn không đủ xu");
                    }
                }
            }
        }
        if(dobenCanhCong < sucCongPha){
            System.out.println("Chúc mừng spon đã thành công cứu các bạn");
        } else if (dobenCanhCong >= sucCongPha){
            System.out.println("thật đáng tiếc spon đã thất bại cứu các bạn");
        }
    }
}
