package ar.edu.unlp.oo1.ejercicio1;


public class WallPost {

	private String descripcion;
	private int likes;
	private boolean featured;
	
	
	String getText() {
		return this.descripcion;
	};

	void setText(String text) {
		this.descripcion = text;
	};


	int getLikes() {
		return this.likes;
	};

	
	void like() {
		this.likes ++;
	};

	//Decrementa la cantidad de likes en uno. Si ya es 0, no hace nada
	 
	void dislike() {
		if(this.likes > 0) {
			this.likes --;
		}
	};


	boolean isFeatured() {
		return this.featured;
	};


	void toggleFeatured() {
		this.featured = !this.featured;
	};


	//Este mensaje se utiliza para que una instancia de Wallpost se muestre de forma adecuada
	@Override
	public String toString() {
		return "WallPost {" +
			"text: " + getText() +
			", likes: '" + getLikes() + "'" +
			", featured: '" + isFeatured() + "'" +
			"}";
	}

}
