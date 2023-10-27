package com.example.StartUpSync.service;

import com.example.StartUpSync.entity.Request;
import com.example.StartUpSync.repository.RequestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RequestService implements com.example.StartUpSync.service.interfaces.RequestService{
    @Autowired
    private RequestRepository requestRepository;

    public Request createRequest(Request request) {
        return requestRepository.save(request);
    }

    public Request findRequestById(Long requestId) {
        return requestRepository.findById(requestId).orElse(null);
    }

    public List<Request> findAllRequests() {
        return requestRepository.findAll();
    }

    public Request updateRequest(Request request) {
        return requestRepository.save(request);
    }

    public void deleteRequest(Long requestId) {
        requestRepository.deleteById(requestId);
    }
}
