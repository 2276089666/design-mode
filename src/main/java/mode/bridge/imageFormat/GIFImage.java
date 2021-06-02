package mode.bridge.imageFormat;

import mode.bridge.Image;
import mode.bridge.Matrix;

/**
 * @Author ws
 * @Date 2021/3/24 22:03
 * @Version 1.0
 */
public class GIFImage extends Image {
    @Override
    public void parseFile(String fileName) {
        fileName=fileName.replaceAll(".bat",".GIFImage");
        Matrix matrix = new Matrix(fileName);
        imp.doPaint(matrix);

    }
}
