package ProgII.Lista11;

/*
    Artur Nilson
*/

import java.io.File;
import java.io.IOException;

public interface IRelatorio {
    public void load(File file) throws IOException;

    public String show();

    public String showBestStore();

    public void save(File file) throws IOException;
}
