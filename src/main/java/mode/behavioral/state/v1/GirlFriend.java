package mode.behavioral.state.v1;

/**
 * 女朋友在不同的状态说话,笑,苦都不一样
 * 当增加新的状态时非常不方便
 */

public class GirlFriend {
    String name;
    private enum MMState {HAPPY, SAD}
    MMState state;

    public void smile() {
        //switch case

    }

    public void cry() {
        //switch case
    }

    public void say() {
        //switch case
    }
}
