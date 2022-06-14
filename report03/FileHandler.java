//파일에 저장된 데이터를 데이터베이스에 저장하는 프로그램 작성
//파일에 저장된 형식은 학번, 성명, 주소
//학번을 이용하여 검색

package report03;

import java.io.FileWriter;
import java.sql.*;
import java.io.*;
import java.util.*;


public class FileHandler {
	
	void FileWriterEx(){
	
	FileWriter writer = null;
	
	try{
	writer = new FileWriter("E://출석부.txt");
	String[] starr = {"학번:1233019 ", "성명:안희용 ", "주소:경기도 시흥시 포동"};
	for(int cnt =0; cnt<starr.length; cnt++)
		writer.write(starr[cnt]);
	}
	catch(IOException ioe){
		System.out.println("파일로 출력할 수 없습니다.");
	}
	finally{
		try{
			writer.close();
		}
		catch (Exception e){
		}
	}
   }
}
