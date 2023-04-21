package EnumsJava;

	public class Enumteste {
		EnumPlanetas planeta;
	
	Enumteste(String planeta){
		this.planeta = EnumPlanetas.valueOf(planeta);
	}
	public void viajarPlaneta(){
		switch (planeta){
			case MERCÚRIO:
				System.out.println("Muito quente! Inabitável!");
				break;
			case VÊNUS:
				System.out.println("Quente! Inabitável!");
				break;
			case TERRA: 
				System.out.println("Planeta habitável");
				break;
			case MARTE:
				System.out.println("Clima próximo ao ideal!");
				break;
			case JÚPITER:
				System.out.println("Inabitável!");
				break;
			case SATURNO: 
				System.out.println("Inabitável!");
				break;
			case URANO:
				System.out.println("Inabitável!");
				break;
			case NETUNO:
				System.out.println("Inabitável!");
				break;
				
		}
	}
}
