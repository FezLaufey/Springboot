package com.example.demo;
import org.springframework.data.jpa.repository.JpaRepository;

import org.*;

public interface MessageRepository extends JpaRepository<Message, Integer> {
}
