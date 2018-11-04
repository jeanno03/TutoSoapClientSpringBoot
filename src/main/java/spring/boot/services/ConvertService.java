package spring.boot.services;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.datacontract.schemas._2004._07.TutoSoapWCFCSharp_Entities.Animal;
import org.datacontract.schemas._2004._07.TutoSoapWCFCSharp_Entities.Race;
import org.springframework.stereotype.Service;

import com.aspose.cells.SaveFormat;

@Service
public class ConvertService implements IConvertService{

	//Delimiters which has to be in the CSV file
	private static final String COMMA_DELIMITER = ",";
	private static final String LINE_SEPARATOR = "\n";

	//File header
	private static final String HEADER = "AnimalID,Name";

	//Method to convert a tab into a csv
	public String convertAnimalsTest(Race race) {

		Animal[] animals  = race.getAnimals();
		List <Animal> animalList  = new ArrayList<Animal>();

		System.out.println("Convert Animal[] animals to List <Animal> animalList");

		for(int i=0;i<animals.length;i++) {
			animalList.add(animals[i]);
		}

		FileWriter fileWriter = null;

		try 
		{
			fileWriter = new FileWriter("C://convert/Animals.csv");

			//Adding the header
			fileWriter.append(HEADER);
			//Adding the header
			fileWriter.append(LINE_SEPARATOR);

			//Iterate the List
			Iterator it = animalList.iterator();
			while(it.hasNext()) {
				Animal a = (Animal)it.next();
				fileWriter.append(String.valueOf(a.getAnimalId()));
				fileWriter.append(COMMA_DELIMITER);
				fileWriter.append(String.valueOf(a.getName()));
				fileWriter.append(LINE_SEPARATOR);

			}
			System.out.println("Write to CSV file Succeeded!!!");
		}
		catch(Exception ee) {
			ee.printStackTrace();
			return "error";
		}
		finally
		{
			try
			{
				fileWriter.close();
			}
			catch(IOException ie)
			{
				System.out.println("Error occured while closing the fileWriter");
				ie.printStackTrace();
				return "error";
			}

			return "success";
		}
	}

	//Method to convert csv to xlsx
	public String convertCsvToXlsx() {
		// Directory path for input and output files.
		String dirPath = "C:\\convert\\";

		// Load your sample CSV file inside the Workbook object.
		com.aspose.cells.Workbook wb;
		try {
			wb = new com.aspose.cells.Workbook(dirPath + "Animals.csv");
			// Save CSV file to XLSX format.
			wb.save(dirPath + "Animals.xlsx", SaveFormat.XLSX);
			return "success";
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return "error";
		}

	}

}
