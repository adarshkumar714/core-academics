package notes.unit3.LanguageEnhancement.SealedClass;

// import java.lang.*;

sealed class Human permits Manish, Vartika
{ 
	public void printName()
	{
		System.out.println("Default");
	}
}

non-sealed class Manish extends Human
{
	public void printName()
	{
		System.out.println("Manish Sharma");
	}
}

sealed class a permits b{

}

sealed class b extends a permits c{

}

final class c extends b{

}


sealed class Vartika extends Human permits Anjali
{
	public void printName()
	{
		System.out.println("Vartika Dadheech");
	}
}

final class Anjali extends Vartika
{
	public void printName()
	{
		System.out.println("Anjali Sharma");
	}
}

public class temp
{
	public static void main(String[] args)
	{ 
		Human h1 = new Anjali();
		Human h2 = new Vartika();
		Human h3 = new Manish();
		
		h1.printName();
		h2.printName();
		h3.printName();
	}
}
