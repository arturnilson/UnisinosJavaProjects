package ProgII.Lista11;

import java.io.File;
import java.io.IOException;

public interface IRelatorio {
    public void load(File file) throws IOException;

    public void show();

    public void showBestStore();

    public void save(File file) throws IOException;
}
