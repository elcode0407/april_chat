package ru.geekbrains.chat_server.auth;

import ru.geekbrains.chat.client.network.MessageProcessor;

public interface AuthService {
    void start();
    void stop();
    String getUsernameByLoginAndPassword(String login, String password);
    String changeUsername(String oldName, String newName);
    String changePassword(String username, String oldPassword, String newPassword);

}
