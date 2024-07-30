package JeffEriksonAlgorithms;

public class LatticeMultiplying {
    private String first, second;
    public LatticeMultiplying(int first, int second){
        this.first = first+"";
        this.second = second+"";
    }
    public int multiply(){
        StringBuilder sb = new StringBuilder();
        int temp=0;
        int index = (first).length()+(second).length()-1;
        for(int k=index-1;k>-1;k--) {

            for (int i=first.length()-1;i>-1;i--) {
                for(int j=second.length()-1;j>-1;j--){
                    if(i+j==k){
                        System.out.println(first.charAt(i)+" "+second.charAt(j));
                        temp+=Integer.parseInt(first.charAt(i)+"")*Integer.parseInt(second.charAt(j)+"");
                    }
                }
            }
            System.out.println("temp="+temp);
            sb.append(temp%10);
            temp/=10;
        }
        return Integer.parseInt(sb.reverse()+"");
    }
}
