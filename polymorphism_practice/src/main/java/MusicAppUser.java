import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;
public class MusicAppUser {

    private boolean isOn;
    protected int musicGenre;
    protected int musicTitle;


    public void startApp(){
        System.out.println("뮤직 어플을 실행합니다.");
    };

    public void chooseFirstSong(){

        Scanner sc = new Scanner(System.in);
        System.out.println("  ======== Genre List ========  ");
        System.out.println("          1. 발라드             ");
        System.out.println("          2. 힙합               ");
        System.out.println("          3. OST / BGM         ");
        System.out.println("  ===========================  ");
        System.out.println("듣고 싶은 곡의 장르를 선택해주세요. : ");
        this.musicGenre = sc.nextInt();

        if(musicGenre == 1){

            System.out.println("  ============== Play List ==============  ");
            System.out.println("             1. 성시경 - 두 사람             ");
            System.out.println("             2. 바이브 - 오래오래               ");
            System.out.println("         3. 거미 - 친구라도 될 걸 그랬어         ");
            System.out.println("  =======================================  ");
            System.out.println("첫 번째 곡을 선택하여 주세요 : ");
            this.musicTitle = sc.nextInt();

        } else if(musicGenre == 2){

            System.out.println("  ============== Play List ==============  ");
            System.out.println("         1. 에픽하이 - Love Love Love             ");
            System.out.println("           2. 이영지 - Small Girl              ");
            System.out.println("          3. 다이나믹듀오 - 죽일 놈        ");
            System.out.println("  =======================================  ");
            System.out.println("첫 번째 곡을 선택하여 주세요 : ");
            this.musicTitle = sc.nextInt();

        } else if(musicGenre == 3){

            System.out.println("  ============== Play List ==============  ");
            System.out.println("             1. 지브리 OST 모음             ");
            System.out.println("            2. 외국 영화 OST 모음             ");
            System.out.println("             3. 디즈니 OST 모음       ");
            System.out.println("  =======================================  ");
            System.out.println("첫 번째 곡을 선택하여 주세요 : ");
            this.musicTitle = sc.nextInt();

        } else{
            System.out.println("위의 항목에서 골라주세요.");
        }
    };

    public void playFirstSong(){
        System.out.println("선택하신 " + this.musicGenre + "의 " + this.musicTitle + "을 재생하겠습니다.");
    };

    public void chooseSecondSong(){
        Scanner sc = new Scanner(System.in);
        System.out.println("  ======== Genre List ========  ");
        System.out.println("          1. 발라드             ");
        System.out.println("          2. 힙합               ");
        System.out.println("          3. OST / BGM         ");
        System.out.println("  ===========================  ");
        System.out.println("듣고 싶은 곡의 장르를 선택해주세요. : ");
        musicGenre = sc.nextInt();

        if(musicGenre == 1){

            System.out.println("  ============== Play List ==============  ");
            System.out.println("             1. 성시경 - 두 사람             ");
            System.out.println("             2. 바이브 - 오래오래               ");
            System.out.println("         3. 거미 - 친구라도 될 걸 그랬어         ");
            System.out.println("  =======================================  ");
            System.out.println("첫 번째 곡을 선택하여 주세요 : ");
            musicTitle = sc.nextInt();

        } else if(musicGenre == 2){

            System.out.println("  ============== Play List ==============  ");
            System.out.println("         1. 에픽하이 - Love Love Love             ");
            System.out.println("           2. 이영지 - Small Girl              ");
            System.out.println("          3. 다이나믹듀오 - 죽일 놈        ");
            System.out.println("  =======================================  ");
            System.out.println("첫 번째 곡을 선택하여 주세요 : ");
            musicTitle = sc.nextInt();

        } else if(musicGenre == 3) {

            System.out.println("  ============== Play List ==============  ");
            System.out.println("             1. 지브리 OST 모음             ");
            System.out.println("            2. 외국 영화 OST 모음             ");
            System.out.println("             3. 디즈니 OST 모음       ");
            System.out.println("  =======================================  ");
            System.out.println("첫 번째 곡을 선택하여 주세요 : ");
            musicTitle = sc.nextInt();
        }
    };


    public void playSecondSong(){
        System.out.println("선택하신 " + musicGenre + "의 " + musicTitle + "을 재생하겠습니다.");
    };

    public void stopSong(){
        System.out.println("재생 중인 " + musicTitle + "을 정지했습니다.");
    };

    public void finishApp(){
        System.out.println("어플을 종료합니다.");
    };

}
