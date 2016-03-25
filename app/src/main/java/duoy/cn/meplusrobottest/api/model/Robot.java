package duoy.cn.meplusrobottest.api.model;

import android.os.Parcelable;

import com.avos.avoscloud.AVClassName;
import com.avos.avoscloud.AVObject;

@AVClassName("Robot")
public class Robot extends AVObject {
    private static final String TAG = Robot.class.getSimpleName();
    public static final Parcelable.Creator CREATOR = AVObjectCreator.instance;
    public final static String KEY_ROBOT_ID = "robotId";
    public final static String KEY_ROBOT_NAME = "robotName";
    public final static String KEY_ROBOT_DESCRIPTION = "robotDescription";

    public String getRobotId() {
        return getString(KEY_ROBOT_ID);
    }

    public void setRobotId(String robotId) {
        put(KEY_ROBOT_ID, robotId);
    }

    public String getRobotName() {
        return getString(KEY_ROBOT_NAME);
    }

    public void setRobotName(String robotName) {
        put(KEY_ROBOT_NAME, robotName);
    }

    public String getRobotDescription() {
        return getString(KEY_ROBOT_DESCRIPTION);
    }

    public void setRobotDescription(String robotDescription) {
        put(KEY_ROBOT_DESCRIPTION, robotDescription);
    }

   /* public static void queryByRobotId(String robotId) {
        Observable.just(robotId)
                .subscribeOn(Schedulers.io())
                .observeOn(Schedulers.io())
                .map(id -> {
                    List<Robot> list = null;
                    AVQuery<Robot> query = Robot.getQuery(Robot.class);
                    query.whereEqualTo(Robot.KEY_ROBOT_ID, id);
                    try {
                        list = query.find();
                    } catch (AVException e) {
                        Observable.error(e);
                    }
                    return list;
                })
                .subscribe(
                        result -> EventBus.getDefault().post(new QueryEvent<>(Event.STATUS_OK, result)),
                        throwable -> EventBus.getDefault().post(new ErrorEvent(Event.STATUS_OK, throwable))
                );
    }

    @DebugLog
    public void saveRotot() {
        Observable.just(this)
                .subscribeOn(Schedulers.io())
                .observeOn(Schedulers.io())
                .subscribe(
                        robot -> {
                            robot.saveEventually();
                            EventBus.getDefault().post(new SaveEvent<>(Event.STATUS_OK, robot));
                        },
                        throwable -> EventBus.getDefault().post(new ErrorEvent(Event.STATUS_OK, throwable))
                );
    }*/

}