package com.example.demo.service;
import org.springframework.stereotype.Service;
@Service

public class CalculadoraService {

    public int sumar(int a, int b) {
        return a + b;
    }
 public int restar(int a, int b) {
        return a - b;
 }
}
