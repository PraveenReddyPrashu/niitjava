package fileio;

import java.io.File;
public class ListDirDemo {
	public static void main(String[] args) {
		String dir="c:\\";
		try {
			File f = new File(dir);
			String[] directories;
			directories = f.list();
			for(String path: directories) {
				System.out.println(path);
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}