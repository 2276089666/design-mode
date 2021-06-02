package mode.state.v2;

/**
 * @Author ws
 * @Date 2021/6/2 22:47
 */
public class Client {
    public static void main(String[] args) {
        /**
         * 对不同状态的举动cry,say,smile形式是固定的才适用,只有三种
         */
        GirlFriend girlFriend = new GirlFriend(new HappyState());
        girlFriend.cry();
        girlFriend.say();
        girlFriend.smile();

        System.out.println();
        girlFriend.setState(new SadState());
        girlFriend.cry();
        girlFriend.say();
        girlFriend.smile();
    }
}
