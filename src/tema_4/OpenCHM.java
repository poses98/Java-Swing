package tema_4;

import java.awt.Desktop;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

class OpenCHM {
	public static void open(String path_chm_file) {
		// TODO Auto-generated constructor stub
		Path chmPath;
		try {
			chmPath = Files.createTempFile(null, ".chm");
			try (InputStream chmResource = ClassLoader.getSystemClassLoader().getResourceAsStream(path_chm_file)) {
			    Files.copy(chmResource, chmPath,StandardCopyOption.REPLACE_EXISTING);
			}
			Desktop.getDesktop().open(chmPath.toFile());
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}	
	}
}