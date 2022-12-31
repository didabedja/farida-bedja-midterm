package datastructure;

public class UseArrayList<S> {

	public void main(String[] args) {
		/*
		 * Demonstrate how to use ArrayList that includes add,peek,remove,retrieve elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * Store all the sorted data into one of the databases.
		 *
		 */

		UseArrayList<S> al = (UseArrayList<S>) new UseArrayList<String>();


		System.out.println("Size of UseArrayList:"+al.size());



		al.add("Java");

		al.add("JDBC");

		System.out.println("Elements of first UseArrayList: "+al);




		UseArrayList<String> al2 = new UseArrayList<String>();

		al2.add("EJB");

		al2.add("Struts");

//Adding the both array

		al2.addAll((UseArrayList<String>) al);

		System.out.println("Elements of second UseArrayList: "+al2);




//remove the element

		al2.remove("EJB");

		System.out.println("Elements of USeArrayList after deletion: "+al2);

		System.out.println("Size of UseArrayList: "+al2.size());




	}

	private void remove(S ejb) {
	}

	private void addAll(UseArrayList<S> al) {
	}

	private void add(String java) {
	}

	private S size() {
		return null;
	}

}
