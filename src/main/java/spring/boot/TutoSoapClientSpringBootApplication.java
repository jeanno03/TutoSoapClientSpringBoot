package spring.boot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.tempuri.IService1Proxy;

import spring.boot.services.IConvertService;

@SpringBootApplication
public class TutoSoapClientSpringBootApplication implements CommandLineRunner{

	@Autowired
	IConvertService iConvertService;

	public static void main(String[] args) {
		SpringApplication.run(TutoSoapClientSpringBootApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		//*********Warning before start the app you need to create the folder C:\\convert\\**************		

		// TODO Auto-generated method stub
		System.out.println("*******************************");
		System.out.println("*********App start ************");
		System.out.println("*******************************");

		System.out.println("********* Invok Service Soap Start ************");

		IService1Proxy stub = new IService1Proxy();
		org.datacontract.schemas._2004._07.TutoSoapWCFCSharp_Entities.Race race = stub.getRaceExample();
		org.datacontract.schemas._2004._07.TutoSoapWCFCSharp_Entities.Animal[] animals  = race.getAnimals();

		for(int i=0;i<animals.length;i++) {
			System.out.println("Nom animal ("+i+") : " + animals[i].getName()); 
		}

		System.out.println("********* Invok Service Soap End ************");

		String result01 = iConvertService.convertAnimalsTest(race);

		System.out.println("Result of conversion List to csv :" +result01);

		System.out.println("*******************************");
		System.out.println("********* Now we use apose to convert csv to xslx ************");

		String result02 = iConvertService.convertCsvToXlsx();

		System.out.println("Result of conversion cvs to xlsx :" +result02);
		System.out.println("*******************************");

		System.out.println("The 2 files are created into C:\\convert\\");

		System.out.println("*******************************");
		System.out.println("*********App end ************");
		System.out.println("*******************************");


	}
}
