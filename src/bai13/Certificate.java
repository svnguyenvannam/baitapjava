package bai13;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;

public class Certificate {

    private String CertificatedID;
    private String CertificateName;
    private String CertificateRank;
    private String CertificatedDate;

    public String getCertificatedID() {
        return CertificatedID;
    }

    public void setCertificatedID(String certificatedID) {
        CertificatedID = certificatedID;
    }

    public String getCertificateName() {
        return CertificateName;
    }

    public void setCertificateName(String certificateName) {
        CertificateName = certificateName;
    }

    public String getCertificateRank() {
        return CertificateRank;
    }

    public void setCertificateRank(String certificateRank) {
        CertificateRank = certificateRank;
    }

    public String getCertificatedDate() {
        return CertificatedDate;
    }

    public void setCertificatedDate(String certificatedDate) {
        CertificatedDate = certificatedDate;
    }

    public Certificate(){};

    public Certificate(String CertificatedID, String CertificateName, String CertificateRank, String CertificatedDate){
        this.CertificatedID = CertificatedID;
        this.CertificateName = CertificateName;
        this.CertificateRank = CertificateRank;
        this.CertificatedDate = CertificatedDate;
    }

}
