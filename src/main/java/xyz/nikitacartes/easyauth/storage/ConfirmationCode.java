package xyz.nikitacartes.easyauth.storage;

import java.time.ZonedDateTime;

public class ConfirmationCode {
    public String id; //uuid v4
    public String code; // 6 digits
    public ConfirmCodeActions type;
    public boolean used;
    public ZonedDateTime expiresAt;
}
