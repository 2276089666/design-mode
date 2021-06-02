package mode.state.v2;

/**
 * @Author ws
 * @Date 2021/6/2 22:43
 */
public class GirlFriend {
    private State state;

    public GirlFriend(State state) {
        this.state = state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void smile() {
        state.smile();
    }

    public void cry() {
        state.cry();
    }

    public void say() {
        state.say();
    }
}
