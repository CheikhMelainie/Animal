package Animal;

public abstract class  Animal {
	protected int poids;
	protected String couleur;
	
	public abstract void crié();
	
	public abstract void deplacement();
	
	public void manger(){
		System.out.println("je mange !");
	}
	
	public void boire(){
		System.out.println("je bois !");
		
	}

}
