package com.ce.LostAndFoundManagement.LostAndFoundManagement.service;

public interface EmailService {
    void sendEmail(String to, String subject, String body);
}