package adapter.task2;

import java.time.LocalDate;

public class FacebookClientWrapper implements Client{
    public FacebookClientWrapper(FacebookUser user) {
        this.user = user;
    }
    public FacebookUser user;

    @Override
    public String getEmail() {
        return user.getEmail();
    }

    @Override
    public String getCountry() {
        return user.getEmail();
    }

    @Override
    public LocalDate getLastDate() {
        return user.getGetUserActiveTime();
    }
}
