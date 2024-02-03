package structuralComposite;

public class Main {
    public static void main(String[] args){
        FileSystemComponent file1 = new File("Document.txt");
        FileSystemComponent file2 = new File("Image.jpg");
        FileSystemComponent file3 = new File("Image2.jpg");


        Directory rootDirectory = new Directory("Root");
        Directory documentsDirectory = new Directory("Documents");
        documentsDirectory.addComponent(file1);
        Directory imagesDirectory = new Directory("Images");
        imagesDirectory.addComponent(file2);
        imagesDirectory.addComponent(file3);

        rootDirectory.addComponent(documentsDirectory);
        rootDirectory.addComponent(imagesDirectory);


        rootDirectory.showDetails("");
    }
}
