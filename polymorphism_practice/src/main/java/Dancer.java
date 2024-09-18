public class Dancer extends MusicAppUser {

    Dancer dancer = new Dancer();

    @Override
    public void playFirstSong() {
        System.out.println("선택하신 " + musicGenre + "의 " + musicTitle + "을 재생하겠습니다.");
        dancer.dancing();
    }


    @Override
    public void playSecondSong() {
        System.out.println("선택하신 " + musicGenre + "의 " + musicTitle + "을 재생하겠습니다.");
        dancer.dancing();
    }

    public void dancing(){
        System.out.println("Dancer는 노래를 들으며 흥이 오른 나머지 춤을 추기 시작합니다.");
    }
}
