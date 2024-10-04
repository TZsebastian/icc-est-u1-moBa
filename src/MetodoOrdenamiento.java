public class MetodoOrdenamiento {
    public int[] sortBubbleAva(int[] arreglo) {

        int n = arreglo.length;
        boolean intercambio = false;

        for (int i = 0; i < n; i++) {
            System.out.println("Pasada" + i);
            for (int j = 0; j < n-1-i; j++) {
                System.out.println("j=" + j + " [j]=" + arreglo[j] +
                "j+1=" + j+1 + "[j+1]=" + arreglo[j+1]);
                if(arreglo[j] > arreglo[j+1]) {
                    System.out.println("Si hay cambio");
                    //Intercambio 
                    int aux = arreglo[j];
                    arreglo[j] = arreglo[j+1];
                    arreglo[j+1] = aux;
                    intercambio = true;
                }
            }
            //Si no hay intercambio es porque ya esta ordenado
            if(!intercambio){
                break;
            }
        }
        return arreglo;
    }

    public void printArreglo(int[] arr) {
        for (int num : arr){
            System.out.print(num + " ");
        }
    }
}
