package vn.edu.rikkei.session11.ex03;

public class SmartSpeaker implements IPlayable, IRecordable {

    private String deviceName;

    public SmartSpeaker(String deviceName) {
        this.deviceName = deviceName;
    }

    public String getDeviceName() {
        return deviceName;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    @Override
    public void playAudio(String trackName) {
        System.out.println(
                "| [Playable] Đang phát bài hát: " + trackName
        );
    }

    @Override
    public void recordVoice(int durationSeconds) {
        System.out.println(
                "| [Recordable] Đang ghi âm giọng nói trong: "
                        + durationSeconds + " giây"
        );
    }
}
