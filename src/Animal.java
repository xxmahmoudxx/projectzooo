public class Animal {
    	String family;
	String name;
	int age;
	boolean isMammal;
public Animal (String family,String name,int age){
	this.family=family;
	this.name=name;
	this.age=age;
}
@Override
	public String toString(){
	return "la family de animale est "+family+" le name "+name+" est mammal ? "+isMammal+" l'age est "+age;
}

}
