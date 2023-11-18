package com.example.StartUpSync.controller;

import com.example.StartUpSync.entity.Request;
import com.example.StartUpSync.service.interfaces.RequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/request")
@CrossOrigin("http://localhost:3000")
public class RequestController {

    @Autowired
    private RequestService requestService;

    @PostMapping("/create")
    public ResponseEntity<Request> createRequest(@RequestBody Request request) {
        Request resp = requestService.createRequest(request);
        return new ResponseEntity<Request>(resp, HttpStatus.CREATED);
    }

    @GetMapping("/{requestId}")
    public ResponseEntity<Request> getRequestById(@PathVariable Long requestId) {
        Request resp = requestService.findRequestById(requestId);
        return new ResponseEntity<Request>(resp, HttpStatus.OK);
    }

    @GetMapping("/all")
    public ResponseEntity<List<Request>> getAllRequests() {
        List<Request> resp = requestService.findAllRequests();
        return new ResponseEntity<List<Request>>(resp, HttpStatus.OK);
    }

    @PutMapping("/update")
    public ResponseEntity<Request> updateRequest(@RequestBody Request request) {
        Request resp = requestService.updateRequest(request);
        return new ResponseEntity<Request>(resp, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{requestId}")
    public ResponseEntity<Long> deleteRequest(@PathVariable Long requestId) {
        requestService.deleteRequest(requestId);
        return new ResponseEntity<Long>(requestId, HttpStatus.NO_CONTENT);
    }
}
