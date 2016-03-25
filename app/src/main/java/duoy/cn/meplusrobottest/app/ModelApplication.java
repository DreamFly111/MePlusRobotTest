package duoy.cn.meplusrobottest.app;


import duoy.cn.meplusrobottest.api.model.Robot;

/**
 * Created by dandanba on 3/1/16.
 */
public class ModelApplication extends BaseApplication {

    private Robot mRobot;

    @Override
    public void onCreate() {
        super.onCreate();
    }

    public void setRobot(Robot robot) {
        mRobot = robot;
    }

    public Robot getRobot() {
        return mRobot;
    }
}
