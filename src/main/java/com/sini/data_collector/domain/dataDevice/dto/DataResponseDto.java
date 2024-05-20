package com.sini.data_collector.domain.dataDevice.dto;

import java.time.LocalDateTime;
import lombok.Getter;

@Getter
public class DataResponseDto {

    private Long stationGroupId;
    private String serialNumber;
    private LocalDateTime createdAt;

    public DataResponseDto(Long stationGroupId, String serialNumber, LocalDateTime createdAt) {
        this.stationGroupId = stationGroupId;
        this.serialNumber = serialNumber;
        this.createdAt = createdAt;
    }
}
