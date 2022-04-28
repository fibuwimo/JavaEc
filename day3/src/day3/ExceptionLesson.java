package day3;

import java.io.FileWriter;
import java.io.IOException;

public class ExceptionLesson {

	public static void main(String[] args) {

		FileWriter fw=null;
		try {
			fw=new FileWriter("data.txt");
			fw.write("hello");
		}catch(Exception e){
			System.out.println("何らかの例外発生");
		}finally {
			if(fw!=null) {
				try {
					fw.close();
				}catch(IOException e) {
					;
				}
			}
		}


		try(FileWriter fw2 =new FileWriter("data.txt");){
			fw2.write("hello2");
		}catch(Exception e) {
			System.out.println("何らかの例外発生");
		}

		String s =null;
		try {
			System.out.println(s.length());
		} catch (NullPointerException e1) {
			System.out.println("NullPointerException例外をキャッチ");
			System.out.println("--スタックトレースは(ここから)--");
			e1.printStackTrace();
			System.out.println("--スタックトレースは(ここまで)--");
		}

		try {
			int num=Integer.parseInt("三");
		} catch (NumberFormatException e1) {
			// TODO 自動生成された catch ブロック
			System.out.println("不正な引数です");
			e1.printStackTrace();
		}



		try {
			sleep();
		} catch (InterruptedException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}

	}

	static void sleep() throws InterruptedException{
		Thread.sleep(3000);
	}

}
