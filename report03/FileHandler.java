//���Ͽ� ����� �����͸� �����ͺ��̽��� �����ϴ� ���α׷� �ۼ�
//���Ͽ� ����� ������ �й�, ����, �ּ�
//�й��� �̿��Ͽ� �˻�

package report03;

import java.io.FileWriter;
import java.sql.*;
import java.io.*;
import java.util.*;


public class FileHandler {
	
	void FileWriterEx(){
	
	FileWriter writer = null;
	
	try{
	writer = new FileWriter("E://�⼮��.txt");
	String[] starr = {"�й�:1233019 ", "����:����� ", "�ּ�:��⵵ ����� ����"};
	for(int cnt =0; cnt<starr.length; cnt++)
		writer.write(starr[cnt]);
	}
	catch(IOException ioe){
		System.out.println("���Ϸ� ����� �� �����ϴ�.");
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
