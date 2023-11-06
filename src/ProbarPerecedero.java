import com.corenetworks.Modelo.Producto;
import com.corenetworks.Modelo.ProductoPerecedero;

public class ProbarPerecedero {
    public static void main(String[] args) {
        ProductoPerecedero p1= new ProductoPerecedero("Leche",2,1.2,"2023/12/31");
        ProductoPerecedero p2= new ProductoPerecedero("Leche",2,1.2,"2023/12/31");
        System.out.println(p1.toString());
        Producto P1= new Producto("Pan",1,0.8);
        System.out.println(P1.toString());
        System.out.println(p1.equals(p2));
    }
}