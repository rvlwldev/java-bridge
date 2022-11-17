package bridge.View;

import static bridge.Message.GameMessage.GAME_START;
import static bridge.Message.GameMessage.GET_USER_INPUT_BRIDGE_SIZE;

/**
 * 사용자에게 게임 진행 상황과 결과를 출력하는 역할을 한다.
 * (추가) InputView의 부모클래스가 된다. InputView에서 입력을 받을때 관련된 메세지를 출력한다.
 */
public class OutputView {
    public void start() {
        System.out.println(GAME_START.getMessage());
    }

    public void printGetUserBridgeSize() {
        System.out.println(GET_USER_INPUT_BRIDGE_SIZE.getMessage());
    }

    /**
     * 현재까지 이동한 다리의 상태를 정해진 형식에 맞춰 출력한다.
     * <p>
     * 출력을 위해 필요한 메서드의 인자(parameter)는 자유롭게 추가하거나 변경할 수 있다.
     */
    public void printMap() {
    }

    /**
     * 게임의 최종 결과를 정해진 형식에 맞춰 출력한다.
     * <p>
     * 출력을 위해 필요한 메서드의 인자(parameter)는 자유롭게 추가하거나 변경할 수 있다.
     */
    public void printResult() {
    }
}
