package com.sini.data_collector.domain.dataDevice.repository;

import com.sini.data_collector.domain.dataDevice.entity.DataDeviceGroup;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DataDeviceRepository extends JpaRepository<DataDeviceGroup, Long> {

}
