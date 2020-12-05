class Test1 {
    public static void main(String []args) {
        int arr[] = new int[]{1,5,100,20,30};

        int max=arr[0], max2=arr[0];
        
        for(int i=1; i<arr.length; i++) {
        //setting max
        if(arr[i] > max ) {
            max = arr[i];
        }

        //setting max2
        if(arr[i-1] > max2) {
            if(arr[i-1]< max) {
            max2 = arr[i-1];
            }
        }

        }

        if(arr[arr.length-1]  > max2) {
        if(arr[arr.length-1]< max) {
            max2 = arr[arr.length-1];
        }
        }

        System.out.println("Test java file");
        System.out.println("max : "+ max+" and max2 : "+ max2);
    }
}