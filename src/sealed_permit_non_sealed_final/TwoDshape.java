package sealed_permit_non_sealed_final;

sealed public class TwoDshape permits Rectangle, Square{
	
public void show() {
	System.out.println("TwoDshape..");
}



}
