
public enum Branch {
	 MATH("Information Regarding MATH"),
	    PHYSICS("Information Regarding PHYSICS"),
	    CS("Information Regarding CS"),
	    ENG("Information Regarding ENG");
	
	private String description;
	Branch(String description){
		this.description=description;
	}
	public String getDescription() {
		return this.description;
	}

}
