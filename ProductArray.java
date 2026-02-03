public class ProductArray {
    public static void main(String[] args){
        int arr[] = {5,1,10,1};
        int productArr[] = new int[arr.length];

        int TotalProduct = 1;

        // calculate Total Product 
        for(int i=0; i<arr.length; i++){
            TotalProduct *= arr[i];
        }

        for(int i=0; i<productArr.length; i++){
            productArr[i] = TotalProduct / arr[i];
        }

        // print the Elements of the product array
        System.out.print("Product array : ");
        for(int i=0; i<productArr.length; i++){
            System.out.print(+productArr[i]+" ");
        }
        System.out.println();
    }
}
