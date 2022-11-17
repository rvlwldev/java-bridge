package bridge.Message;

public enum GameMessage {
    GAME_START("다리 건너기 게임을 시작합니다.\n"),
    GET_USER_INPUT_BRIDGE_SIZE("다리의 길이를 입력해주세요.");

    private final String message;

    GameMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
