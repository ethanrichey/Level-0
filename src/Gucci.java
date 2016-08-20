import javax.swing.JOptionPane;

public class Gucci {

		private int Bling;
		private int Teeth;
		Gucci(){
		this.Bling = 10;
		this.Teeth = 4;
		}
	public void steal(){
		Bling--;
		if(Bling > 0){
			System.out.println("Nice try sucka");
		}
		else if ( Bling < 0){
		 
		
			
		}
		
		
		else{
			System.out.println("Bling = swiped my dude");
		}
	  }	
	public static void main(String[] args) {
		Gucci Mayne = new Gucci();
		Mayne.steal();
		Mayne.steal();
		Mayne.steal();
		Mayne.steal();
		Mayne.steal();
		Mayne.steal();
		Mayne.steal();
		Mayne.steal();
		Mayne.steal();
		Mayne.steal();
		
	}

}
	
	
	


