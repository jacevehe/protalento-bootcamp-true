package ar.com.educationit.domain;
import java.sql.Date;

public class ArticuloTest {

	public static void main(String[] args) {
		
		Articulo ar= new Articulo("Muñeco IronMan #1", new Date(0),"0001", 2500d,5,1l,1l );
		System.out.println(ar.toString());
	}

}
