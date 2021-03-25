package mode.bridgeMode;

import mode.bridgeMode.imageFormat.JPGImage;
import mode.bridgeMode.imageFormat.PNGImage;
import mode.bridgeMode.imageFormat.TIFImage;
import mode.bridgeMode.systemType.MacImpl;
import mode.bridgeMode.systemType.UnixImpl;
import mode.bridgeMode.systemType.WindowsImpl;

/**
 * @Author ws
 * @Date 2021/3/24 22:06
 * @Version 1.0
 */
public class MainClass {
    public static void main(String[] args) {
        Image pngImage =new PNGImage();
        pngImage.setImageImp(new WindowsImpl());
        pngImage.parseFile("aaa.bat");

        System.out.println();
        Image jpgImage =new JPGImage();
        jpgImage.setImageImp(new UnixImpl());
        jpgImage.parseFile("aaa.bat");

        System.out.println();
        Image tifImage =new TIFImage();
        tifImage.setImageImp(new MacImpl());
        tifImage.parseFile("aaa.bat");
    }
}
