package projetoa3;


public class InsertionSort {
    public static void main(String[] args) {
        String palavra = "ORDENA";
        char[] arr = palavra.toCharArray();
        insertionSort(arr);
        String palavraOrdenada = new String(arr);
        System.out.println("Palavra ordenada: " + palavraOrdenada);
    }

    public static void insertionSort(char[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            char chave = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > chave) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = chave;
        }
    }
}
