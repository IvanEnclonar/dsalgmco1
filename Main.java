public class Main {
    public static void main(String[] args) {
        // TODO: Use this method to run your experiments.
        FileReader fileReader = new FileReader();
        SortingAlgorithms sort = new SortingAlgorithms();

        // Reads the file and stores the records in an array
        Record records[] = fileReader.readFile(
                "C:\\Users\\Paul Ivan\\Desktop\\Codes\\Java\\starter_code_java\\starter_code_java\\data\\random25000.txt");

        long startTime = System.currentTimeMillis();
        // sort.quickSort(records, 0, records.length - 1);
        sort.selectionSort(records, records.length);
        // sort.mergeSort(records, 0, records.length - 1);
        long endTime = System.currentTimeMillis();
        boolean isSorted = true;
        for (int i = 0; i < records.length - 1; i++) {
            if (records[i].getIdNumber() <= records[i + 1].getIdNumber()) {
            } else {
                isSorted = false;
                break;
            }
        }
        System.out.println("Time taken: " + (endTime - startTime) + "ms");
        System.out.println("Is sorted: " + isSorted);

        // Display the sorted records
        // for (Record record : records) {
        // System.out.println(record.getIdNumber() + " " + record.getName());
        // }
    }
}
