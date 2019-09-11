package setterDependency;

public class BeanClass {
	String sentence;


	public String getSentence() {
		return sentence;
	}

	public void setSentence(String sentence) {
		System.out.println("Setting the sentence field of bean to:\n"+sentence);
		this.sentence = sentence;
	}

	public void randomMethod() {
		System.out.println("In the method of bean class");
	}

	public BeanClass() {
		super();
		System.out.println("In the constructor of bean class");
		
		// TODO Auto-generated constructor stub
	}


	
}
