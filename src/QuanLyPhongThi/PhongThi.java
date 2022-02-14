package QuanLyPhongThi;

import java.util.ArrayList;
import java.util.Scanner;

public class PhongThi {
	private String msPT;
	private String diachiPT;
	private int luongTS;
	private ArrayList<ThiSinh> dsTS;

	public PhongThi() {
		dsTS = new ArrayList<ThiSinh>();
	}

	public PhongThi(String msPT, String diachiPT, int luongTS) {
		this.msPT = msPT;
		this.diachiPT = diachiPT;
		this.luongTS = luongTS;
		dsTS = new ArrayList<ThiSinh>();
	}

	public String getMsPT() {
		return msPT;
	}

	public void setMsPT(String msPT) {
		this.msPT = msPT;
	}

	public String getDiachiPT() {
		return diachiPT;
	}

	public void setDiachiPT(String diachiPT) {
		this.diachiPT = diachiPT;
	}

	public int getLuongTS() {
		return luongTS;
	}

	public void setLuongTS(int luongTS) {
		this.luongTS = luongTS;
	}

	public ArrayList<ThiSinh> getDsTS() {
		return dsTS;
	}

	public void setDsTS(ArrayList<ThiSinh> dsTS) {
		this.dsTS = dsTS;
	}

	public void nhapPT() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Mời nhập mã phòng thi:");
		setMsPT(sc.nextLine());
		System.out.print("Mời nhập địa chỉ phòng thi:");
		setDiachiPT(sc.nextLine());
		System.out.print("Mời nhập số lượng thí sinh:");
		setLuongTS(sc.nextInt());
	}

	public void xuatPT() {
		System.out.println("========== QUẢN LÝ PHÒNG THI ==========");
		System.out.printf("%-13s %-10s %8s %-10s %10s %-5d %n", "Mã phòng thi:", msPT, "Địa chỉ:", diachiPT,
				"Số lượng:", soThisinh());
	}

	public boolean themThiSinh(ThiSinh ts) {
		// Nếu thí sinh đã tồn tại thì không cho thêm
		if (dsTS.contains(ts))
			return false;
		if (dsTS.size() + 1 > luongTS)// nếu đã đủ lượng thí sinh
		{
			System.out.println("đã đủ số lượng thí sinh trong phòng.");
			return false;
		} else {
			dsTS.add(ts);
			return true;
		}
	}

	public boolean xoaThisinh(String soBD) {
		ThiSinh ts = new ThiSinh(soBD);
		if (!dsTS.contains(ts))
			return false;
		else {
			dsTS.remove(ts);
			return true;
		}
	}

	public boolean suaThongtinTS(String soBD, ThiSinh newTS) {
		ThiSinh ts = new ThiSinh(soBD);
		if (!dsTS.contains(ts))
			return false;
		dsTS.set(dsTS.indexOf(ts), newTS);
		return true;
	}

	public ThiSinh layThongtinTS(String soBD) {
		ThiSinh ts = new ThiSinh(soBD);
		if (!dsTS.contains(ts))
			return null;
		ts = dsTS.get(dsTS.indexOf(ts));
		return ts;
	}

	public ThiSinh layThongtinTS(int index) {
		if (index < 0 || index > dsTS.size())
			return null;
		return dsTS.get(index);
	}

	public int soThisinh() {
		return dsTS.size();
	}

	// sắp xếp sinh viên theo ho tên
	public void sapXep() {
		for (int i = 0; i < dsTS.size(); i++) {
			for (int j = i + 1; j < dsTS.size(); j++) {

			}
		}
	}
}
