package mode.bridgeMode.imageFormat;

import mode.bridgeMode.Image;
import mode.bridgeMode.Matrix;

/**
 * @Author ws
 * @Date 2021/3/24 22:03
 * @Version 1.0
 */
public class GIFImage extends Image {
    @Override
    public void parseFile(String fileName) {
        System.out.println(fileName+"====>GIFImage");
        System.out.println("----------on----------");
        Matrix matrix = new Matrix();
        imp.doPaint(matrix);

    }
}
