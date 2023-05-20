package com.example.zzan.stream.repository;

import com.example.zzan.stream.entity.Stream;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StreamRepository extends JpaRepository<Stream, Long> {
    List<Stream> findAllByOrderByCreatedAtDesc();
}
