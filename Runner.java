public class Runner {
    public static void main(String[] args) {
        Television tv1 = new Television(true, 50, 1, 70, 60, 80, false, false, false, 0);
        Television tv2 = new Television(false, 25, 3, 60, 50, 70, true, true, true, 0);
        Television tv3 = new Television(true, 40, 5, 80, 70, 90, false, false, true, 30);
        Television tv4 = new Television(false, 10, 2, 50, 40, 60, true, true, false, 0);
        Television tv5 = new Television(true, 60, 7, 90, 80, 100, false, true, true, 60);
        
        tv1.turnOn();
        tv2.turnOff();
        tv3.increaseVolume();
        tv4.decreaseVolume();
        tv5.setMuted(true);
    }
}

class Television {
    // Static variables (states)
    private static boolean powerOn;
    private static int volumeLevel;
    private static int currentChannel;
    private static int brightness;
    private static int contrast;
    private static int color;
    private static boolean muted;
    private static boolean pictureMode;
    private static boolean surroundSound;
    private static int sleepTimer;
    
	static {
		powerOn=true;
		volumeLevel=50;
		currentChannel=1;
		brightness=70;
		contrast=60;
		color=80;
		muted=false;
		pictureMode=false;
		surroundSound=false;
		sleepTimer=0;
	}
    
    public Television(boolean powerOn, int volumeLevel, int currentChannel, int brightness, int contrast,
                      int color, boolean muted, boolean pictureMode, boolean surroundSound, int sleepTimer) {
        Television.powerOn = powerOn;
        Television.volumeLevel = volumeLevel;
        Television.currentChannel = currentChannel;
        Television.brightness = brightness;
        Television.contrast = contrast;
        Television.color = color;
        Television.muted = muted;
        Television.pictureMode = pictureMode;
        Television.surroundSound = surroundSound;
        Television.sleepTimer = sleepTimer;
    }
    
    // behaviors
    public static void turnOn() {
        powerOn = true;
        System.out.println("TV turned on");
    }
    
    public static void turnOff() {
        powerOn = false;
        System.out.println("TV turned off");
    }
    
    public static void increaseVolume() {
        volumeLevel++;
        System.out.println("Volume increased to: " + volumeLevel);
    }
    
    public static void decreaseVolume() {
        if (volumeLevel > 0) {
            volumeLevel--;
            System.out.println("Volume decreased to: " + volumeLevel);
        } else {
            System.out.println("Volume is already at the minimum level");
        }
    }
	 public static void setMuted(boolean mute) {
        muted = mute;
        if (muted) {
            System.out.println("TV is muted");
        } else {
            System.out.println("TV is unmuted");
        }
    }
}
