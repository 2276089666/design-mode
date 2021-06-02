package mode.builder;

/**
 * @Author ws
 * @Date 2021/6/2 18:03
 */
public class Person{
   protected int id;
   protected String name;
   protected Location loc;
   protected double weight;
   protected int score;

   @Override
   public String toString() {
      return "Person{" +
              "id=" + id +
              ", name='" + name + '\'' +
              ", loc=" + loc +
              ", weight=" + weight +
              ", score=" + score +
              '}';
   }
}
class Location {
   private String street;
   private String roomNo;

   public Location(String street, String roomNo) {
      this.street = street;
      this.roomNo = roomNo;
   }

   @Override
   public String toString() {
      return "Location{" +
              "street='" + street + '\'' +
              ", roomNo='" + roomNo + '\'' +
              '}';
   }
}

