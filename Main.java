public class Main {
    public static void main(String[] args) {
        // TODO: Use this method to run your experiments.
        FileReader fileReader = new FileReader();
        SortingAlgorithms sort = new SortingAlgorithms();

        // Reads the file and stores the records in an array
        Record records[] = fileReader.readFile(
                "C:\\Users\\Paul Ivan\\Desktop\\Codes\\Java\\starter_code_java\\starter_code_java\\data\\random100.txt");

        sort.quickSort(records, 0, records.length - 1);
        // sort.selectionSort(records, records.length);
        // sort.mergeSort(records, 0, records.length - 1);

        // Display the sorted records
        for (Record record : records) {
            System.out.println(record.getIdNumber() + " " + record.getName());
        }
    }
}
