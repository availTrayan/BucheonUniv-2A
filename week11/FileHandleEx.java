package week11;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.LineNumberReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.imageio.IIOException;

public class FileHandleEx {
	
	char arr[] = new char[100]; //100개의 문자열을 한번에 읽게
	
	void fileReaderEx() {
		
		FileReader reader = null;
		try {
			reader = new FileReader("c://exam.txt");
			while (true) {
				int data = reader.read(arr);
				if(data == -1)
					break;
				System.out.print(arr);;
			}
			reader.close();
		}
	catch(FileNotFoundException fnfe) {
		System.out.println("파일이 존재하지 않습니다.");
	}catch (IOException ioe) {
		System.out.println("파일을 읽을 수 없습니다.");
	}finally{
	}
	}
	
	
	void fileWriterEx(){
		
		FileWriter writer = null;
		try{
			writer = new FileWriter("c://output.dat");
			writer.write(arr);
			writer.close();
		}
		catch(IOException ioe){
			System.out.println("파일로 출력할 수 없습니다.");
		}
	}
	
	
	void fileOutputStreamEx(){
		FileOutputStream out = null;
		try{
			out = new FileOutputStream("c://output.txt");
			
			byte arr[] = {0,1,2,3,4,5,6,7,8,9
				,10, 11, 12, 13, 14, 15, 16, 17, 18, 19};
			
			for(int cnt=0; cnt < arr.length; cnt++)
				out.write(arr[cnt]);
			out.close();
			
		}catch(IOException ioe){
			System.out.println("파일로 출력할 수 없습니다.");
			}
		}
	
	void fileInputStreamEx(){
		FileInputStream in = null;
		try{
			in = new FileInputStream("c://output.dat");
			while(true){
				int num = in.read();
				if(num < 0)
					break;
				System.out.printf("%02c ", (char)num);
				System.out.println();
			}
		}catch(FileNotFoundException fnfe) {
			System.out.println("파일이 존재하지 않습니다.");
		}catch(IOException ioe) {
			System.out.println(" 파일을 읽을 수 없습니다.");
		}
	}
	
	void objectStreamEx(){
		ObjectOutputStream out = null;
		try{
			out = new ObjectOutputStream(new FileOutputStream("c://output.dat"));
			out.writeObject(new GregorianCalendar(2006, 0, 14));
			out.writeObject(new GregorianCalendar(2006, 0, 15));
			out.writeObject(new GregorianCalendar(2006, 0, 16));
			out.close();
		}catch(IOException ioe){
			System.out.println("파일로 출력할 수 없습니다.");
		}
	}
	
	void objectInputEx(){
		ObjectInputStream in = null;
		try{
			in = new ObjectInputStream(new FileInputStream("c://output.dat"));
			while(true){
				GregorianCalendar calendar = (GregorianCalendar)in.readObject();
				int year = calendar.get(Calendar.YEAR);
				int month = calendar.get(Calendar.MONTH);
				int date = calendar.get(Calendar.DATE);
				System.out.println(year + "/" + month + "/" + date);
			}
		}catch(IOException ioe){
			System.out.println("파일을 읽을 수 없습니다.");
		}catch (ClassNotFoundException cnfe) {
	            System.out.println("해당 클래스가 존재하지 않습니다.");
	        }
		}
	
	void lineNumberEx(){
		LineNumberReader reader = null;
		try{
			reader = new LineNumberReader(new FileReader("c://exam.txt"));
			while(true){
				String str = reader.readLine();
				if(str == null)
					break;
				int lineNo = reader.getLineNumber();
				System.out.println(lineNo + ": " + str);
			}
			reader.close();
		}catch (FileNotFoundException fnfe) {
			System.out.println("파일이 존재하지 않습니다.");
		}catch(IOException ioe){
			System.out.println("파일을 읽을 수 없습니다.");
		}
	}
	
	void formatPrintEx() {
		PrintWriter writer = null;
		try {
			writer = new PrintWriter("c://output.txt");
			writer.println("      ****성적표***   ");
			writer.printf("%3s: %3d %3d %3d %5.1f %n", "김지영", 92, 87, 95, 91.3f);
			writer.printf("%3s : %3d %3d %3d %5.1f %n", "최민재", 75, 88, 85, 82.7f);
			writer.printf("%3s: %3d %3d %3d %5.1f %n", "박현식", 100, 90, 88, 92.7f);
			writer.printf("작성일자: %1$ty년 %1$tm월 %1$td일", new GregorianCalendar());
			writer.close();
		}catch(IOException ioe){
			System.out.println("파일로 출력할 수 없습니다.");
		}
	}
	
	void fileEx(){
		File file = new File("c://");
		File arr[] = file.listFiles();
		for(int cnt = 0; cnt <arr.length; cnt++){
			String name = arr[cnt].getName();
			if(arr[cnt].isFile())
				System.out.printf("%-25s %7d", name, arr[cnt].length());
			else
				System.out.printf("%-25s <DIR> ", name);
			long time = arr[cnt].lastModified();
			GregorianCalendar calendar = new GregorianCalendar();
			calendar.setTimeInMillis(time);
			System.out.printf("%1$tF %1$tT %n", calendar);
		}
	}
	}