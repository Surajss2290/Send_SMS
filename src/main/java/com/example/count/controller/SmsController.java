package com.example.count.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.count.model.SendRequest;
import com.example.count.service.TwilioService;

@RestController
public class SmsController {

    @Autowired
    private TwilioService twilioService;

    @PostMapping("/send-sms")
    public String sendSms(@RequestBody SendRequest request) {
        twilioService.sendSms(request.getTo(),request.getMessage());
        return "SMS sent successfully!";
    }
}
