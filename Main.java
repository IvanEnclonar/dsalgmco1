public class Main {
    public static void main(String[] args) {
        // TODO: Use this method to run your experiments.
        System.out.println("Hello worlds");

        FileReader fileReader = new FileReader();
        SortingAlgorithms sort = new SortingAlgorithms();

        Record records[] = fileReader.readFile(
                "C:\\Users\\Paul Ivan\\Desktop\\Codes\\Java\\starter_code_java\\starter_code_java\\data\\random100.txt");

        sort.mergeSort(records, 0, records.length - 1);
        for (Record record : records) {
            System.out.println(record.getIdNumber() + " " + record.getName());
        }

        // sort.insertionSort(records, records.length);s
        // sort.selectionSort(records, records.length);
    }
}
