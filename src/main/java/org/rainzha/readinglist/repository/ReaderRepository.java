package org.rainzha.readinglist.repository;

import org.rainzha.readinglist.domain.Reader;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReaderRepository extends JpaRepository<Reader, String> {
}
