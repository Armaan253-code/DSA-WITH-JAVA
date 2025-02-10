class linearsearch{
    public static int search(int arr[], int key){
        int length=arr.length;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                return i;
            }
        }
        return -1;

    }
    public static void main(String args[]){
        int arr[]={2,4,6,8,10};
        int key=8;
        
        
        int index=search(arr, key);
        if(index==-1){
            System.out.print("Not found");
        }else{
            System.out.print("searching is successfully at index "+search(arr, key));
        }
        
        
    }
}