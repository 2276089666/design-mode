package mode.structuralType.bridge;

/**
 * @Author ws
 * @Date 2021/3/24 21:25
 * @Version 1.0
 */
public abstract class Image {
    /**
     * 注意一定要是protected,让其子类可见
     */
    protected ImageImp imp;

    public void setImageImp(ImageImp imageImp) {
        this.imp = imageImp;
    }
    public abstract void parseFile(String fileName);
}
