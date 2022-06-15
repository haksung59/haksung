package Week1;
import java.util.ArrayList;
import java.util.List;

public class fifthStudy {

    public static void main(String[] args) {
        int[][] input = new int[][] {{1,0,1,1,1}, {1,0,1,0,1}, {1,0,1,1,1}, {1,1,1,0,1}, {0,0,0,0,1}};

        System.out.println(solution(input));

    }

    public static int solution(int[][] maps) {
        int answer = 0;

        int n = maps[0].length-1;
        int m = maps.length-1;

        List<int[]> characters = new ArrayList<>();
        characters.add(new int[] {0,0});
        boolean finish = true;

        int[] moveRight = new int[] {1,0};
        int[] moveLeft = new int[] {-1,0};
        int[] moveTop = new int[] {0,-1};
        int[] moveBottom = new int[] {0,1};

        List<int[]> before = new ArrayList<>();
        before.add(new int[] {0,0});

        if(maps[0][0]==1) answer++;

        while(finish) {
            int size = characters.size();
            for(int i=0; i<size; i++) {
                int[] current = characters.get(i);
                int count = 0;

                if(checkMove(current, moveRight, maps, n, m, before.get(i))==1) {
                    count++;
                    characters.set(i, move(current, moveRight));
                }else if(checkMove(current, moveRight, maps, n, m, before.get(i))==2) {
                    finish = false;
                    break;
                }

                if(checkMove(current, moveLeft, maps, n, m, before.get(i))==1) {
                    count++;
                    if(count>1) {
                        before.add(current);
                        characters.add(move(current, moveLeft));
                    }else {
                        characters.set(i, move(current, moveLeft));
                    }
                }else if(checkMove(current, moveLeft, maps, n, m, before.get(i))==2) {
                    finish = false;
                    break;
                }

                if(checkMove(current, moveTop, maps, n, m, before.get(i))==1) {
                    count++;
                    if(count>1) {
                        before.add(current);
                        characters.add(move(current, moveTop));
                    }else {
                        characters.set(i, move(current, moveTop));
                    }
                }else if(checkMove(current, moveTop, maps, n, m, before.get(i))==2) {
                    finish = false;
                    break;
                }

                if(checkMove(current, moveBottom, maps, n, m, before.get(i))==1) {
                    count++;
                    if(count>1) {
                        before.add(current);
                        characters.add(move(current, moveBottom));
                    }else {
                        characters.set(i, move(current, moveBottom));
                    }
                }else if(checkMove(current, moveBottom, maps, n, m, before.get(i))==2) {
                    finish = false;
                    break;
                }

                before.set(i, current);

                if(count<1 && finish) {
                    return -1;
                }


            }
            answer++;

        }

        return answer;
    }



    public static int checkMove(int[] position, int[] move, int[][] maps, int n, int m, int[] before){
        int result = 0;

        if(position[0]+move[0]>n || position[1]+move[1]>m ||
                position[0]+move[0]<0 || position[1]+move[1]<0) return 0;

        int x = position[0]+move[0];
        int y = position[1]+move[1];

        result = maps[y][x];

        if(x==n && y==m) result =2;
        if(before[0]==x && before[1]==y) result =0;
        return result;
    }

    public static int[] move(int[] position, int[] move) {
        int x = position[0]+move[0];
        int y = position[1]+move[1];

        return new int[] {x,y};
    }

}
