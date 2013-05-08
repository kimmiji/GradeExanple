public class Grading {

public static void main(String[] args) {
int[][] studentjonsu = 
{
{1,3,2,4,3,1,4,2,2,1}, 
{3,2,4,2,2,1,1,3,4,1}, 
{2,4,3,2,1,2,1,3,3,4}, 
{2,3,3,1,1,3,2,2,4,4}, 
{3,1,1,2,4,1,2,3,1,3} 
};

if ( args.length == 10 ) {
int[] jonsuUp = new int[studentjonsu.length];

for (int i=0; i < studentjonsu.length; i++) {
for ( int j=0; j < studentjonsu[0].length; j++) {
if ( studentjonsu[i][j] == Integer.parseInt(args[j]) ) {
jonsuUp[i]++;
}
} 
}
for ( int m=0; m < jonsuUp.length; m++) {
System.out.println("학생"+(m+1)+"의 점수 : " + jonsuUp[m]*10+"점");
}
} else {
System.out.println("정답의 갯수가 맞지 않습니다.");
}
}
}