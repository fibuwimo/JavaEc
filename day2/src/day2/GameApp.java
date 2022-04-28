package day2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;

public class GameApp {

	public static void main(String[] args) {

		System.out.println("****乱数ゲーム****");
		String file ="scores.csv";
		int max = 100000;
		Scanner scan =new Scanner(System.in);
		Random rand=new Random();
		boolean isHS=false;
		HighScore hs = readFile(file);
		int highScore;
		if(hs==null) {
			System.out.println("HighScore 0");
			highScore=0;
		}else {
			System.out.println("HighScore "+hs);
			highScore=hs.getScore();
		}
		while(true) {
			System.out.print("やりますかyes…y no…n>");
			String select=scan.next();
			if(select.equals("n")) {
				System.out.println("アプリを終了します");
				if(isHS) {
					Date now=new Date();
					SimpleDateFormat sdf=new SimpleDateFormat("yyyy/MM/dd");
					String date=sdf.format(now);
					hs=new HighScore(highScore,date);
					writeFile(file,hs);
				}
				break;
			}
			int num=rand.nextInt(100000)+1;
			System.out.println(num);
			if(num > highScore) {
				highScore=num;
				isHS=true;
				System.out.println("new Record");
			}
		}
	}

	public static HighScore readFile(String file) {
		HighScore hs=null;
		try {
			FileInputStream fis = new FileInputStream(file);
			InputStreamReader isr=new InputStreamReader(fis,"utf-8");
			BufferedReader br = new BufferedReader(isr);
			String line = br.readLine();
			if(line!=null && !line.equals("")) {
				String[] data = line.split(",");
				hs=new HighScore(Integer.parseInt(data[0]),data[1]);
			}

		}catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return hs;

	}

	public static void writeFile(String file,HighScore hs) {
		BufferedWriter bw=null;
		try {
			FileOutputStream fos=new FileOutputStream(file);
			OutputStreamWriter osw=new OutputStreamWriter(fos,"UTF-8");
			bw=new BufferedWriter(osw);
			bw.append(hs.toCSV());
			bw.flush();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();

		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			if(bw !=null) {
				try {
					bw.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
class HighScore {
	int score;
	String date;
	public HighScore(int score,String date) {
		this.score=score;
		this.date=date;
	}
	public String toCSV() {
		return this.score+","+this.date;
	}
	public int getScore() {
		return this.score;
	}
	public String toString() {
		return this.score+" "+this.date;
	}

}

