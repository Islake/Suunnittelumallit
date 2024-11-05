package visitor;

public class Main {
    public static void main(String[] args) {
        // Create files
        File file1 = new File("file1.txt", 10);
        File file2 = new File("file2.jpg", 20);
        File file3 = new File("file3.txt", 30);

        // Create directories
        Directory dir1 = new Directory("dir1");
        Directory dir2 = new Directory("dir2");

        // Add files to directories
        dir1.addElement(file1);
        dir1.addElement(file2);
        dir2.addElement(file3);
        dir1.addElement(dir2);

        // Create visitors
        SizeCalculatorVisitor sizeCalculator = new SizeCalculatorVisitor();
        SearchVisitor searchVisitor = new SearchVisitor(".txt");

        // Apply visitors
        dir1.accept(sizeCalculator);
        dir1.accept(searchVisitor);

        // Print results
        System.out.println("Total size: " + sizeCalculator.getTotalSize() + " MB");
        System.out.println("Matching files:");
        for (File file : searchVisitor.getMatchingFiles()) {
            System.out.println(file.getName());
        }
    }
}