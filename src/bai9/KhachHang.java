package bai9;

public class KhachHang {

    private String name;
    private int sonha;
    private String id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSonha() {
        return sonha;
    }

    public void setSonha(int sonha) {
        this.sonha = sonha;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public KhachHang (String name, int sonha, String id){

        this.name = name;;
        this.sonha = sonha;
        this.id = id;
    }
    @Override
    public String toString() {
        return " Họ và tên khách hàng" +name+ ", số nhà"
                +sonha +",mã số công tơ điện"+id;
    }
}
