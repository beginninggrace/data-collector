package com.sini.data_collector.domain.dataDevice.entity;

import com.sini.data_collector.domain.dataDevice.dto.DataRequestDto;
import com.sini.data_collector.domain.dataDevice.dto.DataResponseDto;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DataDeviceGroup {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long dataDeviceGroupId;
    @Column(nullable = false)
    private String serialNumber;
    @Column(nullable = false)
    private LocalDateTime createdAt;


    public DataDeviceGroup(DataRequestDto dataRequestDto) {
        this.serialNumber = dataRequestDto.getStationGroupSerial();
        this.createdAt = LocalDateTime.now();
    }
}
