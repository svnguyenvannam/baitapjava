package bai1;

import java.text.Collator;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class QLCB{

   private List<CanBo> canBo ;
   public QLCB()
   {
       this.canBo = new ArrayList();
   }
   public void addCanBo(CanBo CanBo){

       this.canBo.add(CanBo);
   }
   public List<CanBo> timKiemTheoTen(String name){

      return this.canBo.stream().filter(o-> o.getName().contains(name)).collect(Collectors.toList());

   }

   public void hienThiCanBo(){

       this.canBo.forEach(o -> System.out.println(o.toString()));

   }

}
