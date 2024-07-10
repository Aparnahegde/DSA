static void per(char[] ar, int fi){
if(fi==ar.length-1){
  System.out.println(ar);
}
  for (int i=fi;i<ar.length;i++){
    swap(arr,i,fi);
    per(ar,fi+1);
    swap(arr,i,fi);
  }
}
static void swap(int[] arr,int i,int j){
  char temp=arr[i];
  arr[i]=arr[j];
  arr[j]=temp;
}
