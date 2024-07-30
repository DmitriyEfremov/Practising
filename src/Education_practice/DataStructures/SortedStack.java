package Education_practice.DataStructures;




public class SortedStack extends StackBasedWithArray {
    public SortedStack(){
        super();
    }
    @Override
    public void put(char value){
        if(isFull()){
            extend();
        }
        if(isEmpty()){
            data[++pointer]=value;
        }else{
            int currentIndex = pointer;
            while (currentIndex > -1 && data[currentIndex] > value) {
                data[currentIndex+1] = data[currentIndex];
                currentIndex--;
            }
            data[++currentIndex] = value;
            pointer++;
        }
    }
}
