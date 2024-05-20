package com.sini.data_collector.domain.device.repository;

import com.sini.data_collector.domain.device.entity.Device;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DeviceRepository extends JpaRepository<Device, Long> {

}
