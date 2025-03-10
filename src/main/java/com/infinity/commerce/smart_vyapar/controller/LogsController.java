package com.infinity.commerce.smart_vyapar.controller;

import com.infinity.commerce.smart_vyapar.entity.InventoryTransaction;
import com.infinity.commerce.smart_vyapar.service.LoggingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController()
@RequestMapping("/logs")
public class LogsController {
    @Autowired
    LoggingService loggingService;

    @GetMapping("/health-check")
    public ResponseEntity<Boolean> getHealthStatus(){
        return ResponseEntity.status(HttpStatus.OK).body(true);
    }
    @GetMapping("/get/{id}")
    public ResponseEntity<?> readLogsById(@PathVariable Long id) {
        InventoryTransaction inventoryTransaction = loggingService.readLogsById(id);
        //if logs are not present
        if (inventoryTransaction != null) {
            return ResponseEntity.status(HttpStatus.OK).body(inventoryTransaction);
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Invalid Id");
        }
    }
    @PostMapping("/add")
    public ResponseEntity<?> addLogs(@RequestBody InventoryTransaction inventoryTransaction){
        loggingService.addLogs(inventoryTransaction);
        return ResponseEntity.status(HttpStatus.CREATED).body(inventoryTransaction);
    }
}
