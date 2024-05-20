package com.sini.data_collector.domain.dataRecord.repository;

import com.sini.data_collector.domain.dataRecord.entity.DataRecord;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DataRecordRepository extends JpaRepository<DataRecord, Long> {

}
