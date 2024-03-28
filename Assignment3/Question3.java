package Assignment3;

import java.io.*;

public class Question3 {
	public static void main(String[] args){
		try {
			FileReader fr1 = new FileReader("D:\\New\\Read3.csv");
			BufferedReader br = new BufferedReader(fr1);
			String line;
			//Write
			String filePath = "D:\\New\\Countries_s.csv";
			File file = new File(filePath);
			file.createNewFile();
			FileWriter fw= new FileWriter(file,true);
			BufferedWriter buffWriter = new BufferedWriter(fw);
			
			while((line=br.readLine())!=null) {
				String[] countryCapValue=line.split(",");
				if(countryCapValue[0].charAt(0)=='S') {
					buffWriter.write(countryCapValue[0]+","+countryCapValue[1]+"\n");
					System.out.println("Appended Country and it's capital : "+countryCapValue[0]+","+countryCapValue[1]);
				}
			}
			buffWriter.close();
			fr1.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println("File doesn't exits at given location");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}