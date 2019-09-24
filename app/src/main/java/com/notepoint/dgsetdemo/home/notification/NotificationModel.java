package com.notepoint.dgsetdemo.home.notification;

class NotificationModel {
    private String notificationTitle;
    private String notificationMessage;

    public NotificationModel(String notificationTitle, String notificationMessage) {
        this.notificationTitle = notificationTitle;
        this.notificationMessage = notificationMessage;
    }

    public String getNotificationTitle() {
        return notificationTitle;
    }

    public void setNotificationTitle(String notificationTitle) {
        this.notificationTitle = notificationTitle;
    }

    public String getNotificationMessage() {
        return notificationMessage;
    }

    public void setNotificationMessage(String notificationMessage) {
        this.notificationMessage = notificationMessage;
    }
}
