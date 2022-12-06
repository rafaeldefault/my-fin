package com.myfin.data.service;

import com.myfin.data.entity.SampleBook;
import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SampleBookRepository extends JpaRepository<SampleBook, UUID> {

}