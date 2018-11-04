package spring.boot.services;

import org.datacontract.schemas._2004._07.TutoSoapWCFCSharp_Entities.Race;

public interface IConvertService {
	
	public String convertAnimalsTest(Race race);
	public String convertCsvToXlsx();
}
