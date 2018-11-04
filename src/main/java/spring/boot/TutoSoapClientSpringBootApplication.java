package spring.boot;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.tempuri.IService1Proxy;

@SpringBootApplication
public class TutoSoapClientSpringBootApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(TutoSoapClientSpringBootApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("*******************************");
		System.out.println("*********App start ************");
		System.out.println("*******************************");
		
		IService1Proxy stub = new IService1Proxy();
		org.datacontract.schemas._2004._07.TutoSoapWCFCSharp_Entities.Race race = stub.getRaceExample();
		org.datacontract.schemas._2004._07.TutoSoapWCFCSharp_Entities.Animal[] animals  = race.getAnimals();
		
		for(int i=0;i<animals.length;i++) {
			System.out.println("Nom animal ("+i+") : " + animals[i].getName()); 
		}
		
		System.out.println("*******************************");
		System.out.println("*********App end ************");
		System.out.println("*******************************");
		
		
	}
}
