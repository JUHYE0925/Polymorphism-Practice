import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        Dancer dancer = new Dancer();
        Singer singer = new Singer();
        Student student = new Student();

        MusicApp[] user = new MusicApp[3];
        user[0] = new Dancer();
        user[1] = new Singer();
        user[2] = new Student();

        Scanner sc = new Scanner(System.in);
        System.out.println("당신의 계정을 선택해주세요 : ");
        System.out.println(" 1. Dancer / 2. Singer / 3. Student ");
        int account = sc.nextInt();

        if(account == 1) {
            while (true) {
                System.out.println("================ 노래 듣기 프로그램 ================");
                System.out.println("1. 어플 켜기");
                System.out.println("2. 첫 번째 곡 선택하기");
                System.out.println("3. 첫 번째 곡 실행하기");
                System.out.println("4. 곡 정지하기");
                System.out.println("5. 어플 종료하기");
                System.out.println("9. 프로그램 종료하기");
                System.out.println("메뉴 선택 : ");
                int num = sc.nextInt();

                switch (num) {
                    case 1:
                        dancer.startApp();
                        break;
                    case 2:
                        dancer.chooseFisrtSong();
                        break;
                    case 3:
                        dancer.playFisrtSong();
                        break;
                    case 4:
                        dancer.stopTheSong();
                        break;
                    case 5:
                        dancer.finishTheApp();
                        break;
                    case 9:
                        System.out.println("프로그램을 종료합니다.");
                        break;
                    default:
                        System.out.println("잘못된 번호를 선택하셨습니다.");
                        break;
                }
                if (num == 9) {
                    break;
                }
            }
        } else if(account == 2){
            while (true) {
                System.out.println("================ 노래 듣기 프로그램 ================");
                System.out.println("1. 어플 켜기");
                System.out.println("2. 첫 번째 곡 선택하기");
                System.out.println("3. 첫 번째 곡 실행하기");
                System.out.println("4. 곡 정지하기");
                System.out.println("5. 어플 종료하기");
                System.out.println("9. 프로그램 종료하기");
                System.out.println("메뉴 선택 : ");
                int num = sc.nextInt();

                switch (num) {
                    case 1:
                        singer.startApp();
                        break;
                    case 2:
                        singer.chooseFisrtSong();
                        break;
                    case 3:
                        singer.playFisrtSong();
                        break;
                    case 4:
                        singer.stopTheSong();
                        break;
                    case 5:
                        singer.finishTheApp();
                        break;
                    case 9:
                        System.out.println("프로그램을 종료합니다.");
                        break;
                    default:
                        System.out.println("잘못된 번호를 선택하셨습니다.");
                        break;
                }
                if (num == 9) {
                    break;
                }
            }
        } else if(account == 3){
            while (true) {
                System.out.println("================ 노래 듣기 프로그램 ================");
                System.out.println("1. 어플 켜기");
                System.out.println("2. 첫 번째 곡 선택하기");
                System.out.println("3. 첫 번째 곡 실행하기");
                System.out.println("4. 곡 정지하기");
                System.out.println("5. 어플 종료하기");
                System.out.println("9. 프로그램 종료하기");
                System.out.println("메뉴 선택 : ");
                int num = sc.nextInt();

                switch (num) {
                    case 1:
                        student.startApp();
                        break;
                    case 2:
                        student.chooseFisrtSong();
                        break;
                    case 3:
                        student.playFisrtSong();
                        break;
                    case 4:
                        student.stopTheSong();
                        break;
                    case 5:
                        student.finishTheApp();
                        break;
                    case 9:
                        System.out.println("프로그램을 종료합니다.");
                        break;
                    default:
                        System.out.println("잘못된 번호를 선택하셨습니다.");
                        break;
                }
                if (num == 9) {
                    break;
                }
            }
        } else{
            System.out.println("위의 세 계정 중에서 골라 선택해주세요.");
        }
    }
}
