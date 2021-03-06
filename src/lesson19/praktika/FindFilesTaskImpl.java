package lesson19.praktika;

import java.io.File;
import java.io.FileFilter;
import java.io.FileNotFoundException;
import java.io.PrintStream;

public class FindFilesTaskImpl extends TaskImpl implements FindFilesTask {
    private String directory;
    private String searchString;
    private PrintStream out;
    @Override
    public void setDirectory(String directory) throws NullPointerException, FileNotFoundException {
        if (directory == null){
            throw new NullPointerException("Dyrectory is null!!!");
        }
        File dir = new File(directory);
        if(!dir.exists()){
            throw new FileNotFoundException("Такой папки не существует");
        }
        this.directory = directory;
    }


    @Override
    public void setFileNameSearchString(String searchString) throws IllegalArgumentException {

        if (searchString == null){
            throw new IllegalArgumentException("searchString is null!!!");
        }

        this.searchString = searchString;
    }

    @Override
    public void setPrintStream(PrintStream out) {
        this.out = out;
    }

    @Override
    public void execute() throws TaskExecutionFailedException {
        File dir = new File(directory);
        File[] filesFromDir = dir.listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                String fileName = pathname.getName();
                int getIndex = fileName.indexOf(searchString);
                if(getIndex == -1){
                    return false;
                }

                return false;
            }
        });

        for (File f: filesFromDir) {
            out.println(f.getAbsolutePath());
        }


    }
}
