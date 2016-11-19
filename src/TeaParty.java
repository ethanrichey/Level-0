



public class TeaParty  {
	
		
		public String Welcome(String lastName, boolean isWoman, boolean isKnighted){
		
			if(isWoman){
				
				String surname = "ms.";
				if(isKnighted){
					surname  = "Lady";
				}
			}
				
			else {
				String surname = "mr.";
			}
			
		}
		
		
		 public void Talk()      {
			 TeaParty tea = new TeaParty();
			 String greet = tea.Welcome("Jim", false, false);
					
		 }
		
		
		public static void main(String[] args) {
			
			
			
		}

		



	}

