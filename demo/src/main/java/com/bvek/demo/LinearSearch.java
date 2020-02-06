package com.bvek.demo;
public class LinearSearch
{

    private int[] theArray = new int[50];
    private int arraysize= 10;

    public void generateRandomArray(){
        for(int i =0 ; i<arraysize;i++){
            theArray[i]= (int)(Math.random()*10)+10;
        }
    }

    public void printArray(){
        System.out.println("<----------->");
        for(int i =0;i<arraysize;i++){
            System.out.print("|" + i + "|");
            System.out.println(theArray[i] + "|");
        }
        System.out.println("<----------->");
    }

public void LinearSearchForValue(int value){
    boolean valueInArray = false;
    String indexsWithValue = " ";
    System.out.print("The value was Found in the following:");

    for(int i = 0; i<arraysize;i++){
        if(theArray[i] ==value)
        {
            valueInArray= true;
            System.out.print(i + "");
            indexsWithValue+= i+"";
        }
       
    }
    if(!valueInArray){
        indexsWithValue = "None";
        System.out.print(indexsWithValue);
    }
 }

 public void bubbleSort()
 {  int temp;
     for (int i= arraysize-1;i>1;i--)
        {
            for(int j = 0;j<i;j++)
            {
                if(theArray[j]>theArray[j+1])
                {
                    temp =theArray[j];
                    theArray[j]= theArray[j+1];
                    theArray[j+1] = temp;

                }
            }
        }

        for(int i=0;i<arraysize;i++){
            System.out.print("|" + i + "|");
            System.out.println(theArray[i] + "|");
        }
        System.out.println("<----------->");

 }

 public void binarySearchForValue(int value)
 {
     int lowIndex = 0;
     int highIndex = arraysize-1;
     while (lowIndex<= highIndex)
     {
         int middleIndex = (highIndex + lowIndex)/2;
         if(theArray[middleIndex]<value)
         {
            
            lowIndex = middleIndex+1;
         }
         else if(theArray[middleIndex]>value)
         {
             highIndex= middleIndex -1;
         }
         else{
             System.out.println("\n Found a match for" + value + "at Index" + middleIndex);
             lowIndex = highIndex+1;
         }
         
     }
 }


 

 public void SelectionSort(){
    for (int i = 0; i < arraysize; i++) {
        int min = theArray[i];
        int minId = i;
        for (int j = i+1; j < arraysize; j++) {
            if (theArray[j] < min) {
                min = theArray[j];
                minId = j;
            }
        }
        // swapping
        int temp = theArray[i];
        theArray[i] = min;
        theArray[minId] = temp;
    }

    for(int i=0;i<arraysize;i++){
        System.out.print("|" + i + "|");
        System.out.println(theArray[i] + "|");
    }
    System.out.println("<----------->");



 }

 public void insertionSort(){
     for(int i= 1;i<arraysize;i++){
        int current = theArray[i];
            int j = i-1;
            while(j>=0 && current<theArray[j]){

                theArray[j+1] = theArray[j];
                j--;
                System.out.println(j);
            }
            theArray[j+1]=current;

     }

     
    for(int i=0;i<arraysize;i++){
        System.out.print("|" + i + "|");
        System.out.println(theArray[i] + "|");
    }
    System.out.println("<----------->");

       

 }

 




    public static void main(String[] args) {
        LinearSearch a = new LinearSearch();
        a.generateRandomArray();
       // a.printArray();
      //  a.LinearSearchForValue(17);
      // int [] arr = {23,5,6,8,1,25,4};
       // a.bubbleSort();
        //a.binarySearchForValue(17);
        //a.SelectionSort();
        a.insertionSort();



        
    }



}