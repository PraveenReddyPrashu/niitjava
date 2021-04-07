package fileio;

import java.io.File;

public class CreateDirDemo extends File {
	public static void main(String[] args) {
		String dirPath = "c:\\dxc";
		try {
			File d = new File(dirPath);
			d.mkdir();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}