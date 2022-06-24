package javaDenemeProjeleri.proje1;

public class Ogrenci {

	private int no;
	private String ad;
	private String bolum;

	public Ogrenci() {

	}

	public Ogrenci(int no, String ad, String bolum) {
		super();
		this.no = no;
		this.ad = ad;
		this.bolum = bolum;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getAd() {
		return ad;
	}

	public void setAd(String ad) {
		this.ad = ad;
	}

	public String getBolum() {
		return bolum;
	}

	public void setBolum(String bolum) {
		this.bolum = bolum;
	}

}
