package projetoa3;

public class ShellSort {
    public static void shellsort(char[] arr) {
        int n = arr.length;
        int h = 1;

        // Calcula o valor inicial de h
        while (h < n / 3) {
            h = 3 * h + 1;
        }

        while (h >= 1) {
            // Aplica a ordenação para o valor de h atual
            for (int i = h; i < n; i++) {
                for (int j = i; j >= h && arr[j] < arr[j - h]; j -= h) {
                    // Troca os elementos
                    char temp = arr[j];
                    arr[j] = arr[j - h];
                    arr[j - h] = temp;
                }
            }

            // Decrementa o valor de h
            h = h / 3;
        }
    }

    public static void main(String[] args) {
        char[] arr = {'O', 'R', 'D', 'E', 'N', 'A'};

        shellsort(arr);

        System.out.println("\nArray depois da ordenacao:");
        for (char c : arr) {
            System.out.print(c + " ");
        }
    }
}

