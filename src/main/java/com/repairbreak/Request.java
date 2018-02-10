package com.repairbreak;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Request {
    private Date opened;
    private Date closed;
    private String status;
    private Map<Date, String> history = new HashMap<>();

    public Request() {
        opened = new Date();
        status = "open";
        history.put(opened, status);
    }

    public Date getOpened() {
        return opened;
    }

    public Date getClosed() {
        return closed;
    }

    public String getStatus() {
        return status;
    }

    public void setClosed() {
        closed = new Date();
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Map<Date, String> getHistory() {
        return history;
    }

    public void addHistory(String event) {
        history.put(new Date(), event);
    }
}
