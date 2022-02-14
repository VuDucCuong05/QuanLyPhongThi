package QuanLyPhongThi;


import java.util.Objects;
import java.util.Scanner;

public class ThiSinh {
	private String soBD;
	private String hoTen;
	private float diemToan;
	private float diemLy;
	private float diemHoa;

	public ThiSinh() {
	}

	public ThiSinh(String soBD) {
		this.soBD = soBD;
	}

	public String getSoBD() {
		return soBD;
	}

	public String getHoTen() {
		return hoTen;
	}

	public float getDiemToan() {
		return diemToan;
	}

	public float getDiemLy() {
		return diemLy;
	}

	public float getDiemHoa() {
		return diemHoa;
	}

	@Override
	public int hashCode() {
		int hash = 5;
		hash = 59 * hash + Objects.hashCode(this.soBD);
		return hash;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		final ThiSinh other = (ThiSinh) obj;
		if (!Objects.equals(this.soBD, other.soBD)) {
			return false;
		}
		return true;
	}

	public void setSoBD(String soBD) throws Exception {
		if (soBD.trim().equals(""))
			throw new Exception("Số báo danh không được trống!");
		this.soBD = soBD;
	}

	public void setHoTen(String hoTen) throws Exception {
		if (hoTen.trim().equals(""))
			throw new Exception("Họ tên không được trống!");
		this.hoTen = hoTen;
	}

	public void setDiemToan(float diemToan) throws Exception {
		if (diemToan < 0 || diemToan > 10)
			throw new Exception("Điểm toan không hợp lệ");
		this.diemToan = diemToan;
	}

	public void setDiemLy(float diemLy) throws Exception {
		if (diemLy < 0 || diemLy > 10)
			throw new Exception("Điểm ly không hợp lệ");
		this.diemLy = diemLy;
	}

	public void setDiemHoa(float diemHoa) throws Exception {
		if (diemHoa < 0 || diemHoa > 10)
			throw new Exception("Điểm hoa không hợp lệ");
		this.diemHoa = diemHoa;
	}

	public void nhap() {
		boolean co = false;
		while (co == false) {
			try {
				Scanner sc = new Scanner(System.in);
				System.out.print("\tNhập số báo danh:");
				setSoBD(sc.nextLine());
				System.out.print("\tNhập họ tên thí sinh:");
				setHoTen(sc.nextLine());
				System.out.print("\tNhập điểm toán:");
				setDiemToan(sc.nextFloat());
				System.out.print("\tNhập điểm lý:");
				setDiemLy(sc.nextFloat());
				System.out.print("\tNhập điểm hóa:");
				setDiemHoa(sc.nextFloat());
				co = true;
			} catch (Exception ex) {
				System.out.println("có lỗi: " + ex.toString());
			}
		}

	}

	public static void inTieuDe() {
		System.out.printf("%5s %-20s %10s %10s %10s %10s%n", "SBD", "Họ và tên", "Điểm toán", "Điểm lý", "Điểm hóa",
				"Tổng điểm");
	}

	private float tongDiem() {
		return (diemHoa + diemLy + diemToan);
	}

	public void xuat() {
		System.out.printf("%5s %-20s %10.1f %10.1f %10.1f %10.1f%n", soBD, hoTen, diemToan, diemLy, diemHoa,
				tongDiem());
	}
}
