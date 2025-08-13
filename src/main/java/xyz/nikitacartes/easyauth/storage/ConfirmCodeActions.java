package xyz.nikitacartes.easyauth.storage;

public enum ConfirmCodeActions {
    EMAIL_CONFIRMATION("email_confirmation"),
    PASSWORD_RESET("password_reset");

    private  final String value;

    ConfirmCodeActions(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    public static ConfirmCodeActions fromString(String text) {
        for (ConfirmCodeActions c : ConfirmCodeActions.values()) {
            if (c.value.equals(text)) {
                return c;
            }
        }

        throw new IllegalArgumentException("Unknown action: " + text);
    }
}
