package vn.edu.rikkei.session11.ex03;

public class Main {
    public static void main(String[] args) {

        SmartSpeaker speaker =
                new SmartSpeaker("Rikkei Echo Dot");

        System.out.println("+-------------------------------------------------------+");
        System.out.println("|          NHẬT KÝ ĐIỀU KHIỂN LOA THÔNG MINH           |");
        System.out.println("+-------------------------------------------------------+");

        System.out.printf("| Thiết bị: %-43s|%n",
                speaker.getDeviceName());

        System.out.println("|-------------------------------------------------------|");

        speaker.playAudio("Sơn Tùng M-TP - Lạc Trôi");
        speaker.recordVoice(60);

        System.out.println("+-------------------------------------------------------+");
    }
}
