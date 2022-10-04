package bai13;

import java.util.ArrayList;
import java.util.List;

public class AddCertificate {

    List<Certificate> certificates;
    public AddCertificate() {
        this.certificates = new ArrayList<>();
    }

    public void add(Certificate certificate){
        this.certificates.add(certificate);
    }
}
