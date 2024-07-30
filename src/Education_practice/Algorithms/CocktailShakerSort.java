package Education_practice.Algorithms;

public class CocktailShakerSort {

    public int[] sort(int[] inputData){
        int bottom = 0, top= inputData.length;
        boolean rightToLeft=true;
        while (bottom<inputData.length/2+1){
            if(rightToLeft){
                for(int i=top-1;i>bottom;i--){
                    if(inputData[i]<inputData[i-1]){
                        int buffer=inputData[i];
                        inputData[i]=inputData[i-1];
                        inputData[i-1]=buffer;
                    }
                }
                bottom++;
                rightToLeft=false;
            }else{
                for(int i=bottom;i<top-1;i++){
                    if(inputData[i]>inputData[i+1]){
                        int buffer=inputData[i];
                        inputData[i]=inputData[i+1];
                        inputData[i+1]=buffer;
                    }
                }
                top--;
                rightToLeft=true;
            }
        }

        return inputData;

    }
}
