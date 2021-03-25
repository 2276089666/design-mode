package mode.bridgeMode.imageFormat;

import mode.bridgeMode.Image;
import mode.bridgeMode.Matrix;

public class TIFImage extends Image {
    @Override
    public void parseFile(String fileName) {
        System.out.println(fileName+"====>TIFImage");
        System.out.println("----------on----------");
        Matrix matrix = new Matrix();
        imp.doPaint(matrix);
    }
}
