/** Implementation of Merge sort in java */
import java.util.Arrays;

public class MergeSort {

	public static void main(String[] args) {
		int [] vetor = {4, 6, 7, 3, 5, 1, 2, 8};
		int [] aux = new int [vetor.length];
		
		System.out.println("Disorderly Array: " + Arrays.toString(vetor));
		
		merge(vetor, aux, 0, vetor.length-1);
		System.out.print("Sorted Array: " + Arrays.toString(vetor));
	}

	public static void merge(int[] vetor, int[] aux, int ini, int fim) {
		if(ini < fim){
			int meio = (ini + fim) / 2;
			merge(vetor, aux, ini, meio);
			merge(vetor, aux, meio+1, fim);
			intervalo(vetor, aux, ini, meio, fim);
		}
	}

	public static void intervalo(int[] vetor, int[] aux, int ini, int meio, int fim) {
		for (int i = ini; i <= fim; i++) {
			aux[i] = vetor[i];
			
		}
		
		int j = ini;
		int k = meio + 1;
		
		for (int i = ini; i <= fim; i++) {
			if(j > meio) {
				vetor[i] = aux[k++];
			}else if(k > fim) {
				vetor[i] = aux[j++];
			}else if(aux[j] < aux[k]) {
				vetor[i] = aux[j++];
			}else {
				vetor[i] = aux[k++];
			}
		}
	}
}
