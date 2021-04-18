package shapes;

public class MainClassHH {
	public static void main(String[] args) {
		HinhTron hinhTron = new HinhTron();
		hinhTron.xuatTen();
		hinhTron.nhapBanKinh();
		hinhTron.tinhChuVi();
		hinhTron.tinhDienTich();
		hinhTron.inChuVi();
		hinhTron.inDienTich();
		
		//HinhTru
		HinhTru hinhTru = new HinhTru();
		hinhTru.xuatTen();
		hinhTru.nhapChieuCao();
		hinhTru.tinhTheTich();
		hinhTru.inTheTich();
		
		//Hinh Chu Nhat
		HinhChuNhat hcn = new HinhChuNhat();
		hcn.xuatTen();
		hcn.nhapChieuDai();
		hcn.nhapChieuRong();
		hcn.tinhChuVi();
		hcn.tinhDienTich();
		hcn.inChuVi();
		hcn.inDienTich();
		
		//Hinh Vuong
		HinhVuong hinhVuong = new HinhVuong();
		hinhVuong.xuatTen();
		hinhVuong.nhapCanh();
		hinhVuong.tinhChuVi();
		hinhVuong.tinhDienTich();
		hinhVuong.inChuVi();
		hinhVuong.inDienTich();
	}

}