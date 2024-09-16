public class MusicApp {

    private boolean isTurnOnTheApp;
    private boolean isPlayMusic;

    public MusicApp(){};

    public void startApp(){
        if(isTurnOnTheApp){
            System.out.println("이미 어플이 켜져있습니다.");
        } else{
            isTurnOnTheApp = true;
            System.out.println("어플을 실행합니다. 듣고싶은 곡을 선택해주세요.");
        }
    }

    public void chooseFisrtSong(){
        if(isTurnOnTheApp){
            if(isPlayMusic){
                System.out.println("이미 곡을 선택하셨습니다.");
            } else{
                isPlayMusic = true;
                System.out.println("곡을 선택하셨습니다.");
            }
        } else{
            System.out.println("어플을 먼저 실행시켜주세요.");
        }
    }

    public void playFisrtSong(){
        if(isTurnOnTheApp){
            if(isPlayMusic){
                System.out.println("선택하신 곡을 재생하겠습니다.");
            } else{
                System.out.println("곡을 먼저 선택해주세요.");
            }
        } else{
            System.out.println("어플을 먼저 실행시켜주세요.");
        }
    }

    public void chooseSecondSong(){
        if(isTurnOnTheApp){
            if(isPlayMusic){
                isPlayMusic = false;
                System.out.println("곡을 선택하셨습니다.");
            } else{
                System.out.println("곡을 선택하셨습니다.");
            }
        }else{
            System.out.println("어플을 먼저 실행시켜주세요.");
        }
    }

    public void playSecondSong(){
        if(isTurnOnTheApp){
            if(isPlayMusic){
                // 아닌 것 같아 다시 해보기
                System.out.println("이미 노래를 재생시키고 있습니다.");
            } else{
                System.out.println("선택하신 곡을 재생하겠습니다.");
            }
        }
    }

}
