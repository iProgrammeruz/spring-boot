package com.clean.code.springboot.repository;

import com.clean.code.springboot.domain.FileStorage;
import com.clean.code.springboot.domain.FileStorageStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FileStorageRepository extends JpaRepository<FileStorage, Long> {

    FileStorage findByHashId(String hashId);

    FileStorage findAllByFileStorageStatus(FileStorageStatus status);
}
