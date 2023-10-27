package com.example.StartUpSync.service.interfaces;

import com.example.StartUpSync.entity.Request;

import java.util.List;

public interface RequestService {
    Request createRequest(Request request);
    Request findRequestById(Long requestId);
    List<Request> findAllRequests();
    Request updateRequest(Request request);
    void deleteRequest(Long requestId);
}
