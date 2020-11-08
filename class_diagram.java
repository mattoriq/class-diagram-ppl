// todo all class
public class Personal {
  private String nama;
  public void searchPosting(){
    // todo search posting
  }
  public void readPosting(){
    // todo read posting
  }
  public void watchVideo(){
    // todo watch video
  }
}

public class User extends Personal {
  private String jenisKelamin;
  private String tanggalLahir;
  private int usia;
  public void giveFeedback(){
    // todo give feedback
  }
}

public class Admin extends Personal {
  private String lokasi;
  public void adminLogin(){
    // todo admin login
  }
  public void addPosting(){
    // todo add posting
  }
  public void addVideo(){
    // todo add video
  }
  public void editPosting(){
    // todo edit posting
  }
  public void readFeedback(){
    // todo read feedback
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
  private String tanggal;
  private String namaAdmin;
}

public class Makanan extends Posting {
  private int perhitunganGizi;
}

public class Olahraga extends Posting {
  private int videoUrl;
}

public class Feedback {
  private String pesan;
}
}
