import java.util.Scanner;
package class-diagram-ppl;

public class ClassDiagram {
  
}

public class Personal {
	private String nama;
	public Personal(String nama){
		this.nama = nama;
	}
	public void searchPosting(String keyword){
		System.out.println("Berikut hasil pencarian dengan kata kunci " + keyword);
	}
	public void readPosting(String judul){
		System.out.println("Berikut informasi mengenai " + judul);
	}
	public void watchVideo(String judul, String videoUrl){
		System.out.println("Berikut video mengenai " + judul + " yang dapat ditonton di halaman web " + videoUrl);
	}
}

public class User extends Personal {
	private String jenisKelamin;
	private String tanggalLahir;
	private int usia;
	public User(String jenisKelamin, String tanggalLahir, int usia){
		this.jenisKelamin = jenisKelamin;
		this.tanggalLahir = tanggalLahir;
		this.usia = usia;
	}
	public void giveFeedback(){
		System.out.println("Tuliskan feedback anda mengenai aplikasi ini!");
		String feedback = getString();
		Feedback newFeedback = new Feedback(feedback);
	}
}

public class Admin extends Personal {
	private String lokasi;
	public void adminLogin(){
		// todo admin login
	}
	public void addPosting(String judul, String tanggal, String namaAdmin){
		Posting newPost = new Posting(judul,tanggal,namaAdmin);
	}
	public void addVideo(String videoUrl){
		Olahraga newVideo = new Olahraga(String videoUrl)
	}
	public void editPosting(){
		if (newPost != null){
			System.out.println("Anda ingin mengedit: 1) JUDUL 2) ISI 3) TANGGAL 4) NAMA ADMIN");
			int choice = getInt();
			if (choice == 1){
				System.out.println("Judul baru: ");
				String newJudul = getString();
				newPost.changeJudul(newJudul);
			} else if (choice == 2) {
				System.out.println("Isi baru: ");
				String newIsi = getIsi();
				newPost.changeIsi(newIsi);
			} else if (choice == 3) {
				System.out.println("Tanggal baru: ");
				String newTanggal = getString();
				newPost.changeTanggal(newTanggal);
			} else if (choice == 4) {
				System.out.println("Nama Admin baru: ");
				String newNamaAdmin = getString();
				newPost.changeNamaAdmin(newNamaAdmin);
			}
		} else {
			System.out.println("Input Salah.");
		}
	}
	public void readFeedback(){
		if (newFeedback != null){
			System.out.println("Feedback mengenai aplikasi tertulis di bawah ini\n" + newFeedback.getPesan());
		} else {
			System.out.println("Belum ditemukan feedback dari aplikasi ini.");
		}
	}
}

public class Pencarian {
	private String keyword;
	public void accessPosting(){
		// todo access posting
	}
}

public class Posting {
	private String judul;
	private String isi;
	private String tanggal;
	private String namaAdmin;
	public Posting(String judul, String isi, String tanggal, String namaAdmin){
		this.judul = judul;
		this.isi = isi
		this.tanggal = tanggal;
		this.namaAdmin = namaAdmin;
	}
	public void getJudul(){
		return this.judul;
	}
	public void getIsi(){
		return this.isi;
	}
	public void getTanggal(){
		return this.tanggal;
	}
	public void getNamaAdmin(){
		return this.namaAdmin;
	}
	public changeJudul(String newJudul){
		this.judul = newJudul;
		return true;
	}
	public changeIsi(String newIsi){
		this.isi = newIsi;
		return true;
	}
	public changeTanggal(String newTanggal){
		this.tanggal = newTanggal;
		return true;
	}
	public changeJudul(String newNamaAdmin){
		this.namaAdmin = newNamaAdmin;
		return true;
	}
}

public class Makanan extends Posting {
	private int perhitunganGizi;
	public Makanan(int perhitunganGizi){
		this.perhitunganGizi = perhitunganGizi;
	}
}

public class Olahraga extends Posting {
	private String videoUrl;
	public Olahraga(String videoUrl){
		this.videoUrl = videoUrl;
	}
}

public class Feedback {
	private String pesan;
	public Feedback(String pesan){
		this.pesan = pesan
	}
	public void getPesan(){
		return this.pesan;
	}
}

public static String getString() throws IOException {
	Scanner input = new Scanner(System.in);
	String str = input.nextLine();
	return str;
}

public static int getInt() throws IOException{
	String s = getString();
	return Integer.parseInt(s);
}
