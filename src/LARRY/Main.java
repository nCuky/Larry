package LARRY;

public class Main
{

    // Temporary for TESTING
    public static void main(String[] args) throws Exception
    {
        LarryDB LDB = new LarryDB();
        LDB.temp();



        /*
        if(args.length != 2) {
            System.err.println("Usage: <mrl> <seconds>");
            System.exit(1);
        }

        final String mrl = args[0];
        final int period = Integer.parseInt(args[1]) * 1000;

        MediaPlayerFactory factory = new MediaPlayerFactory(args);
        MediaPlayer mediaPlayer = factory.newHeadlessMediaPlayer();

        mediaPlayer.setSnapshotDirectory(new File(".").getAbsolutePath());

        // The sequence for creating the snapshots is...
        //
        // Start the media
        // Wait until playing
        // Loop...
        //  Set the target time
        //  Wait until the target time is reached
        //  Pause the media player
        //  Wait until paused
        //  Save the snapshot
        //  Wait until snapshot taken
        //  Play the media player
        //
        // The media player must be playing or else the required time changed events
        // will not be fired.

        try {
            Condition<?> playingCondition = new PlayingCondition(mediaPlayer) {
                @Override
                protected boolean onBefore() {
                    // You do not have to use onBefore(), but sometimes it is very convenient, and guarantees
                    // that the required media player event listener is added before your condition is tested
                    mediaPlayer.startMedia(mrl);
                    return true;
                }
            };
            playingCondition.await();

            long time = period;

            for(int i = 0; ; i++) {

                // Some special cases here...
                //
                // 1. The duration may not be available yet, even if the media player is playing
                // 2. For some media types it is not possible to set the position past the end - this
                //    means that you would have to wait for playback to reach the end normally
                long duration = mediaPlayer.getLength();
                if(duration > 0 && time >= duration) {
                    break;
                }

                System.out.println("Snapshot " + i);

                Condition<?> timeReachedCondition = new TimeReachedCondition(mediaPlayer, time) {
                    @Override
                    protected boolean onBefore() {
                        mediaPlayer.setTime(targetTime);
                        return true;
                    }
                };
                timeReachedCondition.await();

                Condition<?> pausedCondition = new PausedCondition(mediaPlayer) {
                    @Override
                    protected boolean onBefore() {
                        mediaPlayer.pause();
                        return true;
                    }
                };
                pausedCondition.await();

                Condition<?> snapshotTakenCondition = new SnapshotTakenCondition(mediaPlayer) {
                    @Override
                    protected boolean onBefore() {
                        mediaPlayer.saveSnapshot();
                        return true;
                    }
                };
                snapshotTakenCondition.await();

                playingCondition = new PlayingCondition(mediaPlayer) {
                    @Override
                    protected boolean onBefore() {
                        mediaPlayer.play();
                        return true;
                    }
                };
                playingCondition.await();

                time += period;
            }
        }
        catch(UnexpectedErrorConditionException e) {
            System.out.println("ERROR!");
        }
        catch(UnexpectedFinishedConditionException e) {
            System.out.println("FINISHED!");
        }

        System.out.println("All done");

        mediaPlayer.release();
        factory.release();
        
        */
    }

}
