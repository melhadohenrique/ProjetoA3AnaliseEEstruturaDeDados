package projetoa3;

public class SelectionSort {
     public static void selectionSort(char[] array) {
        int n = array.length;
        
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            
            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            
            char temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
    }
    
    public static void main(String[] args) {
        String palavra = "ORDENA";
        char[] arr = palavra.toCharArray();
        selectionSort(arr);
        String palavraOrdenada = new String(arr);
        System.out.println("Palavra ordenada: " + palavraOrdenada);
    }
}
