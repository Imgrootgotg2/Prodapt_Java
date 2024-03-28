package Assignment3;

import java.io.*;
import java.util.*;

public class Question2 {
	
	public static void main(String[] args) {
		Map<String,String> countryMap= new HashMap<String,String>();
		String country = null;
		String capital = null;
		File file = new File("D:\\New\\Country.csv");
		try {
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			String line;
			
			while((line=br.readLine())!=null) {
				String[] countryCapValue=line.split(",");
				countryMap.put(countryCapValue[0],countryCapValue[1]);
			}
			System.out.println(countryMap);
			fr.close();
			br.close();
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}
	}
}
